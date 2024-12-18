package com.pro.demoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
