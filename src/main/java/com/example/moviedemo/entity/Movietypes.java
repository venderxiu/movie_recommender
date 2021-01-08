package com.example.moviedemo.entity;

import java.io.Serializable;

/**
 * (Movietypes)实体类
 *
 * @author makejava
 * @since 2020-12-24 17:37:22
 */
public class Movietypes implements Serializable {
    private static final long serialVersionUID = 623978411143704087L;

    private Integer mtypeid;

    private String typename;


    public Integer getMtypeid() {
        return mtypeid;
    }

    public void setMtypeid(Integer mtypeid) {
        this.mtypeid = mtypeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

}
