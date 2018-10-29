<%--
  Created by IntelliJ IDEA.
  User: Tiramisu
  Date: 2018/10/22/022
Time: 17:09
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm测试</title>
</head>
<body>
<form action="/addUser" method="post">
    <input type="hidden" name="addid">
    用户名：<input name="userName" type="text">
    密码：<input name="passWord" type="password">
    年龄：<input name="age" type="text">
    <input type="submit" value="提交">
</form>
</body>
</html>
