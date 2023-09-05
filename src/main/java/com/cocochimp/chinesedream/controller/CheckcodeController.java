package com.cocochimp.chinesedream.controller;

import com.cocochimp.chinesedream.util.DrawCheckcode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class CheckcodeController {

    @RequestMapping("/check")
    @ResponseBody
    public String checkcodeCheck(String codeClient, HttpServletRequest request){
        String codeServer = (String)request.getSession().getAttribute("CHECKCODE");
        if (codeClient.equals(codeServer)){
            return "验证码正确";
        }else{
            return "验证码错误";
        }
    }

    @RequestMapping("/checkcode")
    public void checkcodeMake(HttpServletResponse response, HttpServletRequest request) throws IOException {
        //画验证码
        DrawCheckcode drawCheckcode = new DrawCheckcode();
        BufferedImage image = drawCheckcode.doDraw();

        //设置响应头，防止缓存
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Expires","0");
        //将验证码的值保存在session中，以便校验
        request.getSession().setAttribute("CHECKCODE",drawCheckcode.getCheckCode());
        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(image,"jpeg",outputStream);
        outputStream.flush();   //清空缓冲区数据
        outputStream.close();   //关闭流
    }

}
