package com.test.mvc.controller;

import com.it.service.domain.Blog;
//import com.it.service.domain.BlogS;
import com.it.service.service.BlogServiceA;
import com.it.service.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author huangchangling on 2017/9/22 0022
 */
@Controller
public class DubboController {

    @Autowired
    private BlogService defaultblogService;
    //用于测试链式服务调用BlogServiceA--BlogService
    @Autowired
    private BlogServiceA defaultBlogServiceAdaptor;

    @RequestMapping("add.do")
    public void add(Model model){
        Blog blog= new Blog();
        blog.setMessage("dubbo");
        blog.setCreateTime(new Date());
        //defaultblogService.addBlog(blog);
        defaultBlogServiceAdaptor.add(blog);
    }

   /* @RequestMapping("get.do")
    @ResponseBody
    public AjaxResult get(Model model){
        AjaxResult result = new AjaxResult();
        result.setMsg("success");
        result.setFlag(true);
        return result;
    }
    *//**
     * 序列化测试
     *//*
    @RequestMapping("serial1.do")
    @ResponseBody
    public Blog serial1(Model model){
        Blog blog = defaultblogService.getBlog(23);
        System.out.println(blog.toString());
        String jsonStr = JSON.toJSONString(blog);
        return defaultblogService.deserialBlogString(jsonStr);
    }
    @RequestMapping("serial2.do")
    @ResponseBody
    public BlogS serial2(Model model){
        Blog blog = defaultblogService.getBlog(23);
        String jsonStr = JSON.toJSONString(blog);
        return defaultblogService.deserialBlogSString(jsonStr);
    }
    @RequestMapping("serial3.do")
    @ResponseBody
    public Blog serial3(Model model){
        BlogS blogs = new BlogS();
        blogs.setCreateTime(new Date());
        blogs.setMessage("blogs");
        blogs.setId(1);
        blogs.setInfo("info");
        String jsonStr = JSON.toJSONString(blogs);
        return defaultblogService.deserialBlogString(jsonStr);
    }
    @RequestMapping("error.do")
    public void error(Model model){
        defaultblogService.mkerror();
    }*/
}
