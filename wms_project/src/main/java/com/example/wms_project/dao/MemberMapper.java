package com.example.wms_project.dao;

import com.example.wms_project.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<Member> getAllMemberList();

}
