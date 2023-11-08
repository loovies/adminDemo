package com.ruoyi.decarbonization.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.decarbonization.mapper.MesProductBomDetailMapper;
import com.ruoyi.decarbonization.domain.MesProductBomDetail;
import com.ruoyi.decarbonization.service.IMesProductBomDetailService;

/**
 * BOM单明细Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@Service
public class MesProductBomDetailServiceImpl implements IMesProductBomDetailService 
{
    @Autowired
    private MesProductBomDetailMapper mesProductBomDetailMapper;

    /**
     * 查询BOM单明细
     * 
     * @param id BOM单明细主键
     * @return BOM单明细
     */
    @Override
    public List<MesProductBomDetail> selectMesProductBomDetailById(Long id)
    {
        return mesProductBomDetailMapper.selectMesProductBomDetailById(id);
    }

    /**
     * 查询BOM单明细列表
     * 
     * @param mesProductBomDetail BOM单明细
     * @return BOM单明细
     */
    @Override
    public List<MesProductBomDetail> selectMesProductBomDetailList(MesProductBomDetail mesProductBomDetail)
    {
        return mesProductBomDetailMapper.selectMesProductBomDetailList(mesProductBomDetail);
    }

    /**
     * 新增BOM单明细
     * 
     * @param mesProductBomDetail BOM单明细
     * @return 结果
     */
    @Override
    public int insertMesProductBomDetail(MesProductBomDetail mesProductBomDetail)
    {
        return mesProductBomDetailMapper.insertMesProductBomDetail(mesProductBomDetail);
    }

    /**
     * 修改BOM单明细
     * 
     * @param mesProductBomDetail BOM单明细
     * @return 结果
     */
    @Override
    public int updateMesProductBomDetail(MesProductBomDetail mesProductBomDetail)
    {
        return mesProductBomDetailMapper.updateMesProductBomDetail(mesProductBomDetail);
    }

    /**
     * 批量删除BOM单明细
     * 
     * @param ids 需要删除的BOM单明细主键
     * @return 结果
     */
    @Override
    public int deleteMesProductBomDetailByIds(Long[] ids)
    {
        return mesProductBomDetailMapper.deleteMesProductBomDetailByIds(ids);
    }

    /**
     * 删除BOM单明细信息
     * 
     * @param id BOM单明细主键
     * @return 结果
     */
    @Override
    public int deleteMesProductBomDetailById(Long id)
    {
        return mesProductBomDetailMapper.deleteMesProductBomDetailById(id);
    }
}
