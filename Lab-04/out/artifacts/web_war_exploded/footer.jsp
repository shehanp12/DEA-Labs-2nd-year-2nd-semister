<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Shehan
  Date: 8/26/2020
  Time: 11:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<hr>
<%
    Date date = new Date();
    out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
%>

</body>
</html>
