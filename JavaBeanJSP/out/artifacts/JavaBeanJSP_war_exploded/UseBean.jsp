<%--
  Created by IntelliJ IDEA.
  User: satencioh
  Date: 7/01/2020
  Time: 9:36 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h1>Hola Mundo</h1>
        <br/>
        <%
            String nombre;
            int edad;

            nombre = request.getParameter("nombre");
            edad = Integer.parseInt(request.getParameter("anio"));
        %>
        <jsp:useBean id="myBean" class="Beans.MyBeanJava" scope="session"/>
        <jsp:setProperty name="myBean" property="name" value="<%= nombre %>"/>
        <jsp:setProperty name="myBean" property="age" value="<%= edad %>"/>
        <jsp:getProperty name="myBean" property="name"/>
        ${myBean.age}
    </body>
</html>
