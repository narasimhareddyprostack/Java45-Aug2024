package com.pro.jdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    DatabaseDemo demo;

    @Override
    public void run(String... args) throws Exception {

        demo.createTable();
         //demo.insertData();
        /*
        List user_List=demo.getData();

        System.out.println(user_List);
        user_List.stream().forEach(user-> System.out.println(user));


         */

    }
}
