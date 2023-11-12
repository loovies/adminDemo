package com.ruoyi.enterprise.service;

import com.ruoyi.enterprise.domain.BidPlatformInformation;

import java.util.List;


/**
 * 平台动态Service接口
 * 
 * @author neuedu
 * @date 2023-11-09
 */
public interface IBidPlatformInformationService 
{
    /**
     * 查询平台动态
     * 
     * @param id 平台动态ID
     * @return 平台动态
     */
    public BidPlatformInformation selectBidPlatformInformationById(Long id);

    /**
     * 查询平台动态列表
     * 
     * @param bidPlatformInformation 平台动态
     * @return 平台动态集合
     */
    public List<BidPlatformInformation> selectBidPlatformInformationList(BidPlatformInformation bidPlatformInformation);

    /**
     * 新增平台动态
     * 
     * @param bidPlatformInformation 平台动态
     * @return 结果
     */
    public int insertBidPlatformInformation(BidPlatformInformation bidPlatformInformation);

    /**
     * 修改平台动态
     * 
     * @param bidPlatformInformation 平台动态
     * @return 结果
     */
    public int updateBidPlatformInformation(BidPlatformInformation bidPlatformInformation);

    /**
     * 批量删除平台动态
     * 
     * @param ids 需要删除的平台动态ID
     * @return 结果
     */
    public int deleteBidPlatformInformationByIds(Long[] ids);

    /**
     * 删除平台动态信息
     * 
     * @param id 平台动态ID
     * @return 结果
     */
    public int deleteBidPlatformInformationById(Long id);
}
