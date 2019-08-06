<%--
  Created by IntelliJ IDEA.
  User: 95731
  Date: 2019/7/4
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login">
    username:<input type="text"><br>
    password:<input type="text"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
