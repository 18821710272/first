<%--
  Created by IntelliJ IDEA.
  User: 14460
  Date: 2020/11/9
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<table  align="center" border="1" cellspacing="0">
    <tr><th><a href="add.jsp">新增</a></th></tr>
    <tr>
        <th>用户ID</th>
        <th>用户姓名</th>
        <th>用户密码</th>
        <th>用户性别</th>
        <th>VIP</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${users}" var="user">
        <tr>
            <th>${user.u_id}</th>
            <th>${user.u_name}</th>
            <th>${user.u_pass}</th>
            <th>${user.u_sex}</th>
            <th>${user.u_vip}</th>
            <th><a href="del?id=${user.u_id}">删除</a>  <a href="selectOneById?id=${user.u_id}">修改</a></th>
        </tr>
    </c:forEach>
</table>
</body>
</html>