package com.example.coinweb.repository;

import com.example.coinweb.mapper.MemberMapper;
import com.example.coinweb.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class PaymentRepository {

    @Autowired
    PaymentMapper mapper;

    public int insertPayment(HashMap<String, Object> params) {
        return mapper.insertPayment(params);
    }

}
