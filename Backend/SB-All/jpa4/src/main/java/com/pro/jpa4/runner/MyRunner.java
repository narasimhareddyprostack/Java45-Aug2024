package com.pro.jpa4.runner;

import com.pro.jpa4.model.Customer;
import com.pro.jpa4.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    CustomerRepo cust_Repo;

    @Override
    public void run(String... args) throws Exception {
        cust_Repo.save(new Customer(104,"Modi","New Delhi"));
    }
}
