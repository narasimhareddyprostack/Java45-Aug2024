package com.pro.restapi2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/")
    public String getAdminRootReq(){
        return "Admin Root Request";
    }
    //Pass Data throught the Browser location storage key and value
    //using Postman - headers key and values
    @PostMapping("/read")
    public String getToken(@RequestHeader String token, @RequestHeader String pincode){
        return "JWT"+token + "Pincode:"+pincode;
    }
    @PostMapping("/login")
    public String getLogin(@RequestBody String mydata){
        return  mydata;
    }
}
