package com.example.moviedemo.service.impl;

import com.example.moviedemo.dao.MoviesDao;
import com.example.moviedemo.entity.Movies;
import com.example.moviedemo.service.MoviesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Movies)表服务实现类
 *
 * @author makejava
 * @since 2020-12-24 17:37:11
 */
@Service("moviesService")
public class MoviesServiceImpl implements MoviesService {
    @Resource
    private MoviesDao moviesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param movieid 主键
     * @return 实例对象
     */
    @Override
    public Movies queryById(Integer movieid) {
        try {
            return this.moviesDao.queryById(movieid);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Movies> queryAllByLimit(int offset, int limit) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Movies insert(Movies movies) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Movies update(Movies movies) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean deleteById(Integer movieid) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public List<Movies> typeByPage(String type, int now, int rows) {
        now=(now-1)*rows;
        return moviesDao.typeByPage(type, now, rows);
    }

    @Override
    public Long typeMoviesTotal(String type) {
        return moviesDao.typeMoviesTotal(type);
    }

    @Override
    public Movies selectAllMovies() {
        return moviesDao.selectAllMovies();
    }

    @Override
    public List<Movies> selectKeyWords(String title, int now,int rows) {
        now=(now-1)*rows;
        return moviesDao.selectKeyWords(title,now,rows);
    }

    @Override
    public Long searchSize(String title) {
        return moviesDao.searchSize(title);
    }

    // /**
    //  * 查询多条数据
    //  *
    //  * @param offset 查询起始位置
    //  * @param limit  查询条数
    //  * @return 对象列表
    //  */
    // @Override
    // public List<Movies> queryAllByLimit(int offset, int limit) {
    //     return this.moviesDao.queryAllByLimit(offset, limit);
    // }

    // /**
    //  * 新增数据
    //  *
    //  * @param movies 实例对象
    //  * @return 实例对象
    //  */
    // @Override
    // public Movies insert(Movies movies) {
    //     this.moviesDao.insert(movies);
    //     return movies;
    // }

    // /**
    //  * 修改数据
    //  *
    //  * @param movies 实例对象
    //  * @return 实例对象
    //  */
    // @Override
    // public Movies update(Movies movies) {
    //     this.moviesDao.update(movies);
    //     return this.queryById(movies.getMovieid());
    // }

    // /**
    //  * 通过主键删除数据
    //  *
    //  * @param movieid 主键
    //  * @return 是否成功
    //  */
    // @Override
    // public boolean deleteById(Integer movieid) {
    //     return this.moviesDao.deleteById(movieid) > 0;
    // }
}
