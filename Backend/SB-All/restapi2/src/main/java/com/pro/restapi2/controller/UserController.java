package com.pro.restapi2.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {
    @GetMapping("/")
    public String getRootDetails(){
        return "User Root Request";
    }
    //lh:8081/user/101/Rahul/wayand
    @GetMapping("/{eid}/{ename}/{esal}")
    public String getEmpDetails(@PathVariable String eid,
                                @PathVariable String ename,
                                @PathVariable String esal){
        Double esalary = Double.valueOf(esal);
        return  "Employee Id:"+eid+"Name :"+ename+"Location"+esalary;
    }
    //lh:8081/user/details/?uid=201   - url/?key=value
    @GetMapping("/details/")
    public  String getUserId(@RequestParam("uid") String uid){
        return "User Id " + uid;
    }
    //lh:8081/user/more/?uid=201&uname=rahul&loc=Wayand  -  url/?key=value&key=value
    @GetMapping("/more/")
    public  String getUserDetails(@RequestParam("uid") String uid,
                                  @RequestParam("uname") String username,
                                  @RequestParam("loc") String userlocation){
        return "User Id " + uid + "Name:"+username + "Location:"+userlocation;
    }
}
