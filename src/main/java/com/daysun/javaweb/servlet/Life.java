package com.daysun.javaweb.servlet;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/*
 * servlet生命周期 4步
 * Servlet程序是由WEB服务器调用，web服务器收到客户端的Servlet访问请求后：
　　①Web服务器首先检查是否已经装载并创建了该Servlet的实例对象。如果是，则直接执行第④步，否则，执行第②步。
　　②装载并创建该Servlet的一个实例对象。
　　③调用Servlet实例对象的init()方法。
　　④创建一个用于封装HTTP请求消息的HttpServletRequest对象和一个代表HTTP响应消息的HttpServletResponse对象，
      然后调用Servlet的service()方法并将请求和响应对象作为参数传递进去。
　　⑤WEB应用程序被停止或重新启动之前，Servlet引擎将卸载Servlet，并在卸载之前调用Servlet的destroy()方法。
 */
@WebServlet("/life")
public class Life extends HttpServlet {

    public Life() {
        System.out.println("1、servlet对象被创建了");
    }

    @Override
    public void init() {
        System.out.println("2、init方法被调用");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) {
        //如果创建后再刷新只会调用servic方法
        System.out.println("3、service方法被调用");
    }

    @Override
    public void destroy() {
        //tomcat服务停止后调用该方法
        System.out.println("4、servlet对象销毁了");
    }
}
