package com.ruoyi.web.controller.decarbonization;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.decarbonization.domain.WmsMaterialCategory;
import com.ruoyi.decarbonization.service.IWmsMaterialCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物料分类Controller
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@RestController
@RequestMapping("/material/materialCategory")
public class WmsMaterialCategoryController extends BaseController
{
    @Autowired
    private IWmsMaterialCategoryService wmsMaterialCategoryService;

    /**
     * 查询物料分类列表
     */

    @GetMapping("/list")
    public TableDataInfo list(WmsMaterialCategory wmsMaterialCategory)
    {
        wmsMaterialCategory.setId(0L);
        startPage();
        List<WmsMaterialCategory> list = wmsMaterialCategoryService.selectWmsMaterialCategoryList(wmsMaterialCategory);
        System.out.println(list);
        return getDataTable(list);
    }

    /**
     * 导出物料分类列表
     */
    @Log(title = "物料分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WmsMaterialCategory wmsMaterialCategory)
    {
        List<WmsMaterialCategory> list = wmsMaterialCategoryService.selectWmsMaterialCategoryList(wmsMaterialCategory);
        ExcelUtil<WmsMaterialCategory> util = new ExcelUtil<WmsMaterialCategory>(WmsMaterialCategory.class);
        util.exportExcel(response, list, "物料分类数据");
    }

    /**
     * 获取物料分类详细信息
     */

    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(wmsMaterialCategoryService.selectWmsMaterialCategoryById(id));
    }

    /**
     * 新增物料分类
     */

    @Log(title = "物料分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WmsMaterialCategory wmsMaterialCategory)
    {
        return toAjax(wmsMaterialCategoryService.insertWmsMaterialCategory(wmsMaterialCategory));
    }

    /**
     * 修改物料分类
     */

    @Log(title = "物料分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WmsMaterialCategory wmsMaterialCategory)
    {
        return toAjax(wmsMaterialCategoryService.updateWmsMaterialCategory(wmsMaterialCategory));
    }

    /**
     * 删除物料分类
     */

    @Log(title = "物料分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wmsMaterialCategoryService.deleteWmsMaterialCategoryByIds(ids));
    }
}
