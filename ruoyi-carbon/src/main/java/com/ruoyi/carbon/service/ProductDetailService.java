package com.ruoyi.carbon.service;

import com.ruoyi.carbon.domain.ProductModelingDetail;
import com.ruoyi.carbon.domain.dto.ProductDetailPageDto;

import java.util.List;

public interface ProductDetailService {

    public List<ProductModelingDetail> getProductList(ProductDetailPageDto pageDto);
}
