package com.ruoyi.decarbonization.mapper;

import com.ruoyi.decarbonization.domain.VMesEquipmentPowerDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VMesEquipmentPowerDetailMapper {


    /**
     * 查询VIEW列表
     *
     * @param vMesEquipmentPowerDetail VIEW
     * @return VIEW集合
     */
    public List<VMesEquipmentPowerDetail> selectVMesEquipmentPowerDetailList(VMesEquipmentPowerDetail vMesEquipmentPowerDetail);

}
