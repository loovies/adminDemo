package com.ruoyi.carbon.mapper;

import com.ruoyi.carbon.domain.BOMData;
import com.ruoyi.carbon.domain.BOMDetailData;
import com.ruoyi.carbon.domain.vo.BOMDataVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BOMDataMapper {
    List<BOMDataVo> getBOMData(String bname);

    @Select("SELECT * FROM dtb_bom_data")
    BOMData getBOMDataById(Long id);

    @Select("SELECT * FROM dtb_bom_data")
    BOMDetailData getBOMDataDetailById(Long id);
}
