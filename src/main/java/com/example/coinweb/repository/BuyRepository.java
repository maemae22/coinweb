package com.example.coinweb.repository;

import com.example.coinweb.mapper.BuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class BuyRepository {
    @Autowired
    BuyMapper mapper;

    public int insertBuy(HashMap<String, Object> params) {
        return mapper.insertBuy(params);
    }

    public List<HashMap<String, Object>> selectAllBuy(String email) {
        return mapper.selectAllBuy(email);
    }

    public Double selectTotalBuy(String email) {
        return mapper.selectTotalBuy(email);
    }
}
