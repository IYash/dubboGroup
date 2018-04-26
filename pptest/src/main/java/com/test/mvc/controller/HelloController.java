package com.test.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huangchangling on 2017/9/21 0021
 */
@Controller
public class HelloController {

    @RequestMapping("/hello.do")
    public String hello(Model model){
        return "index.jsp";
    }
    @RequestMapping("world.do")
    public void world(Model model){
        throw new RuntimeException("world eroor");
    }
}
