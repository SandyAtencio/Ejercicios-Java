<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Ejemplo de expresiones</h2>
  Convritiendo a mayusculas <%= new String("Sandy").toUpperCase() %>
  <br>
  La suma  de 5 y 7 es: <%= 5+7 %>
  <br>
  10 es mayor que 100: <%= 10>100 %>
  <br>
  <h2>Ejemplo de scriplets</h2>
  <%
    for (int i = 0; i < 10; i++) {
      out.print("<br>Este es el mensaje: " + i);
    }
  %>

</html>
