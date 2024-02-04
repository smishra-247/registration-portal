package com.smishra.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Index_page {

    @GetMapping("/")
    public String index_page() {
        return "index";
    }

}
