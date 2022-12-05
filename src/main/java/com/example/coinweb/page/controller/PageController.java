package com.example.coinweb.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goSignup")
    public String goSignup() {
        return "signup";
    }

    @GetMapping("/goLogin")
    public String goLogin() {
        return "login";
    }

    @GetMapping("/goPay")
    public String goPay(HttpSession session) {
        String email = (String) session.getAttribute("email");
        if (email == null || email.equals("")) {
            return "login";
        }

        return "pay";
    }

    @GetMapping("/goMarket")
    public String goMarket(HttpSession session) {
        String email = (String) session.getAttribute("email");
        if (email == null || email.equals("")) {
            return "login";
        }

        return "market";
    }

    @GetMapping("/goHistory")
    public String goHistory(HttpSession session) {
        String email = (String) session.getAttribute("email");
        if (email == null || email.equals("")) {
            return "login";
        }

        return "history";
    }
}
