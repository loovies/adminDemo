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
import com.ruoyi.decarbonization.domain.WmsMaterialInfo;
import com.ruoyi.decarbonization.service.IWmsMaterialInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物料档案Controller
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@RestController
@RequestMapping("/material/materialInfo")
public class WmsMaterialInfoController extends BaseController
{
    @Autowired
    private IWmsMaterialInfoService wmsMaterialInfoService;

    /**
     * 查询物料档案列表
     */

    @GetMapping("/list")
    public TableDataInfo list(WmsMaterialInfo wmsMaterialInfo)
    {
        startPage();
        List<WmsMaterialInfo> list = wmsMaterialInfoService.selectWmsMaterialInfoList(wmsMaterialInfo);
        return getDataTable(list);
    }

    /**
     * 导出物料档案列表
     */
    @PreAuthorize("@ss.hasPermi('MaterialInfo:info:export')")
    @Log(title = "物料档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WmsMaterialInfo wmsMaterialInfo)
    {
        List<WmsMaterialInfo> list = wmsMaterialInfoService.selectWmsMaterialInfoList(wmsMaterialInfo);
        ExcelUtil<WmsMaterialInfo> util = new ExcelUtil<WmsMaterialInfo>(WmsMaterialInfo.class);
        util.exportExcel(response, list, "物料档案数据");
    }

    /**
     * 获取物料档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('MaterialInfo:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(wmsMaterialInfoService.selectWmsMaterialInfoById(id));
    }

    /**
     * 新增物料档案
     */
    @PreAuthorize("@ss.hasPermi('MaterialInfo:info:add')")
    @Log(title = "物料档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WmsMaterialInfo wmsMaterialInfo)
    {
        return toAjax(wmsMaterialInfoService.insertWmsMaterialInfo(wmsMaterialInfo));
    }

    /**
     * 修改物料档案
     */
    @PreAuthorize("@ss.hasPermi('MaterialInfo:info:edit')")
    @Log(title = "物料档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WmsMaterialInfo wmsMaterialInfo)
    {
        return toAjax(wmsMaterialInfoService.updateWmsMaterialInfo(wmsMaterialInfo));
    }

    /**
     * 删除物料档案
     */
    @PreAuthorize("@ss.hasPermi('MaterialInfo:info:remove')")
    @Log(title = "物料档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wmsMaterialInfoService.deleteWmsMaterialInfoByIds(ids));
    }
}
