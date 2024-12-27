package com.pro.jpa2.runner;

import com.pro.jpa2.model.Employee;
import com.pro.jpa2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    EmployeeRepository emp_Repo;

    @Override
    public void run(String... args) throws Exception {
        //Insert records into  Database table - save

        emp_Repo.save(new Employee("Rahul",45000.45));
        emp_Repo.save(new Employee("Sonai",55000.55));
        emp_Repo.save(new Employee("Priyanka",65000.65));

        /*
        //fetch employee record by Id;
        Optional<Employee> obj =emp_Repo.findById(5);
        if(obj.isPresent()){
            System.out.println(obj.get());
        }
        else{
            System.out.println("Employee Not Exits");
        }
         */
        /*
        Fetch all employee records using findAll() method
        emp_Repo.findAll().forEach(employee -> {System.out.println(employee);});
        //emp_Repo.findAll().forEach(System.out::println);
         */
       //delete employee by id
        // emp_Repo.deleteById(1);

        //delete all recors - using deleteAll() / deleteAllInBatch()
        //emp_Repo.deleteAll();
        //emp_Repo.findAll().forEach(System.out::println);
        //emp_Repo.deleteAllInBatch();

    }
}
