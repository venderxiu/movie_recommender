package com.example.moviedemo.service;

import com.example.moviedemo.entity.Scorecount;

import java.util.List;

/**
 * (Scorecount)表服务接口
 *
 * @author makejava
 * @since 2020-12-24 17:37:50
 */
public interface ScorecountService {

    /**
     * 通过ID查询单条数据
     *
     * @param movieid 主键
     * @return 实例对象
     */
    Scorecount queryById(Integer movieid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Scorecount> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param scorecount 实例对象
     * @return 实例对象
     */
    Scorecount insert(Scorecount scorecount);

    /**
     * 修改数据
     *
     * @param scorecount 实例对象
     * @return 实例对象
     */
    Scorecount update(Scorecount scorecount);

    /**
     * 通过主键删除数据
     *
     * @param movieid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer movieid);
    /**
     * 热门推荐
     * @return 热门电影
     * @throws Exception
     */
    List<Scorecount> findHotsByPage(int pageNow,int rows);
}
