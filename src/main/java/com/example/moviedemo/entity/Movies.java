package com.example.moviedemo.entity;

import java.io.Serializable;

/**
 * (Movies)实体类
 *
 * @author makejava
 * @since 2020-12-24 17:37:06
 */
public class Movies implements Serializable {
    private static final long serialVersionUID = 216212223459129764L;

    private Integer movieid;

    private String title;

    private String genres;

    private String cover;


    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getCover() { return cover; }

    public void setCover(String cover) {
        this.cover = cover;
    }
    public Movies(){}
    public Movies(Integer movieid,String title,String genres,String cover) {
        this.movieid = movieid;
        this.title = title;
        this.genres = genres;
        this.cover = cover;
    }
}
