package com.ruoyi.decarbonization.mapper;

import com.ruoyi.decarbonization.domain.CfConfigNeutral;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 碳中和计算比例Mapper接口
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@Mapper
public interface CfConfigNeutralMapper 
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
     * 删除碳中和计算比例
     * 
     * @param id 碳中和计算比例主键
     * @return 结果
     */
    public int deleteCfConfigNeutralById(Long id);

    /**
     * 批量删除碳中和计算比例
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCfConfigNeutralByIds(Long[] ids);
}
