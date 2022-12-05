package com.example.coinweb.repository;

import com.example.coinweb.mapper.SubscribeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class SubscribeRepository {

    @Autowired
    SubscribeMapper mapper;

    public int insertSubscribe(HashMap<String, String> params) {
        return mapper.insertSubscribe(params);
    }
}
