package com.ruoyi.web.controller.enterprise;

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
import com.ruoyi.enterprise.domain.BidBidding;
import com.ruoyi.enterprise.service.IBidBiddingService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 招投标Controller
 * 
 * @author ruoyi
 * @date 2023-11-09
 */
@RestController
@RequestMapping("/bid/bidding/front")
public class BidBiddingController extends BaseController
{
    @Autowired
    private IBidBiddingService bidBiddingService;

    /**
     * 查询招投标列表
     */
    @PreAuthorize("@ss.hasPermi('enterprise:bidding:list')")
    @GetMapping("/list")
    public TableDataInfo list(BidBidding bidBidding)
    {
        startPage();
        List<BidBidding> list = bidBiddingService.selectBidBiddingList(bidBidding);
        return getDataTable(list);
    }

    /**
     * 导出招投标列表
     */
    @PreAuthorize("@ss.hasPermi('enterprise:bidding:export')")
    @Log(title = "招投标", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BidBidding bidBidding)
    {
        List<BidBidding> list = bidBiddingService.selectBidBiddingList(bidBidding);
        ExcelUtil<BidBidding> util = new ExcelUtil<BidBidding>(BidBidding.class);
        util.exportExcel(response, list, "招投标数据");
    }

    /**
     * 获取招投标详细信息
     */
    @PreAuthorize("@ss.hasPermi('enterprise:bidding:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(bidBiddingService.selectBidBiddingById(id));
    }

    /**
     * 新增招投标
     */
    @PreAuthorize("@ss.hasPermi('enterprise:bidding:add')")
    @Log(title = "招投标", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BidBidding bidBidding)
    {
        return toAjax(bidBiddingService.insertBidBidding(bidBidding));
    }

    /**
     * 修改招投标
     */
    @PreAuthorize("@ss.hasPermi('enterprise:bidding:edit')")
    @Log(title = "招投标", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BidBidding bidBidding)
    {
        return toAjax(bidBiddingService.updateBidBidding(bidBidding));
    }

    /**
     * 删除招投标
     */
    @PreAuthorize("@ss.hasPermi('enterprise:bidding:remove')")
    @Log(title = "招投标", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bidBiddingService.deleteBidBiddingByIds(ids));
    }
}
