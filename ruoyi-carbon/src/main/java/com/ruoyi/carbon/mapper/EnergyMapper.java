package com.ruoyi.carbon.mapper;

import com.ruoyi.carbon.domain.EnergyCollect;
import com.ruoyi.carbon.domain.dto.EnergyCollectPageDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface EnergyMapper {
    List<EnergyCollect> pageList(EnergyCollectPageDto energyCollectPageDto);

}
