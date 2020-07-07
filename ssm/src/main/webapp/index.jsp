<%--
  Created by IntelliJ IDEA.
  User: peiyiqiang
  Date: 2020/6/1
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>保存用户</h3>
    <a href="user/findAll">查询</a>
    <br/>

    <h3>保存用户</h3>
    <form action="user/save" method="post">
        姓名：<input type="text" name="username"><br/>
        生日：<input type="text" name="birthday"><br/>
        性别：<input type="text" name="sex"><br/>
        <input type="submit" value="保存"><br/>
    </form>
    <br/>

    <h3>更新用户</h3>
    <form action="user/update" method="post">
        id：<input type="text" name="id"><br/>
        姓名：<input type="text" name="username"><br/>
        生日：<input type="text" name="birthday"><br/>
        性别：<input type="text" name="sex"><br/>
        <input type="submit" value="更新"><br/>
    </form>
    <br/>

    <h3>删除用户</h3>
    <form action="user/delete" method="post">
        id：<input type="text" name="id"><br/>
        <input type="submit" value="删除"><br/>
    </form>
    <br/>

    <h3>根据id查找用户</h3>
    <form action="user/find" method="post">
        id：<input type="text" name="id"><br/>
        <input type="submit" value="查找"><br/>
    </form>
    <br/>

</body>
</html>
