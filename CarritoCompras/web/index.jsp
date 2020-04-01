<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Carrito de compras</title>
  </head>
  <body>
  <h1>Ejemplo carrito de compras</h1>
  <form action="CarritoServlet" method="post" name="form">
    Articulo a agregar: <input type="text" name="articulo">
    <br/>
    <input type="submit" value="enviar">
  </form>
  </body>
</html>
