package com.example.coinweb.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface PaymentMapper {
    int insertPayment(HashMap<String, Object> params);
}
