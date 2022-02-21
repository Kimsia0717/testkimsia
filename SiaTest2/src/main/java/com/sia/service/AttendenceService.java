package com.sia.service;

import java.util.List;

import com.sia.domain.AttendenceDTO;

public interface AttendenceService {
    public int TodayDataCheck();

    public List<AttendenceDTO> AtdcSelect(AttendenceDTO dto);

    public int AtdcInsert(AttendenceDTO dto);
}
