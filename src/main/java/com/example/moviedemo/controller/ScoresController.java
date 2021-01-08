package com.example.moviedemo.controller;

import com.example.moviedemo.service.ScoresService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Scores)表控制层
 *
 * @author makejava
 * @since 2020-12-24 17:37:58
 */
@RestController
@CrossOrigin
@RequestMapping("scores")
public class ScoresController {
    /**
     * 服务对象
     */
    @Resource
    private ScoresService scoresService;


}
