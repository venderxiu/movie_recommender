package com.example.moviedemo.controller;

import com.example.moviedemo.entity.Movies;
import com.example.moviedemo.entity.Scorecount;
import com.example.moviedemo.service.MoviesService;
import com.example.moviedemo.service.ScorecountService;
import com.example.moviedemo.util.CoverUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Scorecount)表控制层
 *
 * @author makejava
 * @since 2020-12-24 17:37:50
 */
@RestController
@CrossOrigin
@RequestMapping("scorecount")
public class ScorecountController {
    /**
     * 服务对象
     */
    @Resource
    private ScorecountService scorecountService;
    @Resource
    private MoviesService moviesService;

    /**
     * 热门推荐
     * @return 电影ID
     */
    @PostMapping("/findHotsByPage")
    public Map<String,Object> findHotsByPage(@RequestParam("now") Integer now,@RequestParam("size") Integer size){
        Map<String,Object> result=new HashMap<>();
        now=now==null?1:now;
        size=size==null?8:size;
        if(now*size>100){
            now=13;
            size=4;
        }
        List<Scorecount> scorecounts=scorecountService.findHotsByPage(now, size);

        Movies m=null;
        List<Movies> movies=new ArrayList<>();
        for (Scorecount s: scorecounts){
            m=ByID(s.getMovieid());
            String cover = m.getCover();
            //添加，解析封面
            String coverResult = CoverUtil.coverCut(cover);
            m.setCover(coverResult);
            movies.add(m);
        }
        result.put("hotMovies",movies);
        result.put("hotTotal",100);
        return result;
    }
    @PostMapping("/queryById")
    public Movies ByID(@RequestParam("id") int id){
        return moviesService.queryById(id);
    }




}
