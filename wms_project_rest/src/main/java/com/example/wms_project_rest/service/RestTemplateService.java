package com.example.wms_project_rest.service;

import com.example.wms_project_rest.dto.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Service
public class RestTemplateService {

    public List<Member> getName(){
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:8080")
                .path("/server/list")
                .encode()
                .build()
                .toUri();

        RestTemplate restTemplate = new RestTemplate();
        List<Member> list = restTemplate.getForObject(uri, List.class);

        return list;

    }


}
