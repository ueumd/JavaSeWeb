<%@ page language="java" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <title>Request对象实现请求转发</title>
    <meta charset="UTF-8">
</head>
<body>
使用普通方式取出存储在request对象中的数据：
<h3 style="color: red">
    <%=(String)request.getAttribute("data")%>
</h3>
使用EL表达式取出存储在request对象中的数据：
<h3 style="color: green">${data}</h3>
</body>
</html>

