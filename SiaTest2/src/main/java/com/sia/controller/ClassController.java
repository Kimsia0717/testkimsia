package com.sia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sia.domain.ClassDTO;
import com.sia.service.ClassService;

@Controller
public class ClassController {
    @Autowired
    ClassService classservice;

    @PostMapping(value = "/classin/in")
    public String classInPost(RedirectAttributes rttr, ClassDTO dto) {
        System.out.println("classpost진입");
        System.out.println(dto);
        int result = classservice.Classin(dto);
        System.out.println(result);
        if (result == 1) {
            rttr.addFlashAttribute("result", "반신청이 정상적으로 되었습니다.");
            return "redirect:/member/main";

        } else {
            return "redirect:/member/main";
        }
    }

    @GetMapping(value = "/classin/in")
    public String classInGet(Model model) {
        System.out.println("classinGet진입");
        List<ClassDTO> classlist = classservice.ClassView();
        model.addAttribute("classlist", classlist);
        return "classin/classrq";
    }

    @PostMapping(value = "/classin/call")
    @ResponseBody
    public int classCallPost(@RequestParam(value = "userIds[]", required = false) List<String> checkArray) {
        System.out.println("classCallPost진입");
        int result = 0;
        for (String id : checkArray) {
            result = classservice.ClassCall(id);
        }
        return result;
    }

}
