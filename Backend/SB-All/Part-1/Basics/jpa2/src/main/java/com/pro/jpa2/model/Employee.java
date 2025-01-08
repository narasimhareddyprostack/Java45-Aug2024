package com.pro.jpa2.model;

import jakarta.persistence.*;

@Entity
@Table(name="Employee_Tab")
public class Employee {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "eid")
    private Integer empId;
    @Column(name = "ename")
    private String empName;
    @Column(name = "esal")
    private Double empSal;

    //generate overloaded constructor's and setter & getter,toString

    public Employee(){
        super();
    }
    public Employee(Integer empId) {
        this.empId = empId;
    }

    public Employee(String empName,Double empSal){
        this.empName=empName;
        this.empSal=empSal;
    }
    public Employee(Integer empId, String empName, Double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
