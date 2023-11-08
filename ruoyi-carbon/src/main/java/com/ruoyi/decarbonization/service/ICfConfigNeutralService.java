package com.ruoyi.decarbonization.service;

import com.ruoyi.decarbonization.domain.CfConfigNeutral;

import java.util.List;


/**
 * 碳中和计算比例Service接口
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
public interface ICfConfigNeutralService 
{
    /**
     * 查询碳中和计算比例
     * 
     * @param id 碳中和计算比例主键
     * @return 碳中和计算比例
     */
    public CfConfigNeutral selectCfConfigNeutralById(Long id);

    /**
     * 查询碳中和计算比例列表
     * 
     * @param cfConfigNeutral 碳中和计算比例
     * @return 碳中和计算比例集合
     */
    public List<CfConfigNeutral> selectCfConfigNeutralList(CfConfigNeutral cfConfigNeutral);

    /**
     * 新增碳中和计算比例
     * 
     * @param cfConfigNeutral 碳中和计算比例
     * @return 结果
     */
    public int insertCfConfigNeutral(CfConfigNeutral cfConfigNeutral);

    /**
     * 修改碳中和计算比例
     * 
     * @param cfConfigNeutral 碳中和计算比例
     * @return 结果
     */
    public int updateCfConfigNeutral(CfConfigNeutral cfConfigNeutral);

    /**
     * 批量删除碳中和计算比例
     * 
     * @param ids 需要删除的碳中和计算比例主键集合
     * @return 结果
     */
    public int deleteCfConfigNeutralByIds(Long[] ids);

    /**
     * 删除碳中和计算比例信息
     * 
     * @param id 碳中和计算比例主键
     * @return 结果
     */
    public int deleteCfConfigNeutralById(Long id);

    public double getElectricCo2();
}
