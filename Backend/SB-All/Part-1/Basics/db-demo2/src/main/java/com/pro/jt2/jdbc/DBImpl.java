package com.pro.jt2.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBImpl implements  Database{
    @Autowired
    JdbcTemplate jt;
    @Override
    public boolean createTable() {
        String sql_st="create table user(uid int, uname varchar(32),loc varchar(32));";
        jt.execute(sql_st);
        return true;
    }
    @Override
    public void insertData() {
        String sql_st="insert into user values(101,'Rahul','Bangalore');";
        jt.update(sql_st);
    }
    @Override
    public List getData() {

        return jt.queryForList("select * from user;");
    }
    @Override
    public int noofUsers() {
        String sql_st = "select count(uid) from user;";
        return jt.queryForObject(sql_st,Integer.class);
    }

    @Override
    public void delete_All_Users() {
        jt.update("delete from user;");
    }
}
