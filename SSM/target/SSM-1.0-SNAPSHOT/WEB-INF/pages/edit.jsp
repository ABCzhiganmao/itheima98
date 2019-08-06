<%--
  Created by IntelliJ IDEA.
  User: 95731
  Date: 2019/7/4
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改账户</title>
</head>
<body>
<h2>修改账户</h2>
<form action="${pageContext.request.contextPath}/account/editAccount" method="post">
    <input type="hidden" name="aid" value="${account.aid}">
    账号：<input name="number" value="${account.number}"><br>
    余额：<input name="balance" value="${account.balance}"><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
