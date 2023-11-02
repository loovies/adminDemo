package com.ruoyi.web.controller.carbon;

import com.ruoyi.carbon.domain.Facility;
import com.ruoyi.carbon.domain.dto.FacilityPageDto;
import com.ruoyi.carbon.service.FacilityService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/facility")
public class FacilityController extends BaseController {

    @Autowired
    private FacilityService facilityService;

    @GetMapping("/list")
    public TableDataInfo getPageList(FacilityPageDto facilityPageDto){
        startPage();
        System.out.println();
        List<Facility> facilityList = facilityService.getPageList(facilityPageDto);
        return getDataTable(facilityList);
    }

    @DeleteMapping("/{id}")
    public AjaxResult delList(@PathVariable Long id){
        return toAjax(facilityService.delInfoById(id));
    }

    @PutMapping
    public AjaxResult updateList(@RequestBody Facility facility){
        return toAjax(facilityService.updateinfo(facility));
    }

    @PostMapping
    public AjaxResult addList(@RequestBody Facility facility){
        return toAjax(facilityService.addinfo(facility));
    }

    @GetMapping("/{id}")
    public AjaxResult getListById(@PathVariable Long id){

        return AjaxResult.success(facilityService.getListById(id));
    }
}
