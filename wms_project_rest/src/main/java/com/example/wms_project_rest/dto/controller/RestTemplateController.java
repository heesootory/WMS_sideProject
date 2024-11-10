package com.example.wms_project_rest.dto.controller;


import com.example.wms_project_rest.dto.Member;
import com.example.wms_project_rest.service.RestTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RestTemplateController {

    private final RestTemplateService restTemplateService;

    @GetMapping("/list")
    public List<Member> getName(){
        return restTemplateService.getName();
    }

}


