package com.smishra.app.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Error_page implements ErrorController {
    @RequestMapping("/error")
    public String ErrorHandler() {
        return "error";
    }
    
}
