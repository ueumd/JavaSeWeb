package com.daysun.javaweb.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 当servlet配置了初始化参数后，web容器在创建servlet实例对象时，
 * 会自动将这些初始化参数封装到ServletConfig对象中，
 * 并在调用servlet的init方法时，将ServletConfig对象传递给servlet。
 * 进而，我们通过ServletConfig对象就可以得到当前servlet的初始化参数信息。
 */

public class ServletConfigTest extends HttpServlet {

    //定义ServletConfig对象来接收配置的初始化参数
    private ServletConfig config;


    /**
     * 19      * 当servlet配置了初始化参数后，web容器在创建servlet实例对象时，
     * 20      * 会自动将这些初始化参数封装到ServletConfig对象中，并在调用servlet的init方法时，
     * 21      * 将ServletConfig对象传递给servlet。进而，程序员通过ServletConfig对象就可以
     * 22      * 得到当前servlet的初始化参数信息。
     * 23
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取在web.xml中配置的初始化参数
        Enumeration<String> params = this.config.getInitParameterNames();
        while (params.hasMoreElements()) {
            String name = params.nextElement();
            String value = config.getInitParameter(name);
            response.getWriter().print(name + "=" + value + "<br/>");
            System.out.println(name + " = " + value);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
