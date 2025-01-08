package com.pro.jdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseDemo implements DemoI {
    @Autowired
    JdbcTemplate jt;

    @Override
    public void createTable() {
        jt.execute("create table user(uid int, uname varchar(32));");
    }

    @Override
    public void insertData() {
        jt.update("insert into employee values(102,'Sonia',550000);");
    }

    @Override
    public List getData() {
        return jt.queryForList("select *from employee;");
    }
}
