package com.pro.jpa1.runner;

import com.pro.jpa1.model.Product;
import com.pro.jpa1.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    ProductRepository repo;

    @Override
    public void run(String... args) throws Exception {
    // save product data in to product table
    //repo.save(new Product("Samsung Mobile",45000.45));
    repo.save(new Product("Iphone 12",55000.45));
    repo.save(new Product("Vivo",65000.45));
    repo.save(new Product("Nothing Mobile",75000.45));
    System.out.println("Data Inserted");
    }
}
