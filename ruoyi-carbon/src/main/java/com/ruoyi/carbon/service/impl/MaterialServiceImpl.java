package com.ruoyi.carbon.service.impl;

import com.ruoyi.carbon.domain.Material;
import com.ruoyi.carbon.domain.MaterialCategory;
import com.ruoyi.carbon.domain.vo.MaterialVo;
import com.ruoyi.carbon.mapper.MaterialMapper;
import com.ruoyi.carbon.service.MaterialService;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialMapper materialMapper;

    @Override
    public List<MaterialVo> getAll(Long id , Long mid) {
        return materialMapper.getAll(id,mid);
    }

    @Override
    public List<MaterialCategory> getCategoryInfo() {
        return materialMapper.getCategoryInfo(0L);
    }
}
