package com.example.moviedemo.controller;

import com.example.moviedemo.entity.Movies;
import com.example.moviedemo.service.MoviesService;
import com.example.moviedemo.service.ScorecountService;
import com.example.moviedemo.util.CoverUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Movies)表控制层
 * @author makejava
 * @since 2020-12-24 17:37:13
 */
@RestController
@CrossOrigin
@RequestMapping("/movies")
public class MoviesController {
    /**
     * 服务对象
     */
    @Resource
    private MoviesService moviesService;
    @Resource
    private ScorecountService scorecountService;

    /**
     *返回特定类型电影
     * @param type
     * @return 电影列表
     */
    @PostMapping("/typeByPage")
    public Map<String, Object> typeByPage(@RequestParam("type") String type,@RequestParam("now") Integer now, @RequestParam("size") Integer size){
        Map<String,Object> result=new HashMap<>();
        now=now==null?1:now;
        size=size==null?8:size;
        List<Movies> movies=moviesService.typeByPage(type,now,size);
        Long typeTotal=moviesService.typeMoviesTotal(type);
        //添加
        for (Movies movies1 : movies){
            String coverResult = CoverUtil.coverCut(movies1.getCover());
            movies1.setCover(coverResult);
        }
        result.put("typeMovies",movies);
        result.put("typeTotal",typeTotal);
        return result;
    }
    /**
     * 总数
     */
    @PostMapping("/typeMoviesTotal")
    public Long typeMoviesTotal(@RequestParam("type") String type){
        return moviesService.typeMoviesTotal(type);
    }


    /**
     * 通过电影名称关键词查询数据(模糊查询)
     *
     *
     * @return 实例对象
     */
    //修改
    @PostMapping("/selectKeyWords")
    public Map<String,Object> selectKeyWords(@RequestParam("title") String title, int now,@Param("rows") int rows){
        Map<String,Object> map = new HashMap<>();
        List<Movies> searchResult = this.moviesService.selectKeyWords(title,now,rows);
        for (Movies movies1 : searchResult){
            String coverResult = CoverUtil.coverCut(movies1.getCover());
            movies1.setCover(coverResult);
        }
        //添加了一个方法
        map.put("searchResult",searchResult);
        map.put("totalSearch",moviesService.searchSize(title));
        return map;
    }



}

