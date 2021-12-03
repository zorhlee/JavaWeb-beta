package com.atguigu.filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("1preverse");
        System.out.println("Filter1 Thread"+Thread.currentThread().getName());
        servletRequest.setAttribute("key1","value1");
               filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Filter1 Thread"+Thread.currentThread().getName());

        System.out.println("1post");
    }

    @Override
    public void destroy() {

    }
}
