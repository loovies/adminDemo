package com.ruoyi.decarbonization.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.decarbonization.mapper.MesProductModelMapper;
import com.ruoyi.decarbonization.domain.MesProductModel;
import com.ruoyi.decarbonization.service.IMesProductModelService;

/**
 * 产品建模Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@Service
public class MesProductModelServiceImpl implements IMesProductModelService 
{
    @Autowired
    private MesProductModelMapper mesProductModelMapper;

    /**
     * 查询产品建模
     * 
     * @param id 产品建模主键
     * @return 产品建模
     */
    @Override
    public MesProductModel selectMesProductModelById(Long id)
    {
        return mesProductModelMapper.selectMesProductModelById(id);
    }

    /**
     * 查询产品建模列表
     * 
     * @param mesProductModel 产品建模
     * @return 产品建模
     */
    @Override
    public List<MesProductModel> selectMesProductModelList(MesProductModel mesProductModel)
    {
        return mesProductModelMapper.selectMesProductModelList(mesProductModel);
    }

    /**
     * 新增产品建模
     * 
     * @param mesProductModel 产品建模
     * @return 结果
     */
    @Override
    public int insertMesProductModel(MesProductModel mesProductModel)
    {
        return mesProductModelMapper.insertMesProductModel(mesProductModel);
    }

    /**
     * 修改产品建模
     * 
     * @param mesProductModel 产品建模
     * @return 结果
     */
    @Override
    public int updateMesProductModel(MesProductModel mesProductModel)
    {
        return mesProductModelMapper.updateMesProductModel(mesProductModel);
    }

    /**
     * 批量删除产品建模
     * 
     * @param ids 需要删除的产品建模主键
     * @return 结果
     */
    @Override
    public int deleteMesProductModelByIds(Long[] ids)
    {
        return mesProductModelMapper.deleteMesProductModelByIds(ids);
    }

    /**
     * 删除产品建模信息
     * 
     * @param id 产品建模主键
     * @return 结果
     */
    @Override
    public int deleteMesProductModelById(Long id)
    {
        return mesProductModelMapper.deleteMesProductModelById(id);
    }
}
