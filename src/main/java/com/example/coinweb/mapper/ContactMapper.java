package com.example.coinweb.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface ContactMapper {
    int insertContact(HashMap<String, String> params);
}
