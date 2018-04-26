package com.it.service.mapper;


import com.it.service.domain.Blog;


/**
 * Created by Administrator on 2016/5/25.
 */
public interface BlogMapper{
    void addBlog(Blog blog);
    Blog get(long id);
    Blog deserialBlog(String str);
}
