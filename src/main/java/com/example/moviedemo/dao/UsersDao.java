package com.example.moviedemo.dao;

import com.example.moviedemo.entity.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Users)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-27 14:37:11
 */
@Mapper
public interface UsersDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    Users queryById(Integer userid);


}
