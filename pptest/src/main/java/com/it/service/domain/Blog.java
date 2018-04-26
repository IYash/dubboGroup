package com.it.service.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huangchangling on 2018/1/16 0016
 * dubbo序列化反序列化居然没有serialVersionUID什么事
 */
public class Blog implements Serializable {
    private static final long serialVersionUID = 5454155825314635342L;
    private int id;
    private String message;
    private Date createTime;

    public Blog() {
    }

    public Blog(String message) {
        this.message = message;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Blog(String message, Date createTime) {
        this.message = message;
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String toString(){
       return "[blog]";
    }
}
