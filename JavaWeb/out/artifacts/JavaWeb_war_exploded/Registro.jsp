<%--
  Created by IntelliJ IDEA.
  User: satencioh
  Date: 9/12/2019
  Time: 3:01 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Usuarios registrados</h2>
    Usuario confirmado: <br>
    Nombre: <%= request.getParameter("nombre") %> <br>
    Apellido <%= request.getParameter("apellidos") %>
</body>
</html>
