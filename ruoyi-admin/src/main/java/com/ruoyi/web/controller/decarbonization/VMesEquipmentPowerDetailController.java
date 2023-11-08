package com.ruoyi.web.controller.decarbonization;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.decarbonization.domain.VMesEquipmentPowerDetail;
import com.ruoyi.decarbonization.service.ICfConfigNeutralService;
import com.ruoyi.decarbonization.service.IVMesEquipmentPowerDetailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carbonReport/equipmentPowerReport")
public class VMesEquipmentPowerDetailController extends BaseController {

    @Autowired
    private IVMesEquipmentPowerDetailService vMesEquipmentPowerDetailService;

    @Autowired
    private ICfConfigNeutralService cfConfigNeutralService;
    /**
     * 查询VIEW列表
     */
    @GetMapping("/list")
    @ApiOperation("查询VIEW列表")
    public TableDataInfo list(VMesEquipmentPowerDetail vMesEquipmentPowerDetail)
    {
        startPage();
        List<VMesEquipmentPowerDetail> list = vMesEquipmentPowerDetailService.selectVMesEquipmentPowerDetailList(vMesEquipmentPowerDetail);

        double ratio = cfConfigNeutralService.getElectricCo2();

        list.stream().forEach(power ->{
                double powerConsume = power.getPowerConsume() == null ? 0 : power.getPowerConsume();
                double n = power.getRequireQuantity()!=null ? power.getRequireQuantity() : 0;
                power.setTotalPowerConsume(Math.round(powerConsume * n));
                double totalConsume = power.getTotalPowerConsume() == null ? 0 : power.getTotalPowerConsume();
                //单位碳排放
                double carbon = powerConsume * ratio;

                //总和碳排放
                double totalCarbon = totalConsume * ratio;

                power.setCarbonEmission(carbon);
                power.setTotalCarbonEmission(totalCarbon);
        });
        return getDataTable(list);
    }
}
