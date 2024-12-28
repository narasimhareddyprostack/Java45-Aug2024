package com.pro.jpamongodb.runner;

import com.pro.jpamongodb.document.EmpDocument;
import com.pro.jpamongodb.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    EmpDocument empDoc;
    @Override
    public void run(String... args) throws Exception {
        empDoc.save(new Employee(101,"Rahul","Wayand",45000.45));
        System.out.println("New Document Created in mongoDB Collection");
    }
}
