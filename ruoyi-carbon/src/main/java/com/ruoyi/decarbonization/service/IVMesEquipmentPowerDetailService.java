package com.ruoyi.decarbonization.service;

import com.ruoyi.decarbonization.domain.VMesEquipmentPowerDetail;

import java.util.List;

public interface IVMesEquipmentPowerDetailService {
    /**
     * 查询VIEW列表
     *
     * @param vMesEquipmentPowerDetail VIEW
     * @return VIEW集合
     */
    public List<VMesEquipmentPowerDetail> selectVMesEquipmentPowerDetailList(VMesEquipmentPowerDetail vMesEquipmentPowerDetail);
}
