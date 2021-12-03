package com.atguigu.filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("2preverse");
        System.out.println("Filter2 Thread"+Thread.currentThread().getName());
        System.out.println("Filter2" +servletRequest.getParameter("username"));
        System.out.println("key1"+servletRequest.getAttribute("key1"));
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Filter2 Thread"+Thread.currentThread().getName());
        System.out.println("2post");
    }

    @Override
    public void destroy() {

    }
}
