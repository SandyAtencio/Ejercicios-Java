<%--
  Created by IntelliJ IDEA.
  User: satencioh
  Date: 9/12/2019
  Time: 2:50 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Obejtos predefinidos</h2>
Petion de datos del navegador: <%= request.getHeader("User-Agent") %>
<br>
Peticion idioma utilizado: <%= request.getLocale() %>
</body>
</html>
