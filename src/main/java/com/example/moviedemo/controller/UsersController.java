package com.example.moviedemo.controller;

import com.example.moviedemo.service.UsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Users)表控制层
 *
 * @author makejava
 * @since 2020-12-24 17:38:05
 */
@RestController
@CrossOrigin
@RequestMapping("users")
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UsersService usersService;


}
