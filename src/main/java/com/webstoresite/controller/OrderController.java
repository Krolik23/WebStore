package com.webstoresite.controller;

import com.webstoresite.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/order/P3346/2")
    public String process(){

        try{
            orderService.processOrder(1,2);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        return "redirect:/webstore/products";
    }







}
