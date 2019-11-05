<%--
  Created by IntelliJ IDEA.
  User: gengte
  Date: 2019/10/31
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h4>查询所有</h4>
<a href="/account/findAll">/account/findAll</a><br>

<h4>添加账户</h4>
<form action="/account/saveAccount" method="post">
    name:<input type="text" name="name"/><br>
    money:<input type="text" name="money"/><br>
    <input type="submit" value="add"/>
</form>
<br>
</body>
</html>
