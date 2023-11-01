package com.ruoyi.web.controller.carbon;

import com.ruoyi.carbon.domain.EnergyCollect;
import com.ruoyi.carbon.domain.dto.EnergyCollectPageDto;
import com.ruoyi.carbon.service.EnergyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.Result;
import com.ruoyi.common.core.page.PageResult;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/energyCollect")
public class EnergyController extends BaseController {


    @Autowired
    private EnergyService energyService;

    @GetMapping("/list")
    public TableDataInfo getPageList(EnergyCollectPageDto ecoDto){
        startPage();
//        PageResult pageResult = energyService.pagelist(ecoDto);
        List<EnergyCollect> pageResult = energyService.pagelist(ecoDto);
        return getDataTable(pageResult);
    }
}
 