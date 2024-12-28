package com.pro.jpa4.runner;

import com.pro.jpa4.model.Customer;
import com.pro.jpa4.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    CustomerRepo cust_Repo;

    @Override
    public void run(String... args) throws Exception {
        //cust_Repo.save(new Customer(106,"Rahul","Wayanad"));

        //cust_Repo.findByCustNameLike("M%").forEach(System.out::println);

        //List<Customer> users =cust_Repo.findByCustNameLikeOrCustLoc("M%","Kochi");

        //for(int i=0;i<=users.size()-1;i++){
        //   System.out.println(users.get(i).getCustName()+"-"+users.get(i).getCustLoc());
        //}

        cust_Repo.findByCustNameLikeOrCustLoc("R%","Kochi")
                .forEach((user)->{
                    System.out.println(user.getCustName());
                });
    }
}
