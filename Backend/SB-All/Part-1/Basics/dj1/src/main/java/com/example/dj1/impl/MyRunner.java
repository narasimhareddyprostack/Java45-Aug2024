package com.example.dj1.impl;

import com.example.dj1.model.Product;
import com.example.dj1.repo.ProdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    ProdRepository repo;

    @Override
    public void run(String... args) throws Exception {
    //repo.save(new Product("Pen",75.75));
    repo.save(new Product("Pencil",85.75));
    repo.save(new Product("Market",95.75));
    }
}
