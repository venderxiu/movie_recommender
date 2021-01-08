package com.example.moviedemo.service.impl;

import com.example.moviedemo.dao.ScoresDao;
import com.example.moviedemo.entity.Scores;
import com.example.moviedemo.service.ScoresService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * (Scores)表服务实现类
 *
 * @author makejava
 * @since 2020-12-24 17:37:58
 */
@Service("scoresService")
public class ScoresServiceImpl implements ScoresService {
    @Resource
    private ScoresDao scoresDao;

    @Override
    public Scores queryById(Integer userid) {
        return scoresDao.queryById(userid);
    }

    @Override
    public HashMap<Integer, Double> queryHotMovie() {
        return scoresDao.queryHotMovie();
    }

}
