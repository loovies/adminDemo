package com.ruoyi.carbon.mapper;

import com.ruoyi.carbon.domain.ProductModelingDetail;
import com.ruoyi.carbon.domain.dto.ProductDetailPageDto;
import com.ruoyi.carbon.domain.vo.ProductDetailVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDetailMapper {

//   List<ProductModelingDetail> getProductList(ProductDetailPageDto pageDto);

   List<ProductDetailVo> getProductList(ProductDetailPageDto pageDto);
}
