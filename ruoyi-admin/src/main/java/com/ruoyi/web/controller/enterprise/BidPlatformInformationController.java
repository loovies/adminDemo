package com.ruoyi.web.controller.enterprise;

import java.util.List;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.enterprise.domain.BidPlatformInformation;
import com.ruoyi.enterprise.service.IBidPlatformInformationService;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 平台动态Controller
 * 
 * @author neuedu
 * @date 2023-11-09
 */
@Api(tags = {"平台动态"})
@RestController
@RequestMapping("/bid/information/front")
public class BidPlatformInformationController extends BaseController
{
    @Autowired
    private IBidPlatformInformationService bidPlatformInformationService;

    /**
     * 查询平台动态列表
     */
    @GetMapping("/list")
    @ApiOperation("查询平台动态列表")
    public TableDataInfo list(BidPlatformInformation bidPlatformInformation)
    {
        startPage();
        List<BidPlatformInformation> list = bidPlatformInformationService.selectBidPlatformInformationList(bidPlatformInformation);
        return getDataTable(list);
    }

    /**
     * 导出平台动态列表
     */
    @ApiOperation("导出平台动态列表")
    @GetMapping("/export")
    public AjaxResult export(BidPlatformInformation bidPlatformInformation)
    {
        List<BidPlatformInformation> list = bidPlatformInformationService.selectBidPlatformInformationList(bidPlatformInformation);
        ExcelUtil<BidPlatformInformation> util = new ExcelUtil<BidPlatformInformation>(BidPlatformInformation.class);
        return util.exportExcel(list, "information");
    }

    /**
     * 获取平台动态详细信息
     */
    @ApiOperation("获取平台动态详细信息")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bidPlatformInformationService.selectBidPlatformInformationById(id));
    }

    /**
     * 新增平台动态
     */
    @ApiOperation("新增平台动态")
    @PreAuthorize("@ss.hasPermi('enterprise:information:add')")
    @PostMapping
    public AjaxResult add(@RequestBody BidPlatformInformation bidPlatformInformation)
    {
        return toAjax(bidPlatformInformationService.insertBidPlatformInformation(bidPlatformInformation));
    }

    /**
     * 修改平台动态
     */
    @ApiOperation("修改平台动态")
    @PutMapping
    public AjaxResult edit(@RequestBody BidPlatformInformation bidPlatformInformation)
    {
        return toAjax(bidPlatformInformationService.updateBidPlatformInformation(bidPlatformInformation));
    }

    /**
     * 删除平台动态
     */
    @ApiOperation("删除平台动态")
    @PreAuthorize("@ss.hasPermi('enterprise:information:remove')")
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bidPlatformInformationService.deleteBidPlatformInformationByIds(ids));
    }
}
