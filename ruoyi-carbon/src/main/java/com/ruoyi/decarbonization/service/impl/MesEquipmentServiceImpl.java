package com.ruoyi.decarbonization.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.decarbonization.domain.MesEquipment;
import com.ruoyi.decarbonization.mapper.MesEquipmentMapper;
import com.ruoyi.decarbonization.service.IMesEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 设备信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
@Service
public class MesEquipmentServiceImpl implements IMesEquipmentService
{
    @Autowired
    private MesEquipmentMapper mesEquipmentMapper;

    /**
     * 查询设备信息
     * 
     * @param id 设备信息主键
     * @return 设备信息
     */
    @Override
    public MesEquipment selectMesEquipmentById(Long id)
    {
        return mesEquipmentMapper.selectMesEquipmentById(id);
    }

    /**
     * 查询设备信息列表
     * 
     * @param mesEquipment 设备信息
     * @return 设备信息
     */
    @Override
    public List<MesEquipment> selectMesEquipmentList(MesEquipment mesEquipment)
    {
        return mesEquipmentMapper.selectMesEquipmentList(mesEquipment);
    }

    /**
     * 新增设备信息
     * 
     * @param mesEquipment 设备信息
     * @return 结果
     */
    @Override
    public int insertMesEquipment(MesEquipment mesEquipment)
    {
        mesEquipment.setCreateTime(DateUtils.getNowDate());
        return mesEquipmentMapper.insertMesEquipment(mesEquipment);
    }

    /**
     * 修改设备信息
     * 
     * @param mesEquipment 设备信息
     * @return 结果
     */
    @Override
    public int updateMesEquipment(MesEquipment mesEquipment)
    {
        mesEquipment.setUpdateTime(DateUtils.getNowDate());
        return mesEquipmentMapper.updateMesEquipment(mesEquipment);
    }

    /**
     * 批量删除设备信息
     * 
     * @param ids 需要删除的设备信息主键
     * @return 结果
     */
    @Override
    public int deleteMesEquipmentByIds(Long[] ids)
    {
        return mesEquipmentMapper.deleteMesEquipmentByIds(ids);
    }

    /**
     * 删除设备信息信息
     * 
     * @param id 设备信息主键
     * @return 结果
     */
    @Override
    public int deleteMesEquipmentById(Long id)
    {
        return mesEquipmentMapper.deleteMesEquipmentById(id);
    }
}
