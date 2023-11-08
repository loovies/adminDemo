package com.ruoyi.decarbonization.service;

import java.util.List;
import com.ruoyi.decarbonization.domain.MesProductModelDetail;

/**
 * 产品模型明细Service接口
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
public interface IMesProductModelDetailService 
{
    /**
     * 查询产品模型明细
     * 
     * @param id 产品模型明细主键
     * @return 产品模型明细
     */
    public List<MesProductModelDetail> selectMesProductModelDetailById(Long id);

    /**
     * 查询产品模型明细列表
     * 
     * @param mesProductModelDetail 产品模型明细
     * @return 产品模型明细集合
     */
    public List<MesProductModelDetail> selectMesProductModelDetailList(MesProductModelDetail mesProductModelDetail);

    /**
     * 新增产品模型明细
     * 
     * @param mesProductModelDetail 产品模型明细
     * @return 结果
     */
    public int insertMesProductModelDetail(MesProductModelDetail mesProductModelDetail);

    /**
     * 修改产品模型明细
     * 
     * @param mesProductModelDetail 产品模型明细
     * @return 结果
     */
    public int updateMesProductModelDetail(MesProductModelDetail mesProductModelDetail);

    /**
     * 批量删除产品模型明细
     * 
     * @param ids 需要删除的产品模型明细主键集合
     * @return 结果
     */
    public int deleteMesProductModelDetailByIds(Long[] ids);

    /**
     * 删除产品模型明细信息
     * 
     * @param id 产品模型明细主键
     * @return 结果
     */
    public int deleteMesProductModelDetailById(Long id);
}
