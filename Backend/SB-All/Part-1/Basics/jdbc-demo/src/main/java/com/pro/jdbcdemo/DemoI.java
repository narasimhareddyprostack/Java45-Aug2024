package com.pro.jdbcdemo;

import java.util.List;

public interface DemoI {
    public void createTable();
    public abstract  void insertData();
    public abstract List getData();
}
