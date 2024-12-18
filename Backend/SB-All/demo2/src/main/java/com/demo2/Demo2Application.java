package com.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {
    @Autowired
    static HelloBean bean;

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
        bean.sayHello();
    }

}
