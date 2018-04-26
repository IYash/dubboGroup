package com.it.service.service;

import com.it.service.domain.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangchangling on 2018/1/29 0029
 */
@Service("defaultBlogServiceAdaptor")
public class BlogServiceAdaptor implements BlogServiceA{

   @Autowired
   private BlogService defaultBlogService;

    public void add(Blog blog){
        defaultBlogService.addBlog(blog);
        defaultBlogService.getBlog(23l);
    }

}
