package com.pro.jpa4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_tab")
public class Customer {
    @Id
    private Integer custId;
    @Column(name="cust_name")
    private String custName;
    @Column(name="c_loc")
    private String custLoc;

    public Customer(){}

    public Customer(Integer custId) {
        this.custId = custId;
    }

    public Customer(Integer custId, String custName, String custLoc) {
        this.custId = custId;
        this.custName = custName;
        this.custLoc = custLoc;
    }

    public Customer(String custName, String custLoc) {
        this.custName = custName;
        this.custLoc = custLoc;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustLoc() {
        return custLoc;
    }

    public void setCustLoc(String custLoc) {
        this.custLoc = custLoc;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custLoc='" + custLoc + '\'' +
                '}';
    }
}
