package com.ruoyi.carbon.service;

import com.ruoyi.carbon.domain.BOMData;
import com.ruoyi.carbon.domain.dto.BOMupdateDataDto;
import com.ruoyi.carbon.domain.dto.BomDataDto;
import com.ruoyi.carbon.domain.vo.BOMDataVo;
import com.ruoyi.carbon.domain.vo.ProductModelVo;
import com.ruoyi.carbon.domain.vo.ProductTypeVo;

import java.util.List;

public interface BOMDataService {
    List<BOMDataVo> getBOMData(String bname);

    BOMData getBOMDataById(Long id);

    List<ProductModelVo> getProductModel();

    int updateBOM(BOMupdateDataDto boMupdateDataDto);

    int updateBOMById(Long bid, Long mid);

    int addBOMData(Long bid, Long mid);

    List<ProductTypeVo> getProductType();


    int addBOM(BomDataDto bomDataDto);
}
