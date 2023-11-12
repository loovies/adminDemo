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
import com.ruoyi.decarbonization.domain.MesProductBom;
import com.ruoyi.decarbonization.service.IMesProductBomService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产品BOM单Controller
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@RestController
@RequestMapping("/mesPlan/mesBom")
public class MesProductBomController extends BaseController
{
    @Autowired
    private IMesProductBomService mesProductBomService;

    /**
     * 查询产品BOM单列表
     */
    @GetMapping("/list")
    public TableDataInfo list(MesProductBom mesProductBom)
    {
        startPage();
        List<MesProductBom> list = mesProductBomService.selectMesProductBomList(mesProductBom);
        return getDataTable(list);
    }

    /**
     * 导出产品BOM单列表
     */
    @PreAuthorize("@ss.hasPermi('system:bom:export')")
    @Log(title = "产品BOM单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesProductBom mesProductBom)
    {
        List<MesProductBom> list = mesProductBomService.selectMesProductBomList(mesProductBom);
        ExcelUtil<MesProductBom> util = new ExcelUtil<MesProductBom>(MesProductBom.class);
        util.exportExcel(response, list, "产品BOM单数据");
    }

    /**
     * 获取产品BOM单详细信息
     */
    @GetMapping("/{id}")
    public AjaxResult getInfo(@PathVariable Long id)
    {
        return success(mesProductBomService.selectMesProductBomById(id));
    }

    /**
     * 新增产品BOM单
     */
    @PreAuthorize("@ss.hasPermi('system:bom:add')")
    @Log(title = "产品BOM单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesProductBom mesProductBom)
    {
        System.out.println("+++++++++++");
        System.out.println("+++++++++++");
        System.out.println("+++++++++++");
        System.out.println(mesProductBom);
        return toAjax(mesProductBomService.insertMesProductBom(mesProductBom));
    }

    /**
     * 修改产品BOM单
     */
    @PreAuthorize("@ss.hasPermi('system:bom:edit')")
    @Log(title = "产品BOM单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesProductBom mesProductBom)
    {
        return toAjax(mesProductBomService.updateMesProductBom(mesProductBom));
    }

    /**
     * 删除产品BOM单
     */
    @PreAuthorize("@ss.hasPermi('system:bom:remove')")
    @Log(title = "产品BOM单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesProductBomService.deleteMesProductBomByIds(ids));
    }
}
