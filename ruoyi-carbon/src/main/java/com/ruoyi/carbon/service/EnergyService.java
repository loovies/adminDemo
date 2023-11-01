package com.ruoyi.carbon.service;

import com.ruoyi.carbon.domain.EnergyCollect;
import com.ruoyi.carbon.domain.dto.EnergyCollectPageDto;
import com.ruoyi.common.core.page.PageResult;

import java.util.List;

public interface EnergyService {
//    PageResult pagelist(EnergyCollectPageDto ecoDto);
        List<EnergyCollect> pagelist(EnergyCollectPageDto ecoDto);
}
