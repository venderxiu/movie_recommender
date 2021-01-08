package com.example.moviedemo.service.impl;

import com.example.moviedemo.dao.MovietypesDao;
import com.example.moviedemo.entity.Movietypes;
import com.example.moviedemo.service.MovietypesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Movietypes)表服务实现类
 *
 * @author makejava
 * @since 2020-12-24 17:37:22
 */
@Service("movietypesService")
public class MovietypesServiceImpl implements MovietypesService {
    @Resource
    private MovietypesDao movietypesDao;

    @Override
    public Movietypes queryById(Integer mtypeid) {
        return movietypesDao.queryById(mtypeid);
    }

    @Override
    public Movietypes queryByType(String typename) {
        return queryByType(typename);
    }

}
