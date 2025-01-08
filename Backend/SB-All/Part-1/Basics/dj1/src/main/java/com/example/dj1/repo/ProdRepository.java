package com.example.dj1.repo;

import com.example.dj1.model.Product;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdRepository extends JpaRepository<Product,Integer> {
}
