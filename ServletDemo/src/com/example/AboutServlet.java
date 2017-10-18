package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by daiya on 2017/7/20.
 */
@WebServlet
public class AboutServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rsp)throws IOException{
        String name=req.getParameter("name");
        Writer writer=rsp.getWriter();
        writer.write("info of "+name);
    }
}
