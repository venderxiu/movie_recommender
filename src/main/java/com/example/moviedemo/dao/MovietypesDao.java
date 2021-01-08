package com.example.moviedemo.dao;

import com.example.moviedemo.entity.Movietypes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * (Movietypes)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-27 14:36:12
 */
@Mapper
public interface MovietypesDao {

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
     * @return 实例对象
     */
    Movietypes queryByType(String typename);


    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Movietypes> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param movietypes 实例对象
     * @return 对象列表
     */
    List<Movietypes> queryAll(Movietypes movietypes);

    /**
     * 新增数据
     *
     * @param movietypes 实例对象
     * @return 影响行数
     */
    int insert(Movietypes movietypes);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Movietypes> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Movietypes> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Movietypes> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Movietypes> entities);

    /**
     * 修改数据
     *
     * @param movietypes 实例对象
     * @return 影响行数
     */
    int update(Movietypes movietypes);

    /**
     * 通过主键删除数据
     *
     * @param mtypeid 主键
     * @return 影响行数
     */
    int deleteById(Integer mtypeid);

}
