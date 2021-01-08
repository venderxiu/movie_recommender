package com.example.moviedemo.entity;

import java.io.Serializable;

/**
 * (Scores)实体类
 *
 * @author makejava
 * @since 2020-12-24 17:37:57
 */
public class Scores implements Serializable {
    private static final long serialVersionUID = 286524061890331655L;

    private Integer userid;

    private Integer movieid;

    private Double rating;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Scores(Integer userid,Integer movieid,Double rating) {
        this.userid = userid;
        this.movieid = movieid;
        this.rating = rating;
    }
}
