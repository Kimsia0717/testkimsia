package com.sia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sia.domain.AttendenceDTO;

@Mapper
public interface AttendenceMapper {
    public int TodayDataCheck();

    public List<AttendenceDTO> AtdcSelect(AttendenceDTO dto);

    public int AtdcInsert(AttendenceDTO dto);

}
