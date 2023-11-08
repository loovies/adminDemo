package com.ruoyi.decarbonization.service;

import java.util.List;
import com.ruoyi.decarbonization.domain.MesProductModel;

/**
 * 产品建模Service接口
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
public interface IMesProductModelService 
{
    /**
     * 查询产品建模
     * 
     * @param id 产品建模主键
     * @return 产品建模
     */
    public MesProductModel selectMesProductModelById(Long id);

    /**
     * 查询产品建模列表
     * 
     * @param mesProductModel 产品建模
     * @return 产品建模集合
     */
    public List<MesProductModel> selectMesProductModelList(MesProductModel mesProductModel);

    /**
     * 新增产品建模
     * 
     * @param mesProductModel 产品建模
     * @return 结果
     */
    public int insertMesProductModel(MesProductModel mesProductModel);

    /**
     * 修改产品建模
     * 
     * @param mesProductModel 产品建模
     * @return 结果
     */
    public int updateMesProductModel(MesProductModel mesProductModel);

    /**
     * 批量删除产品建模
     * 
     * @param ids 需要删除的产品建模主键集合
     * @return 结果
     */
    public int deleteMesProductModelByIds(Long[] ids);

    /**
     * 删除产品建模信息
     * 
     * @param id 产品建模主键
     * @return 结果
     */
    public int deleteMesProductModelById(Long id);
}
