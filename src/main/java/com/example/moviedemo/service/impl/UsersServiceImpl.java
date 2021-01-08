package com.example.moviedemo.service.impl;

import com.example.moviedemo.dao.UsersDao;
import com.example.moviedemo.entity.Users;
import com.example.moviedemo.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2020-12-24 17:38:05
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;
    @Override
    public Users queryById(Integer userid) {
        return usersDao.queryById(userid);
    }


}
