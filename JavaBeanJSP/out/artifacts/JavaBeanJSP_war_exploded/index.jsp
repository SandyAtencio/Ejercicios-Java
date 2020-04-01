<%--
  Created by IntelliJ IDEA.
  User: satencioh
  Date: 7/01/2020
  Time: 9:01 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JavaBean</title>
  </head>
  <body>
    <h1>Hello word</h1>
    <form action="UseBean.jsp" method="post">
      <table>
        <tr>
          <td>Name: </td>
          <td><input type="text" name="nombre"></td>
        </tr>
        <tr>
          <td>Edad: </td>
          <td><input type="text" name="anio"></td>
        </tr>
      </table>
      <input type="submit" value="crear">
    </form>
  </body>
</html>
