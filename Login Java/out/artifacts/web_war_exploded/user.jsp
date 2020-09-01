<%--
  Created by IntelliJ IDEA.
  User: Shehan
  Date: 9/1/2020
  Time: 11:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Library Management System  </title>
</head>
<body>
<form action="<%=request.getContextPath()%>/register" method="post">
    <table>
        <tr>
            <td>First Name</td>
            <td><input type="text" name="firstname"></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input type="text" name="lastName"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Contact Number</td>
            <td><input type="text" name="contactNumber"></td>
        </tr>
        <tr>
            <td>User Name</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
         <td>Password</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>

            <td><input type="submit" name="submit"> </td>
        </tr>
    </table>

</form>
</body>
</html>
