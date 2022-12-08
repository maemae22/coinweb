package com.example.coinweb.controller;

import com.example.coinweb.service.MemberService;
import com.example.coinweb.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
public class PaymentController {

    @Autowired
    PaymentService service;

    @GetMapping("/point")
    public String point(@RequestParam HashMap<String, Object> params, HttpSession session) {

        params.put("email", session.getAttribute("email"));
        service.insertPayment(params);
        return "index";
    }

    @RequestMapping("/pointList")
    public @ResponseBody List<HashMap<String, Object>> pointList(HttpSession session) {
        String email = (String) session.getAttribute("email");
        return service.selectAllPayment(email);
    }
}
