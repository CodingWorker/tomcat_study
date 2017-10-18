package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by daiya on 2017/7/20.
 */
//每一个servlet要想通过路由被访问需要设置映射表
@WebServlet
public class IndexServlet extends HttpServlet {
    private String redirectUrl;

    @Override
    public void init(){
        //获取web.xml中为定义servlet时定义的初始化参数
        String redirectUrl=this.getInitParameter("redirectUrl");
        this.redirectUrl=redirectUrl;
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException{
        String redirect=req.getParameter("redirect");
        if("1".equals(redirect)){
            resp.sendRedirect(redirectUrl);
        }

        String name=req.getParameter("name");
        Writer writer=resp.getWriter();
        writer.write("hello "+name);
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}
