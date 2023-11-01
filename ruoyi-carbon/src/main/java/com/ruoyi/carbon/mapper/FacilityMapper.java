package com.ruoyi.carbon.mapper;

import com.ruoyi.carbon.domain.Facility;
import com.ruoyi.carbon.domain.dto.FacilityPageDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface FacilityMapper {
    List<Facility> getPageList(FacilityPageDto facilityPageDto);

    @Update("update dtb_facility set is_deleteId = 1 where id = #{id}")
    Integer delInfoById(Long id);

    int updateInfo(Facility facility);

    @Insert("INSERT INTO dtb_facility(id, facility_name, encoding, model, batch_date, batch_number, manufacturer, state, remark, create_time, update_time) " +
            " VALUES (#{id},#{facilityName},#{encoding},#{model},#{batchDate},#{batchNumber},#{manufacturer},#{state},#{remark},#{createTime},#{updateTime})")
    int addInfo(Facility facility);
}
