package com.example.dj1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer prodId;
    private String prodName;
    private double prodCost;

    public Product(){
        super();
    }
    public Product(Integer prodId) {
        this.prodId = prodId;
    }

    public Product(String prodName, double prodCost) {
        this.prodName = prodName;
        this.prodCost = prodCost;
    }

    public Product(Integer prodId, String prodName, double prodCost) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodCost = prodCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodCost=" + prodCost +
                '}';
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdCost() {
        return prodCost;
    }

    public void setProdCost(double prodCost) {
        this.prodCost = prodCost;
    }
}
