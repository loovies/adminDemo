package com.ruoyi.decarbonization.service.impl;

import com.ruoyi.decarbonization.domain.VMesEquipmentPowerDetail;
import com.ruoyi.decarbonization.mapper.VMesEquipmentPowerDetailMapper;
import com.ruoyi.decarbonization.service.IVMesEquipmentPowerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VMesEquipmentPowerDetailServiceImpl implements IVMesEquipmentPowerDetailService
{
    @Autowired
    private VMesEquipmentPowerDetailMapper vMesEquipmentPowerDetailMapper;


    /**
     * 查询VIEW列表
     *
     * @param vMesEquipmentPowerDetail VIEW
     * @return VIEW
     */
    @Override
    public List<VMesEquipmentPowerDetail> selectVMesEquipmentPowerDetailList(VMesEquipmentPowerDetail vMesEquipmentPowerDetail)
    {
        return vMesEquipmentPowerDetailMapper.selectVMesEquipmentPowerDetailList(vMesEquipmentPowerDetail);
    }

}
