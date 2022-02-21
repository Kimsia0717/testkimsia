package com.sia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sia.domain.AttendenceDTO;
import com.sia.mapper.AttendenceMapper;

@Service
public class AttendenceServiceImpl implements AttendenceService {
    @Autowired
    AttendenceMapper attendencemapper;

    @Override
    public int TodayDataCheck() {
        return attendencemapper.TodayDataCheck();
    }

    @Override
    public List<AttendenceDTO> AtdcSelect(AttendenceDTO dto) {

        List<AttendenceDTO> list = attendencemapper.AtdcSelect(dto);
        return list;
    }

    @Override
    public int AtdcInsert(AttendenceDTO dto) {
        return attendencemapper.AtdcInsert(dto);
    }
}
