package com.example.coinweb.controller;

import com.example.coinweb.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    MemberService service;

    @PostMapping("/signup")
    public String signup(@RequestParam HashMap<String, String> params) {
        service.insertMember(params);
        return "index";
    }

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String, String> params, HttpSession session) {
        String email = service.selectMember(params);

        if (email == null || email.equals("")) {
            return "signup";
        } else {
            session.setAttribute("email", email);
            return "index";
        }
    }

    @GetMapping("/goLogout")
    public String goLogout(HttpSession session) {
        session.removeAttribute("email");
        return "index";
    }

}
