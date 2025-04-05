package com.gomaabura.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class DemoController {

    @GetMapping("login")
    public String getLogin() {
        return "login";
    }
    

    @GetMapping("")
    public String getHome() {
        return "test";
    }
    

    @GetMapping("test")
    public String getTst() {
        return "test";
    }

    @GetMapping("/skillsheet")
    public String getSkillsheet() {
        return "skillsheet";
    }
    
    
}
