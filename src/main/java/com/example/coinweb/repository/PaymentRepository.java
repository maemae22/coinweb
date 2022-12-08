package com.example.coinweb.repository;

import com.example.coinweb.mapper.MemberMapper;
import com.example.coinweb.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class PaymentRepository {

    @Autowired
    PaymentMapper mapper;

    public int insertPayment(HashMap<String, Object> params) {
        return mapper.insertPayment(params);
    }

    public List<HashMap<String, Object>> selectAllPayment(String email) {
        return mapper.selectAllPayment(email);
    }

    public Double selectTotalPayment(String email) {
        return mapper.selectTotalPayment(email);
    }

}
