<%--
  Created by IntelliJ IDEA.
  User: dell5471
  Date: 2021/8/3
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("key","123" );
%>
表达式脚本输出的值：<%= request.getAttribute("key")%><br/>
El表达式：${key}

</body>
</html>
