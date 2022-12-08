package com.example.coinweb.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PaymentMapper {
    int insertPayment(HashMap<String, Object> params);
    List<HashMap<String, Object>> selectAllPayment(String email);
    Double selectTotalPayment(String email);
}
