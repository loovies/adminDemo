package com.ruoyi.enterprise.service;

import java.util.List;
import com.ruoyi.enterprise.domain.BidBidding;

/**
 * 招投标Service接口
 * 
 * @author ruoyi
 * @date 2023-11-09
 */
public interface IBidBiddingService 
{
    /**
     * 查询招投标
     * 
     * @param id 招投标主键
     * @return 招投标
     */
    public BidBidding selectBidBiddingById(Long id);

    /**
     * 查询招投标列表
     * 
     * @param bidBidding 招投标
     * @return 招投标集合
     */
    public List<BidBidding> selectBidBiddingList(BidBidding bidBidding);

    /**
     * 新增招投标
     * 
     * @param bidBidding 招投标
     * @return 结果
     */
    public int insertBidBidding(BidBidding bidBidding);

    /**
     * 修改招投标
     * 
     * @param bidBidding 招投标
     * @return 结果
     */
    public int updateBidBidding(BidBidding bidBidding);

    /**
     * 批量删除招投标
     * 
     * @param ids 需要删除的招投标主键集合
     * @return 结果
     */
    public int deleteBidBiddingByIds(Long[] ids);

    /**
     * 删除招投标信息
     * 
     * @param id 招投标主键
     * @return 结果
     */
    public int deleteBidBiddingById(Long id);
}
