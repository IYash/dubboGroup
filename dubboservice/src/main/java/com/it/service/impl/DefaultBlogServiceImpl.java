package com.it.service.impl;


import com.alibaba.fastjson.JSON;
import com.it.service.domain.Blog;
import com.it.service.domain.BlogS;
import com.it.service.mapper.BlogMapper;
import com.it.service.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author huangchangling on 2017/9/22 0022
 */
@Service("defaultBlogService")
public class DefaultBlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public void addBlog(Blog blog) {
        blogMapper.addBlog(blog);
    }

    @Override
    public Blog getBlog(long l) {
        return blogMapper.get(l);
    }

    @Override
    public Blog deserialBlogString(String s) {
        return JSON.parseObject(s,Blog.class);
    }

    @Override
    public BlogS deserialBlogSString(String s) {
        return JSON.parseObject(s,BlogS.class);
    }

    @Override
    public void mkerror() {
        throw new RuntimeException("service broken");
    }
}
