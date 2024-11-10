package com.example.wms_project.service;

import com.example.wms_project.dao.MemberMapper;
import com.example.wms_project.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberMapper memberMapper;

    @Autowired
    public MemberService(MemberMapper memberMapper){
        this.memberMapper = memberMapper;
    }

    public List<Member> getAllMemberList(){
        return memberMapper.getAllMemberList();
    }

}
