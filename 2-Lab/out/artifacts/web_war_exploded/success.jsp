<%--
  Created by IntelliJ IDEA.
  User: Shehan
  Date: 8/25/2020
  Time: 11:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello 
<%
    HttpSession httpSession = request.getSession();
   String a = (String) httpSession.getAttribute("username");

    out.println(a);%>

</body>
</html>
