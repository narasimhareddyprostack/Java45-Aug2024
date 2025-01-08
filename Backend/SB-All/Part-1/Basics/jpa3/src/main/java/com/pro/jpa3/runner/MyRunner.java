package com.pro.jpa3.runner;

import com.pro.jpa3.model.Employee;
import com.pro.jpa3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    EmployeeRepository repo;

    @Override
    public void run(String... args) throws Exception {
    /*
    repo.save(new Employee("Rahul",45000.45));
    repo.save(new Employee("Sonia",55000.55));
    repo.save(new Employee("Priya",65000.65));
    repo.save(new Employee("Modi",75000.75));
    repo.save(new Employee("Rajni",85000.85));
     */
        //repo.findAll().forEach(System.out::println);

        //repo.findByEmpNameLike("%a").forEach(System.out::println);
        //repo.findByEmpSalGreaterThanEqual(70000.00).forEach(System.out::println);
        repo.findByEmpNameLikeAndEmpSalGreaterThanEqual("%a",60000.00).forEach(System.out::println);


    }
}
