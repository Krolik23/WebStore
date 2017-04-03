package com.webstoresite.controller;


import com.webstoresite.domain.Product;
import com.webstoresite.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.expression.Lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/webstore")
public class productController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/products")
    public String listOfProducts(Model model){

        Product iPhone5s = new Product("iPhone5s",new BigDecimal(500.0));
        iPhone5s.setDescription("Apple iPhone5s, smartfon with 4' screen of 680x1136 resolution " +
                "and 8 megapixels camera");
        iPhone5s.setUnitsInStock(1000L);

        model.addAttribute("products",productRepository.findAll());

        return "productsInStock";
    }

















}
