package com.example.moviedemo.dao;

import com.example.moviedemo.entity.Movies;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Movies)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-27 14:35:32
 */
@Mapper
public interface MoviesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param movieid 主键
     * @return 实例对象
     */
    Movies queryById(Integer movieid);

    /**
     * 类型电影
     * @param type
     * @return 类型电影列表
     */
    List<Movies> typeByPage(@Param("type") String type,@Param("now") int now,@Param("rows") int rows);

    /**
     * 总数
     * @param type
     * @return
     */
    Long typeMoviesTotal(@Param("type") String type);
    /**
     * 查找所有movies 返回所有电影列表
     *
     *
     * @return 实例对象
     */
    Movies selectAllMovies();
    /**
     * 通过电影名称关键词查询数据(模糊查询)
     * @return 实例对象
     */
    List<Movies> selectKeyWords(@Param("title") String title,@Param("now") int now,@Param("rows") int rows);


    //新增
    /**
     * 通过关键字模糊查询
     */
    Long searchSize(@Param("title") String title);
}
