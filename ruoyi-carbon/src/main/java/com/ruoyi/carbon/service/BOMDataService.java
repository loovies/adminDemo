package com.ruoyi.carbon.service;

import com.ruoyi.carbon.domain.BOMData;
import com.ruoyi.carbon.domain.vo.BOMDataVo;
import com.ruoyi.carbon.domain.vo.ProductModelVo;

import java.util.List;

public interface BOMDataService {
    List<BOMDataVo> getBOMData(String bname);

    BOMData getBOMDataById(Long id);

    List<ProductModelVo> getProductModel();
}
