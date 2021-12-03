package com.atguigu.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "Servlet", value = "/Servlet")
public class myServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("注解形式");
//
//        //ServletConfig servletConfig = getServletConfig();
//        ServletContext servletContext = getServletContext();
//        String username = servletContext.getInitParameter("username");
//        System.out.println(username);
//        System.out.println(servletContext.getContextPath());
//        System.out.println(servletContext.getRealPath("/"));
//
//        servletContext.setAttribute( "key1","values");

        System.out.println(request.getRequestURI());
        System.out.println(request.getRequestURL());
        System.out.println(request.getRemoteHost());

// 获取请求参数
        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String[] hobby = request.getParameterValues("hobby");
        System.out.println("用户名：" + username);
//        System.out.println("密码：" + password);
//        System.out.println("兴趣爱好：" + Arrays.asList(hobby));
        System.out.println("get");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
        System.out.println("兴趣爱好：" + Arrays.asList(hobby));

    }
}
