package com.pro.democlr;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println(Arrays.asList(args));
    }
}
