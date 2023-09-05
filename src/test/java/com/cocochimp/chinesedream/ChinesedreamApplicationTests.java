package com.cocochimp.chinesedream;

import com.cocochimp.chinesedream.entity.User;
import com.cocochimp.chinesedream.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ChinesedreamApplicationTests {

    //数据源自动装配
    @Autowired
    DataSource dataSource;
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        //查看默认的数据源
        System.out.println(dataSource.getClass());//class com.zaxxer.hikari.HikariDataSource

        //有了数据源，就可以获得数据库连接
        try {
            Connection connection = dataSource.getConnection();
            //查看连接
            System.out.println(connection);//HikariProxyConnection@2028767654 wrapping com.mysql.cj.jdbc.ConnectionImpl@3596b249
            //关闭连接
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test01(){
        List<Map<String, Object>> maps = userMapper.useList();
        Iterator it = maps.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    void test02() {
        List<Map<String, Object>> maps = userMapper.useList();
        for (int i = 0,j = 1; i < maps.size(); i++,j++) {
            //System.out.println(maps.get(i));
            for (String key : maps.get(i).keySet()) {
                if(key.equals("name")){
                    Object value1 = maps.get(i).get(key);
                    Object value2 = maps.get(i).get("pwd");
                    System.out.println("名字为:"+value1+" 密码为:"+value2);
                }
            }
        }
    }

}

