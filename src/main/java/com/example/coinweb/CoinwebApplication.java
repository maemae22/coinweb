package com.example.coinweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.example.coinweb.mapper"})
public class CoinwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinwebApplication.class, args);
    }

}
