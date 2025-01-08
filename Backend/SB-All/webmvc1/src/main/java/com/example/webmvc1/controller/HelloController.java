package com.example.webmvc1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String getIndexPage(Model model){
        String message = "Welcome to Spring Boot!";
        model.addAttribute("msg",message);
        System.out.println("Test Case 123");
        return "index";
    }
    @RequestMapping("/admin")
    public String getAdminPage(){
        return  "admin";
    }
    @RequestMapping("/user")
    public String getUserPage(){
        return "user";
    }
}
