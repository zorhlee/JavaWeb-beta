<%--
  Created by IntelliJ IDEA.
  User: dell5471
  Date: 2021/8/3
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%
                   pageContext.setAttribute("key","123p");
                    request.setAttribute("key","123r");
                   session.setAttribute("key","123s");
                    application.setAttribute("key","123a");
   %>
${key}
</body>
</html>
