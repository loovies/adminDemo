package com.ruoyi.carbon.service.impl;

import com.ruoyi.carbon.domain.BOMData;
import com.ruoyi.carbon.domain.BOMDetailData;
import com.ruoyi.carbon.domain.dto.BOMupdateDataDto;
import com.ruoyi.carbon.domain.dto.BomDataDto;
import com.ruoyi.carbon.domain.vo.BOMDataVo;
import com.ruoyi.carbon.domain.vo.ProductModelVo;
import com.ruoyi.carbon.domain.vo.ProductTypeVo;
import com.ruoyi.carbon.mapper.BOMDataMapper;
import com.ruoyi.carbon.service.BOMDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
        List<BOMDetailData> bdd = bomDataMapper.getBOMDataDetailById(id);
        bm.setDetailData(bdd);
        return bm;
    }

    @Override
    public List<ProductModelVo> getProductModel() {
        return bomDataMapper.getProductModel();
    }

    @Override
    public int updateBOM(BOMupdateDataDto boMupdateDataDto) {
        return bomDataMapper.updateBOM(boMupdateDataDto);
    }

    @Override
    public int updateBOMById(Long bid, Long mid) {
        return bomDataMapper.updateBomByMid(bid,mid);
    }

    @Override
    public int addBOMData(Long bid, Long mid) {
        BOMDetailData bom = new BOMDetailData();
        System.out.println(System.currentTimeMillis());
        bom.setId(Long.parseLong(Long.toString(System.currentTimeMillis()).substring(5,11)));
        if(mid == -1){
            bom.setMid(null);
        }
        bom.setBid(bid);
        bom.setRemark("");
        bom.setDosage(0);
        bom.setCreateTime(LocalDateTime.now());
        bom.setUpdateTime(LocalDateTime.now());
        bom.setIsDeleteId(0);
        int n = bomDataMapper.addBOMBybid(bom);
        return n;
    }

    @Override
    public List<ProductTypeVo> getProductType() {
        return bomDataMapper.getProductTpye();
    }

    @Override
    public int addBOM(BomDataDto bomDataDto) {

        BOMData bomDetailData = new BOMData();

        bomDetailData.setBid(Long.parseLong(Long.toString(System.currentTimeMillis()).substring(5,11)));
        bomDetailData.setModel(bomDataDto.getPid().toString());
        bomDetailData.setMid(bomDataDto.getMid());
        bomDetailData.setBname(bomDataDto.getBname());
        bomDetailData.setRemark(bomDataDto.getRemark());

        bomDetailData.setIsDeleteId(0);
        bomDetailData.setCreateTime(LocalDateTime.now());
        bomDetailData.setUpdateTime(LocalDateTime.now());
        bomDetailData.setBOMUnit("个");
        int n = bomDataMapper.addBOM(bomDetailData);
        return n;
    }
}
