package com.it.service.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huangchangling on 2017/9/22 0022
 */

public class Blog implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String message;
    private Date createTime;
    public Blog() {
    }

    public Blog(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Blog(String message, Date createTime) {
        this.message = message;
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
