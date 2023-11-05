package com.ruoyi.carbon.service.impl;

import com.ruoyi.carbon.domain.BOMData;
import com.ruoyi.carbon.domain.BOMDetailData;
import com.ruoyi.carbon.domain.vo.BOMDataVo;
import com.ruoyi.carbon.mapper.BOMDataMapper;
import com.ruoyi.carbon.service.BOMDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BOMDataServiceImpl implements BOMDataService {

    @Autowired
    private BOMDataMapper bomDataMapper;
    @Override
    public List<BOMDataVo> getBOMData(String bname) {
        return bomDataMapper.getBOMData(bname);
    }

    @Override
    public BOMData getBOMDataById(Long id) {

        BOMData bm = bomDataMapper.getBOMDataById(id);
        BOMDetailData bdd = bomDataMapper.getBOMDataDetailById(id);

        return null;
    }
}
