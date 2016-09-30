package com.daysun.javaweb.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * WEB容器在启动时，它会为每个WEB应用程序都创建一个对应的ServletContext对象，它代表当前web应用。
 * ServletConfig对象中维护了ServletContext对象的引用，开发人员在编写servlet时，
 * 可以通过ServletConfig.getServletContext方法获得ServletContext对象。
 * 由于一个WEB应用中的所有Servlet共享同一个ServletContext对象，
 * 因此Servlet对象之间可以通过ServletContext对象来实现通讯。ServletContext对象通常也被称之为context域对象。
 *
 * 获取WEB应用的初始化参数
 */

public class ServletContextTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext context=this.getServletContext();

        String contextInitParam=context.getInitParameter("url");
        response.getWriter().print(contextInitParam);
        System.out.println(contextInitParam);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
