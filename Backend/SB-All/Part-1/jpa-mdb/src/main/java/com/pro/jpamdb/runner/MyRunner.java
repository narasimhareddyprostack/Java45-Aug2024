package com.pro.jpamdb.runner;

import com.pro.jpamdb.model.Employee;
import com.pro.jpamdb.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    EmpRepo repo;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inside My Runner");
            repo.save(new Employee(101,"Rahul",45000.45));
            repo.save(new Employee(102,"Sonia",55000.45));
            repo.save(new Employee(103,"Priya",65000.45));

            repo.findAll().forEach((emp)->{
                System.out.println(emp.getEmpName());
            });

            repo.deleteByEmpId(101);
            repo.deleteByEmpName("Sonia");

            repo.findByEmpSalGreaterThanEqual(50000.00).forEach((emp)->{
                System.out.println(emp.getEmpId()+"_"+emp.getEmpName()+"-"+emp.getEmpSal());
            });

            List<Employee> employees=repo.findByEmpNameLike("S%");
            for (Employee emp:employees) {
                System.out.println(emp.getEmpName());
            }

    }
}
