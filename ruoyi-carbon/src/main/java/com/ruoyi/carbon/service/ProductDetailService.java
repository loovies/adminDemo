package com.ruoyi.carbon.service;

import com.ruoyi.carbon.domain.ProductModelingDetail;
import com.ruoyi.carbon.domain.dto.ProductDetailPageDto;
import com.ruoyi.carbon.domain.dto.ProductMDto;
import com.ruoyi.carbon.domain.vo.ProductDetailVo;

import java.util.List;

public interface ProductDetailService {

//    public List<ProductModelingDetail> getProductList(ProductDetailPageDto pageDto);

    public List<ProductDetailVo> getProductList(ProductDetailPageDto pageDto);

    int delPInfo(Long id);

    ProductDetailVo getMaterialByPid(Long id);

    int updateInfo(ProductMDto productMDto);
}
