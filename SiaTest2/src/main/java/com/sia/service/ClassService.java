package com.sia.service;

import java.util.List;

import com.sia.domain.ClassDTO;

public interface ClassService {
    public int Classin(ClassDTO dto);

    public int ClassTotalCount();

    public List<ClassDTO> ClassView();
}
