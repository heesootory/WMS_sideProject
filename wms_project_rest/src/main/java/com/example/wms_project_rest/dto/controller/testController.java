package com.example.wms_project_rest.dto.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class testController {

    @GetMapping("/client")
    public String test(){
        return "test success!!";
    }

}

