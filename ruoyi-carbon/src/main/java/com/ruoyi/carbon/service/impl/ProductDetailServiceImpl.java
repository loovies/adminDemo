package com.ruoyi.carbon.service.impl;

import com.ruoyi.carbon.domain.ProductModelingDetail;
import com.ruoyi.carbon.domain.dto.ProductDetailPageDto;
import com.ruoyi.carbon.mapper.ProductDetailMapper;
import com.ruoyi.carbon.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {

    @Autowired
    private ProductDetailMapper productDetailMapper;
    @Override
    public List<ProductModelingDetail> getProductList(ProductDetailPageDto pageDto) {
        return productDetailMapper.getProductList(pageDto);
    }
}
