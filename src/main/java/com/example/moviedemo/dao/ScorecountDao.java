package com.example.moviedemo.dao;

import com.example.moviedemo.entity.Scorecount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (Scorecount)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-27 14:36:33
 */
@Mapper
public interface ScorecountDao {

    /**
     * 通过ID查询单条数据
     *
     * @param movieid 主键
     * @return 实例对象
     */
    Scorecount queryById(Integer movieid);

    /**
     * 热门电影
     * @param pageNow
     * @param rows
     * @return 电影列表
     */
    public List<Scorecount> findHotsByPage(int pageNow, int rows);
}
