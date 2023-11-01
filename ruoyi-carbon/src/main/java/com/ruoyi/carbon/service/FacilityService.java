package com.ruoyi.carbon.service;

import com.ruoyi.carbon.domain.Facility;
import com.ruoyi.carbon.domain.dto.FacilityPageDto;

import java.util.List;

public interface FacilityService {
    List<Facility> getPageList(FacilityPageDto facilityPageDto);

    int delInfoById(Long id);

    int updateinfo(Facility facility);

    int addinfo(Facility facility);
}
