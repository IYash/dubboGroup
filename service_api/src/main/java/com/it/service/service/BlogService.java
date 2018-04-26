package com.it.service.service;

import com.it.service.domain.Blog;
import com.it.service.domain.BlogS;

/**
 * @author huangchangling on 2017/9/22 0022
 */
public interface BlogService {

    /**
     * 数据库交互insert/select
     */

    public void addBlog(Blog blog);

    public Blog getBlog(long id);

    public Blog deserialBlogString(String blogStr);

    public BlogS deserialBlogSString(String blogStr);

    public  void mkerror();
}
