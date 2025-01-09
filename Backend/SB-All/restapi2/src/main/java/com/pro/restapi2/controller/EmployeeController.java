package com.pro.restapi2.controller;

import com.pro.restapi2.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RequestMapping("/emp")
@RestController
public class EmployeeController {
    @GetMapping("/showA")
    public String getDetails(){
        return "Good Morning - String Response";
    }
    @GetMapping("/showB")
    public Employee getEmployee(){
        return new Employee(101,"Rahul",45000.45);
    }
    @GetMapping("/showC")
    public List<Employee> getEmployees(){
        return Arrays.asList(new Employee(102,"Sonia",55000.55),
                             new Employee(103,"Priya",65000.55),
                             new Employee(104,"Modi",75000.55),
                             new Employee(105,"Amith",85000.55)
                );
    }
    @GetMapping("/showD")
    public Map<String,Employee> getAllEmployees(){
        Map<String,Employee> emap = new HashMap<>();
        emap.put("emp1",new Employee(106,"VS",55000.55));
        emap.put("emp2",new Employee(107,"Vijay",65000.55));
        emap.put("emp3",new Employee(108,"Rajni",75000.55));
        return emap;
    }
    @GetMapping("/showE")
    public ResponseEntity<String> getRespone(){
        ResponseEntity<String> entity =new ResponseEntity<>("Welcome to RE", HttpStatus.OK);
        return  entity;
    }
}
