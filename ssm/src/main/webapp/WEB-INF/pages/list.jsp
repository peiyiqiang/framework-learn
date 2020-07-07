<%--
  Created by IntelliJ IDEA.
  User: peiyiqiang
  Date: 2020/6/1
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>操作成功</h3>

    <c:forEach items="${users}" var="user">
        ${user} <br/>
    </c:forEach>


</body>
</html>
