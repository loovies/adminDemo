package com.ruoyi.decarbonization.mapper;

import java.util.List;
import com.ruoyi.decarbonization.domain.MesProductBomDetail;

/**
 * BOM单明细Mapper接口
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
public interface MesProductBomDetailMapper 
{
    /**
     * 查询BOM单明细
     * 
     * @param id BOM单明细主键
     * @return BOM单明细
     */
    public List<MesProductBomDetail> selectMesProductBomDetailById(Long id);

    /**
     * 查询BOM单明细列表
     * 
     * @param mesProductBomDetail BOM单明细
     * @return BOM单明细集合
     */
    public List<MesProductBomDetail> selectMesProductBomDetailList(MesProductBomDetail mesProductBomDetail);

    /**
     * 新增BOM单明细
     * 
     * @param mesProductBomDetail BOM单明细
     * @return 结果
     */
    public int insertMesProductBomDetail(MesProductBomDetail mesProductBomDetail);

    /**
     * 修改BOM单明细
     * 
     * @param mesProductBomDetail BOM单明细
     * @return 结果
     */
    public int updateMesProductBomDetail(MesProductBomDetail mesProductBomDetail);

    /**
     * 删除BOM单明细
     * 
     * @param id BOM单明细主键
     * @return 结果
     */
    public int deleteMesProductBomDetailById(Long id);

    /**
     * 批量删除BOM单明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesProductBomDetailByIds(Long[] ids);
}
