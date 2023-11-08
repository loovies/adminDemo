package com.ruoyi.decarbonization.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.decarbonization.mapper.MesProductBomMapper;
import com.ruoyi.decarbonization.domain.MesProductBom;
import com.ruoyi.decarbonization.service.IMesProductBomService;

/**
 * 产品BOM单Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@Service
public class MesProductBomServiceImpl implements IMesProductBomService 
{
    @Autowired
    private MesProductBomMapper mesProductBomMapper;

    /**
     * 查询产品BOM单
     * 
     * @param id 产品BOM单主键
     * @return 产品BOM单
     */
    @Override
    public MesProductBom selectMesProductBomById(Long id)
    {
        return mesProductBomMapper.selectMesProductBomById(id);
    }

    /**
     * 查询产品BOM单列表
     * 
     * @param mesProductBom 产品BOM单
     * @return 产品BOM单
     */
    @Override
    public List<MesProductBom> selectMesProductBomList(MesProductBom mesProductBom)
    {
        return mesProductBomMapper.selectMesProductBomList(mesProductBom);
    }

    /**
     * 新增产品BOM单
     * 
     * @param mesProductBom 产品BOM单
     * @return 结果
     */
    @Override
    public int insertMesProductBom(MesProductBom mesProductBom)
    {
        mesProductBom.setCreateTime(DateUtils.getNowDate());
        return mesProductBomMapper.insertMesProductBom(mesProductBom);
    }

    /**
     * 修改产品BOM单
     * 
     * @param mesProductBom 产品BOM单
     * @return 结果
     */
    @Override
    public int updateMesProductBom(MesProductBom mesProductBom)
    {
        mesProductBom.setUpdateTime(DateUtils.getNowDate());
        return mesProductBomMapper.updateMesProductBom(mesProductBom);
    }

    /**
     * 批量删除产品BOM单
     * 
     * @param ids 需要删除的产品BOM单主键
     * @return 结果
     */
    @Override
    public int deleteMesProductBomByIds(Long[] ids)
    {
        return mesProductBomMapper.deleteMesProductBomByIds(ids);
    }

    /**
     * 删除产品BOM单信息
     * 
     * @param id 产品BOM单主键
     * @return 结果
     */
    @Override
    public int deleteMesProductBomById(Long id)
    {
        return mesProductBomMapper.deleteMesProductBomById(id);
    }
}
