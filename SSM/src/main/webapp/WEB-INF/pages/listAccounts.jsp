<%--
  Created by IntelliJ IDEA.
  User: 95731
  Date: 2019/7/4
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<h2>账户列表</h2>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#addbtn").click(function () {
            location = "${pageContext.request.contextPath}/account/addAccountUI";
        });
        $("#delbtn").click(function () {
            var aidLength = $("#f1 input[type='checkbox']:checked").length;
            if (aidLength == 0) {
                alert("请先选择要删除的记录")
                return;
            }
            var sure = confirm("您确定要删除吗？");
            if (sure) {
                $("#f1").submit();
            }

        });
    })

</script>

<head>

    <title>账户列表</title>
</head>
<body>
<input type="button" id="addbtn" value="添加"><br>
<input type="button" id="delbtn" value="删除"><br>

<form action="${pageContext.request.contextPath}/account/delAccounts" id="f1" method="post">
    <table border="1" width="78%">
        <thead>
        <tr>
            <th>选择</th>
            <th>序号</th>
            <th>账号</th>
            <th>余额</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${accounts}" var="account" varStatus="vs">
            <tr>
                <td>
                    <input type="checkbox" name="aids" value="${account.aid}">
                </td>
                <td>${vs.count}</td>
                <td>${account.number}</td>
                <td>${account.balance}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/account/editAccountUI?aid=${account.aid}">修改</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
<%--${accounts[0].balance}<br>--%>
<%--${accounts[1].number}--%>
</body>
</html>
