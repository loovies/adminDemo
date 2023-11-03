package com.ruoyi.carbon.mapper;

import com.ruoyi.carbon.domain.Material;
import com.ruoyi.carbon.domain.MaterialCategory;
import com.ruoyi.carbon.domain.vo.MaterialVo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MaterialMapper {
    List<MaterialVo> getAll(@Param("sid") Long id, @Param("mid") Long mid);

    List<MaterialCategory> getCategoryInfo(Long id);
}
