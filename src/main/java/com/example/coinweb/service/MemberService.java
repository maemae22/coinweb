package com.example.coinweb.service;

import com.example.coinweb.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MemberService {

    @Autowired
    MemberRepository repository;

    public int insertMember(HashMap<String, String> params) {
        return repository.insertMember(params);
    }

    public String selectMember(HashMap<String, String> params) {
        return repository.selectMember(params);
    }
}
