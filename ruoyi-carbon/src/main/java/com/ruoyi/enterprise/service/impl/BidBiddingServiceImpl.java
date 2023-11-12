package com.ruoyi.enterprise.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.enterprise.mapper.BidBiddingMapper;
import com.ruoyi.enterprise.domain.BidBidding;
import com.ruoyi.enterprise.service.IBidBiddingService;

/**
 * 招投标Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-09
 */
@Service
public class BidBiddingServiceImpl implements IBidBiddingService 
{
    @Autowired
    private BidBiddingMapper bidBiddingMapper;

    /**
     * 查询招投标
     * 
     * @param id 招投标主键
     * @return 招投标
     */
    @Override
    public BidBidding selectBidBiddingById(Long id)
    {
        return bidBiddingMapper.selectBidBiddingById(id);
    }

    /**
     * 查询招投标列表
     * 
     * @param bidBidding 招投标
     * @return 招投标
     */
    @Override
    public List<BidBidding> selectBidBiddingList(BidBidding bidBidding)
    {
        return bidBiddingMapper.selectBidBiddingList(bidBidding);
    }

    /**
     * 新增招投标
     * 
     * @param bidBidding 招投标
     * @return 结果
     */
    @Override
    public int insertBidBidding(BidBidding bidBidding)
    {
        bidBidding.setCreateTime(DateUtils.getNowDate());
        return bidBiddingMapper.insertBidBidding(bidBidding);
    }

    /**
     * 修改招投标
     * 
     * @param bidBidding 招投标
     * @return 结果
     */
    @Override
    public int updateBidBidding(BidBidding bidBidding)
    {
        bidBidding.setUpdateTime(DateUtils.getNowDate());
        return bidBiddingMapper.updateBidBidding(bidBidding);
    }

    /**
     * 批量删除招投标
     * 
     * @param ids 需要删除的招投标主键
     * @return 结果
     */
    @Override
    public int deleteBidBiddingByIds(Long[] ids)
    {
        return bidBiddingMapper.deleteBidBiddingByIds(ids);
    }

    /**
     * 删除招投标信息
     * 
     * @param id 招投标主键
     * @return 结果
     */
    @Override
    public int deleteBidBiddingById(Long id)
    {
        return bidBiddingMapper.deleteBidBiddingById(id);
    }
}
