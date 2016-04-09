package com.leo.controller;

import com.leo.entity.User;  
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  




/** 
 * <p>User: leo
 * <p>Date: 14-12-22 
 * <p>Version: 1.0 
 */  
//@EnableAutoConfiguration  
@RestController  
@RequestMapping("/user")  
public class UserController {  
  
    @RequestMapping("/{id}")  
    public User view(@PathVariable("id") Long id) {  
        User user = new User();  
        user.setId(id);  
        user.setName("zhang");  
        return user;  
    }  
  
    //public static void main(String[] args) {  
    //    SpringApplication.run(UserController.class);  
    //}  
  
}  