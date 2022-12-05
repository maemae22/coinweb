package com.example.coinweb.controller;

import com.example.coinweb.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class SubscribeController {

    @Autowired
    SubscribeService service;

    @GetMapping("/subscribe")
    public String subscribe(@RequestParam HashMap<String, String> params) {
        service.insertSubscribe(params);
        return "redirect:/";
    }
}
