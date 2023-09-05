# 网站总体概述

> 网站主题介绍                                           

​    中国梦是国家的梦，是民族的梦，同时也是每个中国人的梦，随着中国共产党第二十次全国代表大会的圆满举行，中华人民共和国正向着民族伟大复兴的历史进程迈去。

为此，我设计了以“中国梦”为主题的网站开发，目的是为了宣传中华民族伟大复兴的历史进程以及弘扬中国共产党第二十次全国人民代表大会的精神。

该网站的主题是：高举中国特色社会主义伟大旗帜，全面贯彻新时代中国特色社会主义思想，弘扬伟大建党精神，自信自强、守正创新，踔厉奋发、勇毅前行，为全面建设社会主义现代化国家、全面推进中华民族伟大复兴而团结奋斗，全面推进依法治国，积极发展社会主义先进文化，突出保障和改善民生，集中力量实施脱贫攻坚战，大力推进生态文明建设，坚决维护国家安全，防范化解重大风险，保持社会大局稳定，大力度推进国防和军队现代化建设。



# 运行环境

- java:8（jdk1.8）
- mysql:5.6.35



# 核心依赖

> 后端技术栈

| 依赖                          | 版本   |
| ----------------------------- | ------ |
| Spring Boot                   | 2.6.4  |
| thymeleaf（Spring Boot）      | 2.6.4  |
| springSecurity（Spring Boot） | 2.6.4  |
| jdbc（Spring Boot）           | 2.6.4  |
| mysql-connector-java          | 8.0.16 |
| shiro                         | 1.4.1  |
| swagger                       | 1.5.13 |



# 项目相关技术

本项目是基于SpringBoot技术框架进行开发，并将Maven技术作为项目管理工具，实现依赖管理功能；应用了SpringSecurity作为SpringBoot技术框架的安全框架，以实现用户登录的“权限管理”以及“拦截”功能。

> SpringBoot理论介绍

![abcd](https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/save/abcd.jpg)

Spring Boot 基于 Spring 开发，其用于快速、敏捷地开发新一代基于 Spring 框架的应用程序。而其“开箱即用”、“约定大于配置”、“内嵌式容器简化Web项目”和“没有冗余代码生成和XML配置的要求”等特点使得后端开发变得更容易；



> SpringSecurity理论介绍

![11](https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/save/11.png)

Spring Security 是 Spring 家族中的一个安全管理框架。该安全框架有两大核心功能：“认证”和“授权”。其中，“认证”是指验证当前访问系统的是不是本系统的用户，并且要确认具体是哪个用户；“授权”是指经过认证后判断当前用户是否有权限进行某个操作。



> Thymeleaf理论介绍

![img](https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/clip_image006.gif)

Thymeleaf 是新一代 Java 模板引擎，与 Velocity、FreeMarker 等传统 Java 模板引擎不同，Thymeleaf 支持 HTML 原型，其文件后缀为“.html”，因此它可以直接被浏览器打开，此时浏览器会忽略未定义的 Thymeleaf 标签属性，展示 thymeleaf 模板的静态页面效果；当通过 Web 应用程序访问时，Thymeleaf 会动态地替换掉静态内容，使页面动态显示。



> Ajax理论介绍

Ajax是一种异步 JavaScript 和 XML，用于创建快速动态网页的技术。通过在后台与服务器进行少量数据交换，Ajax可以使网页实现异步更新。这意味着可以在不重新加载整个网页的情况下，对网页的某部分进行更新。传统的网页（不使用 Ajax）如果需要更新内容，必需重载整个网页面。

 

# 网站实现

该网站的主要页面排版风格共有6种：分别为“注册页面”、“登录页面”、“主页面”、“热门推荐页面”、“新闻中心页面”和“具体新闻页面”。下面依次实现出其页面设计：

## 1、注册页面

![注册](https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/save/注册.png)

 

## 2、登录页面

![bbb](https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/save/bbb.png)

 

## 3、主页面

![img](https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/clip_image040.gif)



## 4、热门推荐页面

![img](https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/clip_image042.gif)

 

## 5、新闻中心页面

![img](https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/clip_image044.jpg)



## 6、具体新闻页面

![img](https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/clip_image046.jpg)



