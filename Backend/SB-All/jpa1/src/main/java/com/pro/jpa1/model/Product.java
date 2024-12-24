package com.pro.jpa1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer prodId;
    private String prodName;
    private Double prodPrice;

    //Default constructor
    public Product() {
        super();
    }
    //Id constructor
    public Product(Integer prodId) {
        super();
        this.prodId = prodId;
    }
    //parameterized constructor without id
    public Product(String prodName, Double prodPrice) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }
    //parameterized constructor with id
    public Product(Integer prodId, String prodName, Double prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
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

    public Double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Double prodPrice) {
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }
}
