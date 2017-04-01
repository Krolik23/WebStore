package com.webstoresite.controller;


import com.webstoresite.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
@RequestMapping("/webstore")
public class productController {

    @RequestMapping("/products")
    public String listOfProducts(Model model){

        Product iPhone5s = new Product("iPhone5s",new BigDecimal(500.0));
        iPhone5s.setDescription("Apple iPhone5s, smartfon with 4' screen of 680x1136 resolution " +
                "and 8 megapixels camera");
        iPhone5s.setUnitsInStock(1000L);
        model.addAttribute("products",iPhone5s);
        return "productsInStock";
    }
}
