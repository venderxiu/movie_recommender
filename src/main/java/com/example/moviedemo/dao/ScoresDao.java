package com.example.moviedemo.dao;

import com.example.moviedemo.entity.Scores;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

/**
 * (Scores)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-27 14:36:52
 */
@Mapper
public interface ScoresDao {

    /**
     * 通过ID查询单条数据
     *
     *
     * @return 实例对象
     */
    Scores queryById(Integer id);

    /**
     * 查询平均评分前20的电影作为热门电影
     */
    HashMap<Integer,Double> queryHotMovie();



}
