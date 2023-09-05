package com.cocochimp.chinesedream.mapper;

import com.cocochimp.chinesedream.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<Map<String,Object>> useList();

    List<Map<String, Object>> queryUserByName(User user);

    String addUser(User user);
}
