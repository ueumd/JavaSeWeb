<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/3
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="person" class="com.daysun.javaweb.javabean.Person" scope="page"></jsp:useBean>
<jsp:setProperty name="person" property="name" value="string字符串"/>
<%
    person.setSex("男");
    person.setAge(20);
    person.setMarried(false);
%>

<ul>
    <li><jsp:getProperty name="person" property="name"/></li>
    <li><%=person.getAge()%></li>
    <li><%=person.getSex()%></li>
    <li><%=person.isMarried()%></li>
</ul>

</body>
</html>
