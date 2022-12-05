package com.example.coinweb.repository;

import com.example.coinweb.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ContactRepository {

    @Autowired
    ContactMapper mapper;

    public int insertContact(HashMap<String, String> params) {
        return mapper.insertContact(params);
    }
}
