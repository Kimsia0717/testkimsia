package com.sia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sia.domain.ClassDTO;

@Mapper
public interface ClassMapper {
    public int Classin(ClassDTO dto);

    public int ClassTotalCount();

    public List<ClassDTO> ClassView();

    public int ClassCall(String id);
}
