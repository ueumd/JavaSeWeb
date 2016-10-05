package com.daysun.javaweb.servletreqres;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/10/5.
 */
@WebServlet("/RequestAttribute")
public class RequestAttribute extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = "大家好我正在总结JavaWeb";
        request.setAttribute("data", data);
        //客户端访问RequestAttribute这个Servlet后，RequestAttribute通知服务器将请求转发(forward)到test.jsp页面进行处理

        //请求转发的基本概念
        request.getRequestDispatcher("test.jsp").forward(request, response);
    }
}
