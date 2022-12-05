package com.example.coinweb.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MemberMapper {
    int insertMember(HashMap<String, String> params);
    String selectMember(HashMap<String, String> params);
}
