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
import com.ruoyi.decarbonization.domain.MesProductModel;
import com.ruoyi.decarbonization.service.IMesProductModelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产品建模Controller
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@RestController
@RequestMapping("/mesModel/productModel")
public class MesProductModelController extends BaseController
{
    @Autowired
    private IMesProductModelService mesProductModelService;

    @Autowired
    private IWmsMaterialInfoService materialInfoService;
    /**
     * 查询产品建模列表
     */
    @PreAuthorize("@ss.hasPermi('productModel:model:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesProductModel mesProductModel)
    {
        startPage();
        List<MesProductModel> list = mesProductModelService.selectMesProductModelList(mesProductModel);
        list.stream().forEach(model ->{
            WmsMaterialInfo wmsMaterialInfo = materialInfoService.selectWmsMaterialInfoById(model.getMaterialId());
            model.setProductName(wmsMaterialInfo.getName());
            model.setProductModel(wmsMaterialInfo.getModel());
            model.setProductSpecification(wmsMaterialInfo.getSpecification());
            model.setProductUnit(wmsMaterialInfo.getUnit());
        });
        return getDataTable(list);
    }

    /**
     * 导出产品建模列表
     */
    @PreAuthorize("@ss.hasPermi('productModel:model:export')")
    @Log(title = "产品建模", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesProductModel mesProductModel)
    {
        List<MesProductModel> list = mesProductModelService.selectMesProductModelList(mesProductModel);
        ExcelUtil<MesProductModel> util = new ExcelUtil<MesProductModel>(MesProductModel.class);
        util.exportExcel(response, list, "产品建模数据");
    }

    /**
     * 获取产品建模详细信息
     */
    @PreAuthorize("@ss.hasPermi('productModel:model:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        MesProductModel model = mesProductModelService.selectMesProductModelById(id);
        WmsMaterialInfo wmsMaterialInfo = materialInfoService.selectWmsMaterialInfoById(model.getMaterialId());
        model.setProductName(wmsMaterialInfo.getName());
        model.setProductModel(wmsMaterialInfo.getModel());
        model.setProductSpecification(wmsMaterialInfo.getSpecification());
        model.setProductUnit(wmsMaterialInfo.getUnit());
        return success(model);
    }

    /**
     * 新增产品建模
     */
    @PreAuthorize("@ss.hasPermi('productModel:model:add')")
    @Log(title = "产品建模", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesProductModel mesProductModel)
    {
        return toAjax(mesProductModelService.insertMesProductModel(mesProductModel));
    }

    /**
     * 修改产品建模
     */
    @PreAuthorize("@ss.hasPermi('productModel:model:edit')")
    @Log(title = "产品建模", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesProductModel mesProductModel)
    {
        return toAjax(mesProductModelService.updateMesProductModel(mesProductModel));
    }

    /**
     * 删除产品建模
     */
    @PreAuthorize("@ss.hasPermi('productModel:model:remove')")
    @Log(title = "产品建模", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesProductModelService.deleteMesProductModelByIds(ids));
    }
}
