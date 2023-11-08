package com.ruoyi.decarbonization.mapper;

import java.util.List;
import com.ruoyi.decarbonization.domain.WmsMaterialInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 物料档案Mapper接口
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@Mapper
public interface WmsMaterialInfoMapper 
{
    /**
     * 查询物料档案
     * 
     * @param id 物料档案主键
     * @return 物料档案
     */
    public WmsMaterialInfo selectWmsMaterialInfoById(Long id);

    /**
     * 查询物料档案列表
     * 
     * @param wmsMaterialInfo 物料档案
     * @return 物料档案集合
     */
    public List<WmsMaterialInfo> selectWmsMaterialInfoList(WmsMaterialInfo wmsMaterialInfo);

    /**
     * 新增物料档案
     * 
     * @param wmsMaterialInfo 物料档案
     * @return 结果
     */
    public int insertWmsMaterialInfo(WmsMaterialInfo wmsMaterialInfo);

    /**
     * 修改物料档案
     * 
     * @param wmsMaterialInfo 物料档案
     * @return 结果
     */
    public int updateWmsMaterialInfo(WmsMaterialInfo wmsMaterialInfo);

    /**
     * 删除物料档案
     * 
     * @param id 物料档案主键
     * @return 结果
     */
    public int deleteWmsMaterialInfoById(Long id);

    /**
     * 批量删除物料档案
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWmsMaterialInfoByIds(Long[] ids);
}
