package com.ruoyi.carbon.mapper;

import com.ruoyi.carbon.domain.ProductModelingDetail;
import com.ruoyi.carbon.domain.dto.ProductDetailPageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDetailMapper {

   List<ProductModelingDetail> getProductList(ProductDetailPageDto pageDto);
}
