package com.example.moviedemo.service;

import com.example.moviedemo.entity.Users;

/**
 * (Users)表服务接口
 *
 * @author makejava
 * @since 2020-12-24 17:38:05
 */
public interface UsersService {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    Users queryById(Integer userid);

}
