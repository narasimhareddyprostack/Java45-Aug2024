package com.pro.jpamdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JpaMdbApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaMdbApplication.class, args);
    }
}
