package com.daysun.javaweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by Administrator on 2016/10/3.
 */
@WebFilter(filterName = "FilterOne")
public class FilterOne implements Filter {
    public FilterOne() {
        System.out.println("FilterOne");
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("-------FilterOne---------");
        String initParam = filterConfig.getInitParameter("param");
        System.out.println("param==" + initParam);
    }


    public void destroy() {
        System.out.println("----过滤器销毁----");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        System.out.println("FilterDemo执行前!!!!");
        chain.doFilter(req, resp);
        System.out.println("FilterDemo执行后!!!!");
    }

}
