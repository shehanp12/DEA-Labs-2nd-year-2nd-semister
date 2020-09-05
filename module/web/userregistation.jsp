<%--
  Created by IntelliJ IDEA.
  User: Shehan
  Date: 9/5/2020
  Time: 5:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/register">
    User Name:<input type="text" name="username"><br><br>
    Last Name:<input type="text" name="lastname"><br><br>
    Password:<input type="text" name="password"><br><br>

    <input type="submit" name="submit">

</form>

</body>
</html>
