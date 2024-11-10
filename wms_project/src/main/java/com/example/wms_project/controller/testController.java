package com.example.wms_project.controller;


import com.example.wms_project.dto.Member;
import com.example.wms_project.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/server")
@RequiredArgsConstructor
public class testController {

    private final MemberService memberService;

    @RequestMapping("/test")
    public String test(){
        return "test success!!";
    }

    @GetMapping("/list")
    public List<Member> findAll(){
        return memberService.getAllMemberList();
    }

}
