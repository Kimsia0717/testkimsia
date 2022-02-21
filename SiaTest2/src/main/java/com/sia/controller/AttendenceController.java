package com.sia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sia.domain.AttendenceDTO;
import com.sia.service.AttendenceService;

@Controller
public class AttendenceController {
    @Autowired
    AttendenceService attendenceservice;

    @GetMapping(value = "/classin/attendence")
    public String AttendenceListGet(Model model, AttendenceDTO dto) {
        List<AttendenceDTO> atlist = attendenceservice.AtdcSelect(dto);
        model.addAttribute("classdate", atlist.get(0).getClassDate());
        model.addAttribute("atlist", atlist);
        return "classin/attendence";
    }

    @PostMapping(value = "/classin/attendence")
    @ResponseBody
    public int AttendenceListPost(@RequestBody List<AttendenceDTO> atdclist) {
        int result = 0;
        for (AttendenceDTO dto : atdclist) {
            result = attendenceservice.AtdcInsert(dto);
            System.out.println(dto);
        }
        return result;
    }

}
