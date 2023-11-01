package com.ruoyi.carbon.service.impl;

import com.github.pagehelper.Page;
import com.ruoyi.carbon.domain.EnergyCollect;
import com.ruoyi.carbon.domain.dto.EnergyCollectPageDto;
import com.ruoyi.carbon.mapper.EnergyMapper;
import com.ruoyi.carbon.service.EnergyService;
import com.ruoyi.common.core.page.PageResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
public class EnergyServiceImpl implements EnergyService {

    @Autowired
    private EnergyMapper energyMapper;

//    @Override
//    public PageResult pagelist(EnergyCollectPageDto ecoDto) {
//
//        EnergyCollectPageDto energyCollectPageDto = new EnergyCollectPageDto();
//
//        BeanUtils.copyProperties(ecoDto,energyCollectPageDto);
//
//        //查询分页数据
//        List<EnergyCollect> Pagelist = energyMapper.pageList(energyCollectPageDto);
//
//        Integer total = energyMapper.getTotal();
//        return new PageResult(total, Pagelist);
//    }

    @Override
    public List<EnergyCollect> pagelist(EnergyCollectPageDto ecoDto) {

        //查询分页数据
        List<EnergyCollect> Pagelist = energyMapper.pageList(ecoDto);

        return Pagelist;
    }
}
