package com.zhiguo.servlet;/*
@date 2021/5/27 - 3:33 下午
*/

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if("hzgNB".equals(username) && "123456".equals(password)){
            req.getSession().setAttribute("user",username);
            resp.getWriter().write("登录成功！");
        }else{
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
