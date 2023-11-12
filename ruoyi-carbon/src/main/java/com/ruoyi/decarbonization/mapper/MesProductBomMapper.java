package com.ruoyi.decarbonization.mapper;

import java.util.List;
import com.ruoyi.decarbonization.domain.MesProductBom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 产品BOM单Mapper接口
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@Mapper
public interface MesProductBomMapper 
{
    /**
     * 查询产品BOM单
     * 
     * @param id 产品BOM单主键
     * @return 产品BOM单
     */
    public MesProductBom selectMesProductBomById(@Param("id") Long id);

    /**
     * 查询产品BOM单列表
     * 
     * @param mesProductBom 产品BOM单
     * @return 产品BOM单集合
     */
    public List<MesProductBom> selectMesProductBomList(MesProductBom mesProductBom);

    /**
     * 新增产品BOM单
     * 
     * @param mesProductBom 产品BOM单
     * @return 结果
     */
    public int  insertMesProductBom(MesProductBom mesProductBom);

    /**
     * 修改产品BOM单
     * 
     * @param mesProductBom 产品BOM单
     * @return 结果
     */
    public int updateMesProductBom(MesProductBom mesProductBom);

    /**
     * 删除产品BOM单
     * 
     * @param id 产品BOM单主键
     * @return 结果
     */
    public int deleteMesProductBomById(Long id);

    /**
     * 批量删除产品BOM单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesProductBomByIds(Long[] ids);
}
