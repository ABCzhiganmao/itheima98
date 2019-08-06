<%--
  Created by IntelliJ IDEA.
  User: 95731
  Date: 2019/7/4
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加账户</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/account/addAccount" method="post">
    账号：<input name="number"><br>
    余额：<input name="balance"><br>
    <input type="submit" value="保存">
</form>

</body>
</html>
