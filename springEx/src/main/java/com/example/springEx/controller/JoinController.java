package com.example.springEx.controller;

import com.example.springEx.dto.User;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class JoinController {
    @GetMapping(value="/user", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User userData(){
        User user = new User("hello",20);

        return user;
    }
    @PostMapping(value = "/save-user", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String saveUser(@RequestBody User user){

        if(user.getUsername().equals("mmm") && user.getAge() == 25)
        {
            return "success";
        }

        else{
            return "fail";
        }

    }
}
