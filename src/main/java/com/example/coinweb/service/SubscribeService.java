package com.example.coinweb.service;

import com.example.coinweb.repository.SubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SubscribeService {

    @Autowired
    SubscribeRepository repository;

    public int insertSubscribe(HashMap<String, String> params) {
        return repository.insertSubscribe(params);
    }
}
