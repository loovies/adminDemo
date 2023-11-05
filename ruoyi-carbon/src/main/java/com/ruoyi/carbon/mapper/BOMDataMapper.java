package com.ruoyi.carbon.mapper;

import com.ruoyi.carbon.domain.BOMData;
import com.ruoyi.carbon.domain.BOMDetailData;
import com.ruoyi.carbon.domain.dto.BOMupdateDataDto;
import com.ruoyi.carbon.domain.vo.BOMDataVo;
import com.ruoyi.carbon.domain.vo.ProductModelVo;
import com.ruoyi.carbon.domain.vo.ProductTypeVo;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PutMapping;

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

    @Update("update dtb_bom_data set bname = #{bname},model = #{model},remark = #{remark} WHERE bid = #{bid}")
    int updateBOM(BOMupdateDataDto boMupdateDataDto);

    @Update("update dtb_bom_detail_data set mid = #{mid} where bid = #{bid}")
    int updateBomByMid(@Param("bid") Long bid, @Param("mid") Long mid);


    @Insert("insert into dtb_bom_detail_data(id, mid, bid, dosage, remark, create_time, update_time, is_deleteId) " +
            " VALUES (#{id},#{mid},#{bid},#{dosage},#{remark},#{createTime},#{updateTime},#{isDeleteId})")
    int addBOMBybid(BOMDetailData bom);

    @Select("select pid,product,product_type from dtb_product_modeling")
    List<ProductTypeVo> getProductTpye();


    @Insert("INSERT INTO dtb_bom_data(bid, bname, mid, remark, create_time, update_time, is_deleteId, model, BOM_unit) " +
            " VALUES (#{bid},#{bname},#{mid},#{remark},#{createTime},#{updateTime},#{isDeleteId},#{model},#{BOMUnit})")
    int addBOM(BOMData bomDetailData);
}
