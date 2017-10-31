package com.example;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by daiyan on 2017/7/20.
 */
@WebService
public class AboutServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse rsp) throws ServletException, IOException {
        String name=req.getParameter("name");
        Writer writer=rsp.getWriter();
        writer.write("info of "+name);
    }
}
