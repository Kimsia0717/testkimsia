package com.sia.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sia.domain.ClassDTO;
import com.sia.mapper.ClassMapper;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    ClassMapper classmapper;

    @Override
    public int Classin(ClassDTO dto) {
        System.out.println("클래스임플진입");
        return classmapper.Classin(dto);
    }

    @Override
    public int ClassTotalCount() {
        return classmapper.ClassTotalCount();
    }

    @Override
    public List<ClassDTO> ClassView() {
        System.out.println("classview진입");
        List<ClassDTO> ClassList = Collections.emptyList();
        int cnt = classmapper.ClassTotalCount();
        if (cnt > 0) {
            ClassList = classmapper.ClassView();
        }

        return ClassList;
    }
}
