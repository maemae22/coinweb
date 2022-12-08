package com.example.coinweb.service;

import com.example.coinweb.mapper.BuyMapper;
import com.example.coinweb.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BuyService {
    @Autowired
    BuyRepository repository;

    public int insertBuy(HashMap<String, Object> params) {
        return repository.insertBuy(params);
    }

    public List<HashMap<String, Object>> selectAllBuy(String email) {
        return repository.selectAllBuy(email);
    }

    public Double selectTotalBuy(String email) {
        return repository.selectTotalBuy(email);
    }
}
