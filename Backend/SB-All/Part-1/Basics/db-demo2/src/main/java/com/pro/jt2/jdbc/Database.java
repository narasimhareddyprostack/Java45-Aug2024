package com.pro.jt2.jdbc;

import java.util.List;

public interface Database {
    boolean createTable();
    void insertData();
    List getData();

    int noofUsers();
    void delete_All_Users();
}
