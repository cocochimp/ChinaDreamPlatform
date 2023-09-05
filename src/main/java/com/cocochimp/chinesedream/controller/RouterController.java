package com.cocochimp.chinesedream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {

    //一级页面
    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "views/login";
    }

    @RequestMapping("/publicize")
    public String toPublicize(){
        return "pages/publicize";
    }

    //二级页面
    @RequestMapping("/news")
    public String toNewsCenter(){
        return "pages/twoLevel/newscenter";
    }

    //三级页面
    @RequestMapping("/news/guojia/{id}")
    public String toNewsGuojia(@PathVariable("id") int id){
        System.out.println(id);
        return "pages/threeLevel/guojia01";
    }

    @RequestMapping("/news/yingxiong/{id}")
    public String toNewsYingXiong(@PathVariable("id") int id){
        System.out.println(id);
        return "pages/threeLevel/yingxiong01";
    }


}