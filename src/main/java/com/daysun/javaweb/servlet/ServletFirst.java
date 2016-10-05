package com.daysun.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/**
 * 访问方式：
 * 注解方式
 * web.xml配置servlet
 */

//映射访问路径 http://localhost:8080/my/bb?name=hello&pass=123456&color=blue,red,green,yellow
//@WebServlet("/my/bb")
public class ServletFirst extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //调用doGet()
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

		/*
        *	设置参数的编码
		*	tomcat低版本get请求不行，设置不了
		*/
        request.setCharacterEncoding("utf-8");

        //notusedGet(request);

        //god method
        System.out.println(request.getMethod() + "请求方式：");
        String name = request.getParameter("name");
        String pass = request.getParameter("password");

        System.out.println(name);
        System.out.println(pass);
        System.out.println("----------------------------------");

        request.setAttribute("test","setAttribute");

        //获取所有提交的数据
        Enumeration<String> enums = request.getParameterNames();
        while (enums.hasMoreElements()) {
            String paramName = enums.nextElement();


            //接收checkobx多选
            if ("color".equals(paramName)) {
                System.out.print(paramName + ":");
                String[] hobits = request.getParameterValues("color");
                for (String h : hobits) {
                    System.out.print(h + ",");
                }
                System.out.println("");
            } else {
                String ParamValue = request.getParameter(paramName);
                System.out.println(paramName + "=" + ParamValue);
            }

        }
    }

    //这个方法不好用   notusedGet(request);
    private void notusedGet(HttpServletRequest request) {
        System.out.println("Get请求方式：");
        String value = request.getQueryString();
        System.out.println(value);//name=hello&pass=2334
    }

    //这个方法不好用   notusedPost(request);
    private void notusedPost(HttpServletRequest request) throws IOException {
        System.out.println("Post请求方式：");
        InputStream in = request.getInputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = in.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));//name=hello&pass=2334
        }
    }
}

