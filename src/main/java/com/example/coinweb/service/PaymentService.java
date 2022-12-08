package com.example.coinweb.service;

import com.example.coinweb.repository.MemberRepository;
import com.example.coinweb.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository repository;

    public int insertPayment(HashMap<String, Object> params) {

        return repository.insertPayment(params);
    }

    public List<HashMap<String, Object>> selectAllPayment(String email) {
        return repository.selectAllPayment(email);
    }

    public Double selectTotalPayment(String email) {
        return repository.selectTotalPayment(email);
    }
}
