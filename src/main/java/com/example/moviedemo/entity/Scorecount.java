package com.example.moviedemo.entity;

import java.io.Serializable;

/**
 * (Scorecount)实体类
 *
 * @author makejava
 * @since 2020-12-24 17:37:50
 */
public class Scorecount implements Serializable {
    private static final long serialVersionUID = -56052924172214592L;

    private Integer movieid;

    private Integer count;


    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
