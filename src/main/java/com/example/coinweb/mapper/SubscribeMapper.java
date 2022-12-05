package com.example.coinweb.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface SubscribeMapper {
    int insertSubscribe(HashMap<String, String> params);
}
