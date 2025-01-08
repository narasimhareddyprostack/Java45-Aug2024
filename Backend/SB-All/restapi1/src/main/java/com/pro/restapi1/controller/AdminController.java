package com.pro.restapi1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    //lh:8081/admin/users/101
    @GetMapping("/users/{eid}")
    public String getData(@PathVariable Integer eid){
        return "Employee Id"+eid;
    }
    @GetMapping("/users/")
    public  String getUserId(@RequestParam("uid") Integer uid){
        return  "User ID"+uid;
    }
}
