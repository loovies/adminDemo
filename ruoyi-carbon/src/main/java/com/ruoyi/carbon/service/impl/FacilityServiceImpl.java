package com.ruoyi.carbon.service.impl;

import com.ruoyi.carbon.domain.Facility;
import com.ruoyi.carbon.domain.dto.FacilityPageDto;
import com.ruoyi.carbon.mapper.FacilityMapper;
import com.ruoyi.carbon.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FacilityServiceImpl implements FacilityService {

    @Autowired
    private FacilityMapper facilityMapper;

    public List<Facility> getPageList(FacilityPageDto facilityPageDto) {

        List<Facility> facilities = facilityMapper.getPageList(facilityPageDto);

        return facilities;
    }

    @Override
    public int delInfoById(Long id) {
        return facilityMapper.delInfoById(id);
    }

    @Override
    public int updateinfo(Facility facility) {
        facility.setUpdateTime(LocalDateTime.now());
        return facilityMapper.updateInfo(facility);
    }

    @Override
    public int addinfo(Facility facility) {
        facility.setCreateTime(LocalDateTime.now());
        facility.setUpdateTime(LocalDateTime.now());
        facility.setId(System.currentTimeMillis());

        return facilityMapper.addInfo(facility);
    }
}
