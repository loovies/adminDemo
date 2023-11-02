package com.ruoyi.carbon.mapper;

import com.ruoyi.carbon.domain.ProductModelingDetail;
import com.ruoyi.carbon.domain.dto.ProductDetailPageDto;
import com.ruoyi.carbon.domain.vo.ProductDetailVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ProductDetailMapper {

//   List<ProductModelingDetail> getProductList(ProductDetailPageDto pageDto);

   List<ProductDetailVo> getProductList(ProductDetailPageDto pageDto);

   @Update("UPDATE dtb_product_modeling_detail set is_deleteId = 1 where pid = #{id}")
   int delPdetailInfo(Long id);

   @Update("UPDATE dtb_product_modeling set is_deleteId = 1 where pid = #{id}")
   int delPInfo(Long id);

   ProductDetailVo getMaterialByPid(Long id);
}
