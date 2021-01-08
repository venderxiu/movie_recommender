package com.example.moviedemo.controller;

import com.example.moviedemo.service.MovietypesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Movietypes)表控制层
 *
 * @author makejava
 * @since 2020-12-24 17:37:22
 */
@RestController
@CrossOrigin
@RequestMapping("/movietypes")
public class MovietypesController {
    /**
     * 服务对象
     */
    @Resource
    private MovietypesService movietypesService;

    // /**
    //  * 通过主键查询单条数据
    //  *
    //  * @param id 主键
    //  * @return 单条数据
    //  */
    // @GetMapping("selectOne")
    // public Movietypes selectOne(Integer id) {
    //     return this.movietypesService.queryById(id);
    // }
    /**
     *
     * 热门推荐
     * 返回
     */

}
