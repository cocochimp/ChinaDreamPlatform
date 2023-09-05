package com.cocochimp.chinesedream.mapper;

import com.cocochimp.chinesedream.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserMapperImpl implements UserMapper{

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public List<Map<String, Object>> useList() {
        String sql = "select * from userchinese";
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql);
        return mapList;
    }

    @Override
    public List<Map<String, Object>> queryUserByName(User user) {
        String sql = "select * from userchinese where username=? and password=?";
        Object[] params = new Object[]{user.getUsername(),user.getPassword()};
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql,params);
        return mapList;
    }

    @Override
    public String addUser(User user) {
        String sql = "insert into userchinese (id,username,password,image) values(default,?,?,?)";
        Object[] params = new Object[]{user.getUsername(),user.getPassword(),user.getImage()};
        int update = jdbcTemplate.update(sql, params);
        if(update==1){
            return "success";
        }else{
            return "false";
        }
    }
}
