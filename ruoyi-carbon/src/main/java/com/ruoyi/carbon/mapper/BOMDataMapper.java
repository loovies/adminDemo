package com.ruoyi.carbon.mapper;

import com.ruoyi.carbon.domain.BOMData;
import com.ruoyi.carbon.domain.BOMDetailData;
import com.ruoyi.carbon.domain.vo.BOMDataVo;
import com.ruoyi.carbon.domain.vo.ProductModelVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BOMDataMapper {
    List<BOMDataVo> getBOMData(String bname);

    @Select("SELECT * FROM dtb_bom_data d" +
            " inner join dtb_product_modeling dtb on d.model = dtb.pid" +
            " WHERE bid = #{id}")
    BOMData getBOMDataById(Long id);

    List<BOMDetailData> getBOMDataDetailById(Long id);

    @Select("select pid,product,model_name from dtb_product_modeling")
    List<ProductModelVo> getProductModel();
}
