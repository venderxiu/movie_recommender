package com.example.moviedemo.service;

import com.example.moviedemo.entity.Movietypes;

/**
 * (Movietypes)表服务接口
 *
 * @author makejava
 * @since 2020-12-24 17:37:22
 */
public interface MovietypesService {

    /**
     * 通过ID查询单条数据
     *
     * @param mtypeid 主键
     * @return 实例对象
     */
    Movietypes queryById(Integer mtypeid);


    /**
     * 通过类型查询类型ID
     *
     *
     * @return 实例对象
     */
    Movietypes queryByType(String typename);

}
