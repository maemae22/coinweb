package com.example.coinweb.controller;

import com.example.coinweb.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class ContactController {

    @Autowired
    ContactService service;

    @PostMapping("/requestCall")
    public String requestCall(@RequestParam HashMap<String, String> params) {
        service.insertContact(params);
        return "index";
    }
}
