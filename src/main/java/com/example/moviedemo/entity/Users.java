package com.example.moviedemo.entity;

import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2020-12-24 17:38:04
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 943217604533237640L;

    private Integer userid;

    private String name;

    private String password;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) { this.password = password; }

    public Users(Integer userid,String name,String password) {
        this.userid = userid;
        this.name = name;
        this.password = name;
    }

}
