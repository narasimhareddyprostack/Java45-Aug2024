package com.pro.jpa3.repository;

import com.pro.jpa3.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    // select * from emp_tab where employee_name like 'R%';
    public abstract List<Employee> findByEmpNameLike(String str);

    //select *From emp_tab where salary >=60000;
    public abstract List<Employee> findByEmpSalGreaterThanEqual(Double sal);

    // select *from emp_tab where employee_name like '%a' and salary >=60000;

    public  abstract  List<Employee> findByEmpNameLikeAndEmpSalGreaterThanEqual(String str,Double sal);
}
