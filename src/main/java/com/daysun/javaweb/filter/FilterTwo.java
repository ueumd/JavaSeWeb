package com.daysun.javaweb.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;


public class FilterTwo implements Filter {

    public FilterTwo(){
        System.out.println("FilterTwo");
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("-------过滤器FilterTwo开始---------");
        String initParam=filterConfig.getInitParameter("param");
        System.out.println("param=="+initParam);
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("FilterDemo执行前!!!!");
        chain.doFilter(request, response);
        System.out.println("FilterDemo执行后!!!!");

    }

    public void destroy() {
        System.out.println("----过滤器销毁----");
    }

}
