package com.ruoyi.carbon.service;

import com.ruoyi.carbon.domain.ProductModelingDetail;
import com.ruoyi.carbon.domain.dto.ProductDetailPageDto;
import com.ruoyi.carbon.domain.vo.ProductDetailVo;

import java.util.List;

public interface ProductDetailService {

    public List<ProductDetailVo> getProductList(ProductDetailPageDto pageDto);
}
