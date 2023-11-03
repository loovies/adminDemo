package com.ruoyi.carbon.service;

import com.ruoyi.carbon.domain.Material;
import com.ruoyi.carbon.domain.MaterialCategory;
import com.ruoyi.carbon.domain.vo.MaterialVo;

import java.util.List;

public interface MaterialService {
    List<MaterialVo> getAll(Long id , Long mid);

    List<MaterialCategory> getCategoryInfo();
}
