package com.gomaabura.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {

    @GetMapping("test")
    public String getTst() {
        return "test";
    }
    
}
