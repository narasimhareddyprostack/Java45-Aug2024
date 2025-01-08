package com.pro.demo1;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    public void sayHello(){
        System.out.println("Hello, World");
    }
}
