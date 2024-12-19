package com.pro.jt2;

import com.pro.jt2.jdbc.DBImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements ApplicationRunner {
    @Autowired
    DBImpl db;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //db.createTable();
        //db.insertData();
        //List users=db.getData();
        //users.stream().forEach(user-> System.out.println(user));
        //System.out.println(db.noofUsers());
        db.delete_All_Users();
        System.out.println("All Users Deleted- go for Lunch");
    }
}
