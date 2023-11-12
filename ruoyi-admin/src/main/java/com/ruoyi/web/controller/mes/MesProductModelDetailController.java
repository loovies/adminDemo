package com.ruoyi.web.controller.mes;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.decarbonization.domain.WmsMaterialInfo;
import com.ruoyi.decarbonization.service.IWmsMaterialInfoService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.decarbonization.domain.MesProductModelDetail;
import com.ruoyi.decarbonization.service.IMesProductModelDetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产品模型明细Controller
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@RestController
@RequestMapping("/mesModel/productModelDetail")
public class MesProductModelDetailController extends BaseController
{
    @Autowired
    private IMesProductModelDetailService mesProductModelDetailService;

    @Autowired
    private IWmsMaterialInfoService iWmsMaterialInfoService;
    /**
     * 查询产品模型明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesProductModelDetail mesProductModelDetail)
    {
        startPage();
        List<MesProductModelDetail> list = mesProductModelDetailService.selectMesProductModelDetailList(mesProductModelDetail);
        return getDataTable(list);
    }

    /**
     * 导出产品模型明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:export')")
    @Log(title = "产品模型明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesProductModelDetail mesProductModelDetail)
    {
        List<MesProductModelDetail> list = mesProductModelDetailService.selectMesProductModelDetailList(mesProductModelDetail);
        ExcelUtil<MesProductModelDetail> util = new ExcelUtil<MesProductModelDetail>(MesProductModelDetail.class);
        util.exportExcel(response, list, "产品模型明细数据");
    }

    /**
     * 获取产品模型明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:detail:query')")
    @GetMapping(value = "/{id}")
    public TableDataInfo getInfo(@PathVariable("id") Long id)
    {
        List<MesProductModelDetail> list = mesProductModelDetailService.selectMesProductModelDetailById(id);
        list.stream().forEach(modeld ->{
            WmsMaterialInfo wmsMaterialInfo = iWmsMaterialInfoService.selectWmsMaterialInfoById(modeld.getMaterialId());
            modeld.setMaterialCode(wmsMaterialInfo.getCode());
            modeld.setMaterialName(wmsMaterialInfo.getName());
            modeld.setMaterialModel(wmsMaterialInfo.getModel());
            modeld.setRemark(wmsMaterialInfo.getRemark());
            modeld.setMaterialSpecification(wmsMaterialInfo.getSpecification());
            modeld.setMaterialUnit(wmsMaterialInfo.getUnit());
        });
        return getDataTable(list);
    }

    /**
     * 新增产品模型明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:add')")
    @Log(title = "产品模型明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesProductModelDetail mesProductModelDetail)
    {
        return toAjax(mesProductModelDetailService.insertMesProductModelDetail(mesProductModelDetail));
    }

    /**
     * 修改产品模型明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:edit')")
    @Log(title = "产品模型明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesProductModelDetail mesProductModelDetail)
    {
        return toAjax(mesProductModelDetailService.updateMesProductModelDetail(mesProductModelDetail));
    }

    /**
     * 删除产品模型明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:remove')")
    @Log(title = "产品模型明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesProductModelDetailService.deleteMesProductModelDetailByIds(ids));
    }
}
