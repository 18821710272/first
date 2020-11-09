<%--
  Created by IntelliJ IDEA.
  User: 14460
  Date: 2020/11/9
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>detail</title>
</head>
<body>
<form action="update" method="post" style="margin: auto">
    <input type="hidden" name="id" value="${user.u_id}">
    用户姓名:<input type="text" name="name" value="${user.u_name}"><br>
    用户密码:<input type="text" name="pass" value="${user.u_pass}"><br>
    用户性别:<input type="text" name="sex" value="${user.u_sex}"><br>
    VIP:<input type="text" name="vip" value="${user.u_vip}"><br>
    <input type="submit" value="提交修改">
</form>
</body>
</html>
