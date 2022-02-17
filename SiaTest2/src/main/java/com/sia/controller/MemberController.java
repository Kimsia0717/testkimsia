package com.sia.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sia.domain.MemberDTO;
import com.sia.service.MemberService;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberservice;

    @PostMapping(value = "/member/join")
    public String memberJoinPost(RedirectAttributes rttr, MemberDTO dto, HttpSession session) {
        int result = memberservice.memberJoin(dto);
        System.out.println(result);
        if (result == 1) {
            rttr.addFlashAttribute("result", "회원가입이 정상적으로 완료되었습니다");
            return "redirect:/member/login";
        } else {

            return "redirect:/member/join";
        }

    }

    @GetMapping(value = "/member/join")
    public void memberJoinGet(RedirectAttributes rttr, MemberDTO dto) {
        System.out.println("get진입");
    }

    @GetMapping(value = "/member/login")
    public void loginGet(Model model, MemberDTO dto) {
        System.out.println("get진입");
    }

    @PostMapping(value = "/member/login")
    public String loginPost(RedirectAttributes rttr, MemberDTO dto, HttpSession session) {
        MemberDTO member = memberservice.memberLogin(dto);
        if (member != null) {
            session.setAttribute("member", member);
            return "redirect:/member/main";
        } else {
            return "redirect:/member/login";
        }

    }

    @GetMapping(value = "/member/main")
    public void memberMainGet() {
        System.out.println("memberMainGet진입");
    }

    @PostMapping(value = "/member/idCheck")
    @ResponseBody
    public int joinIdCheckPost(RedirectAttributes rttr, String userId) {
        System.out.println("joinIdCheckPost진입");
        System.out.println(userId);
        int result = memberservice.idCheck(userId);
        System.out.println(result);
        return result;

    }

}
