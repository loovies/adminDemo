package com.ruoyi.web.controller.mes;

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
import com.ruoyi.decarbonization.domain.MesProductBomDetail;
import com.ruoyi.decarbonization.service.IMesProductBomDetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * BOM单明细Controller
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@RestController
@RequestMapping("/mesPlan/nesBomDetail")
public class MesProductBomDetailController extends BaseController
{
    @Autowired
    private IMesProductBomDetailService mesProductBomDetailService;

    /**
     * 查询BOM单明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesProductBomDetail mesProductBomDetail)
    {
        startPage();
        List<MesProductBomDetail> list = mesProductBomDetailService.selectMesProductBomDetailList(mesProductBomDetail);
        return getDataTable(list);
    }

    /**
     * 导出BOM单明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:export')")
    @Log(title = "BOM单明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesProductBomDetail mesProductBomDetail)
    {
        List<MesProductBomDetail> list = mesProductBomDetailService.selectMesProductBomDetailList(mesProductBomDetail);
        ExcelUtil<MesProductBomDetail> util = new ExcelUtil<MesProductBomDetail>(MesProductBomDetail.class);
        util.exportExcel(response, list, "BOM单明细数据");
    }

    /**
     * 获取BOM单明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:detail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        List<MesProductBomDetail> mesProductBomDetail = mesProductBomDetailService.selectMesProductBomDetailById(id);
        return success(mesProductBomDetail);
    }

    /**
     * 新增BOM单明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:add')")
    @Log(title = "BOM单明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesProductBomDetail mesProductBomDetail)
    {
        return toAjax(mesProductBomDetailService.insertMesProductBomDetail(mesProductBomDetail));
    }

    /**
     * 修改BOM单明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:edit')")
    @Log(title = "BOM单明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesProductBomDetail mesProductBomDetail)
    {
        return toAjax(mesProductBomDetailService.updateMesProductBomDetail(mesProductBomDetail));
    }

    /**
     * 删除BOM单明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:remove')")
    @Log(title = "BOM单明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesProductBomDetailService.deleteMesProductBomDetailByIds(ids));
    }
}
