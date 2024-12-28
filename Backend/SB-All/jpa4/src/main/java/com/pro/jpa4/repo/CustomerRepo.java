package com.pro.jpa4.repo;

import com.pro.jpa4.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
   //select *From customer_tab where custname like 'M%';
   public abstract List<Customer> findByCustNameLike(String pattern);

   //select *from customer_tab where custname like 'M%' and custLoc="Kochi";
   public abstract  List<Customer> findByCustNameLikeAndCustLoc(String pattern,String loc);
   public abstract  List<Customer> findByCustNameLikeOrCustLoc(String pattern,String loc);
}
