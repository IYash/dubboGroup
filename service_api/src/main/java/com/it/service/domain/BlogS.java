package com.it.service.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huangchangling on 2017/9/22 0022
 */
public class BlogS implements Serializable{
    private int id;
    private String message;
    private Date createTime;
    private String info;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
