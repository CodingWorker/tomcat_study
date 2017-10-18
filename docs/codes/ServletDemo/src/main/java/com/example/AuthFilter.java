package com.example;

import javax.servlet.FilterChain;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by daiya on 2017/7/20.
 */
@WebServlet
public class AuthFilter extends HttpFilter {

    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse rsp, FilterChain chain){

    }
}
