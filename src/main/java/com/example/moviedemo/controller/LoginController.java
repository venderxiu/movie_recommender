package com.example.moviedemo.controller;

import com.example.moviedemo.entity.Users;
import com.example.moviedemo.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    @Resource
    private UsersService usersService;

    @PostMapping("/login")
    public boolean login(@RequestParam("userid") int id,@RequestParam("password") String password){
        Users user= usersService.queryById(id);
        if (user.getPassword().equals(password))
            return true;
        return false;
    }
}
