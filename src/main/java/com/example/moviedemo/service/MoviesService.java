package com.example.moviedemo.service;

import com.example.moviedemo.entity.Movies;

import java.util.List;


/**
 * (Movies)表服务接口
 *
 * @author makejava
 * @since 2020-12-24 17:37:10
 */
public interface MoviesService {

    /**
     * 通过ID查询单条数据
     *
     * @param movieid 主键
     * @return 实例对象
     */
    Movies queryById(Integer movieid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Movies> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param movies 实例对象
     * @return 实例对象
     */
    Movies insert(Movies movies);

    /**
     * 修改数据
     *
     * @param movies 实例对象
     * @return 实例对象
     */
    Movies update(Movies movies);

    /**
     * 通过主键删除数据
     *
     * @param movieid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer movieid);
    /**
     * 类型电影
     * @param type
     * @return 类型电影列表
     */
    List<Movies> typeByPage(String type,int now,int rows);

    /**
     * 总数
     * @param type
     * @return
     */
    Long typeMoviesTotal(String type);

    /**
     * 查找所有movies 返回所有电影列表
     *
     *
     * @return 实例对象
     */
    Movies selectAllMovies();

    /**
     * 通过电影名称关键词查询数据(模糊查询)
     *
     *
     * @return 实例对象
     */
    List<Movies> selectKeyWords(String title, int now,int rows);

    //新增
    /**
     * 通过关键字模糊查询
     */

    Long searchSize(String title);


}
