package com.example.coinweb.repository;

import com.example.coinweb.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mapper;

    public int insertMember(HashMap<String, String> params) {
        return mapper.insertMember(params);
    }

    public String selectMember(HashMap<String, String> params) {
        return mapper.selectMember(params);
    }
}
