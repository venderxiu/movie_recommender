package com.example.moviedemo.service;

import com.example.moviedemo.entity.Scores;

import java.util.HashMap;

/**
 * (Scores)表服务接口
 *
 * @author makejava
 * @since 2020-12-24 17:37:58
 */
public interface ScoresService {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    Scores queryById(Integer userid);
    /**
     * 查询平均评分前20的电影作为热门电影
     */
    HashMap<Integer,Double> queryHotMovie();

}
