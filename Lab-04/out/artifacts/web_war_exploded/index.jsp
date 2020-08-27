<%@ page import="app.CountryControl" %>
<%@ page import="java.util.List" %>
<%@ page import="app.Country" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>

  <%@include file="header.jsp"%>

  <%!
    CountryControl  countryControl = new CountryControl();
    List<Country> countries=countryControl.getCountries();

  %>
  <style>
    table,
    th,
    td {
      padding: 10px;
      border: 1px solid black;
      border-collapse: collapse;
    }
  </style>
<table>
  <tr>
    <th style="width: 10%"></th>
    <th style="width: 20%">Name</th>
    <th style="width: 40%">Full Name</th>
    <th style="width: 10%">Capital</th>
    <th style="width: 10%">Phone code</th>
    <th style="width: 10%">TLD</th>
    <th style="width: 10%">Region</th>
  </tr>
  <%
    for(Country country:countries){
  %>
  <tr>
    <td >
      <img src="<%= country.getFlag()%>">
    </td>
    <td>
      <%= country.getName()%>
    </td>
    <td>
      <%= country.getFullName()%>
    </td>
    <td>
      <%=country.getCapital()%>
    </td>
    <td>
      <%=country.getPhone_code()%>
    </td>
    <td>
      <%=country.getTLD()%>
    </td>
    <td>
      <%=country.getRegion()%>
    </td>



  </tr>

  <%
    }
  %>
</table>
  <%@include file="footer.jsp"%>

  </body>
</html>