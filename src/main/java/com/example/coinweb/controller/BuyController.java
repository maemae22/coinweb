package com.example.coinweb.controller;

import com.example.coinweb.service.BuyService;
import com.example.coinweb.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
public class BuyController {
    @Autowired
    BuyService buyService;
    @Autowired
    PaymentService paymentService;


    @RequestMapping("/buyList")
    public @ResponseBody List<HashMap<String, Object>> buyList(HttpSession session) {
        String email = (String) session.getAttribute("email");
        return buyService.selectAllBuy(email);
    }


    @GetMapping("/checkBalance")
    public @ResponseBody String checkBalance(@RequestParam double total, HttpSession session) {
        String email = (String) session.getAttribute("email");
        if (email == null || email.equals("")) {
            return "login";
        }

        try{
            Double totalPayment = paymentService.selectTotalPayment(email);
            if (totalPayment == null) {
                totalPayment = Double.valueOf(0);
            }

            Double totalBuy = buyService.selectTotalBuy(email);
            if (totalBuy == null) {
                totalBuy = Double.valueOf(0);
            }

            // email 에 해당하는 사용자가 가지고 있는 잔액
            Double nowMoney = totalPayment - totalBuy;

            if ( total <= nowMoney) {
                return "can";
            } else {
                return "cannot";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/buyCoin")
    public @ResponseBody int buyCoin(@RequestParam HashMap<String, Object> params, HttpSession session) {
        String email = (String) session.getAttribute("email");
        params.put("email", email);
        return buyService.insertBuy(params);
    }
}
