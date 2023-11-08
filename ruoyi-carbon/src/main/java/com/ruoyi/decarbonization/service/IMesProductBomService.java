package com.ruoyi.decarbonization.service;

import java.util.List;
import com.ruoyi.decarbonization.domain.MesProductBom;

/**
 * 产品BOM单Service接口
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
public interface IMesProductBomService 
{
    /**
     * 查询产品BOM单
     * 
     * @param id 产品BOM单主键
     * @return 产品BOM单
     */
    public MesProductBom selectMesProductBomById(Long id);

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
    public int insertMesProductBom(MesProductBom mesProductBom);

    /**
     * 修改产品BOM单
     * 
     * @param mesProductBom 产品BOM单
     * @return 结果
     */
    public int updateMesProductBom(MesProductBom mesProductBom);

    /**
     * 批量删除产品BOM单
     * 
     * @param ids 需要删除的产品BOM单主键集合
     * @return 结果
     */
    public int deleteMesProductBomByIds(Long[] ids);

    /**
     * 删除产品BOM单信息
     * 
     * @param id 产品BOM单主键
     * @return 结果
     */
    public int deleteMesProductBomById(Long id);
}
