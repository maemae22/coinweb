package com.example.coinweb.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface BuyMapper {
    int insertBuy(HashMap<String, Object> params);
    List<HashMap<String, Object>> selectAllBuy(String email);
    Double selectTotalBuy(String email);
}
