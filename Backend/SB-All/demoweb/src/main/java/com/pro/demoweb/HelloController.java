package com.pro.demoweb;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    //URL = localhost:8080/
    @GetMapping("/")
    public String sayHello(){
        return "Hello GM";
    }
    //URL = localhost:8080/about
    @GetMapping("/about")
    public String sayGoodBye(){
        return "Hello,GoodBye";
    }

}
