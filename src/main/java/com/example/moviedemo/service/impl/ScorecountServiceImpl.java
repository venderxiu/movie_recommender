package com.example.moviedemo.service.impl;

import com.example.moviedemo.dao.ScorecountDao;
import com.example.moviedemo.entity.Scorecount;
import com.example.moviedemo.service.ScorecountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Scorecount)表服务实现类
 *
 * @author makejava
 * @since 2020-12-24 17:37:50
 */
@Service("scorecountService")
public class ScorecountServiceImpl implements ScorecountService {
    @Resource
    private ScorecountDao scorecountDao;

    @Override
    public Scorecount queryById(Integer movieid) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Scorecount> queryAllByLimit(int offset, int limit) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Scorecount insert(Scorecount scorecount) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Scorecount update(Scorecount scorecount) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean deleteById(Integer movieid) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Scorecount> findHotsByPage(int pageNow,int rows) {
        int start=(pageNow-1)*rows;
        return scorecountDao.findHotsByPage(start,rows);
    }
    // /**
    //  * 通过ID查询单条数据
    //  *
    //  * @param movieid 主键
    //  * @return 实例对象
    //  */
    // @Override
    // public Scorecount queryById(Integer movieid) {
    //     try {
    //         return this.scorecountDao.queryById(movieid);
    //     } catch (Exception e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }
    // }

    // /**
    //  * 查询多条数据
    //  *
    //  * @param offset 查询起始位置
    //  * @param limit  查询条数
    //  * @return 对象列表
    //  */
    // @Override
    // public List<Scorecount> queryAllByLimit(int offset, int limit) {
    //     return this.scorecountDao.queryAllByLimit(offset, limit);
    // }

    // /**
    //  * 新增数据
    //  *
    //  * @param scorecount 实例对象
    //  * @return 实例对象
    //  */
    // @Override
    // public Scorecount insert(Scorecount scorecount) {
    //     this.scorecountDao.insert(scorecount);
    //     return scorecount;
    // }

    // /**
    //  * 修改数据
    //  *
    //  * @param scorecount 实例对象
    //  * @return 实例对象
    //  */
    // @Override
    // public Scorecount update(Scorecount scorecount) {
    //     this.scorecountDao.update(scorecount);
    //     return this.queryById(scorecount.getMovieid());
    // }

    // /**
    //  * 通过主键删除数据
    //  *
    //  * @param movieid 主键
    //  * @return 是否成功
    //  */
    // @Override
    // public boolean deleteById(Integer movieid) {
    //     return this.scorecountDao.deleteById(movieid) > 0;
    // }
}
