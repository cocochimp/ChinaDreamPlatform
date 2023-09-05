package com.cocochimp.chinesedream.controller;

import com.cocochimp.chinesedream.entity.User;
import com.cocochimp.chinesedream.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class JDBCController {

    @Autowired
    private UserMapper userMapper;

    //1-1、查询全部信息(测试)
    @GetMapping("/queryUser")
    //这里没有写实体类，用Map来封装数据
    public String useList(Model model){
        model.addAttribute("msg",userMapper.useList());
        return "index";
    }

    //1-2、查询人物信息通过姓名
    @GetMapping("/queryUserByName")
    //这里没有写实体类，用Map来封装数据
    public String queryUserByName(User user, Model model){
        List<Map<String, Object>> mapList = userMapper.queryUserByName(user);
        if(mapList.isEmpty()){
            model.addAttribute("msg","账号或密码错误!");
            return "views/login";
        }else{
            return "index";
        }
    }

    //2、用户信息注册
    @GetMapping("/addUser")
    public String addUser(User user,Model model){
        String result = userMapper.addUser(user);
        if(result.equals("success")){
            model.addAttribute("msg","注册成功!");
            return "views/login";
        }else{
            model.addAttribute("msg","失败成功!");
            return "views/login";
        }
    }

}
