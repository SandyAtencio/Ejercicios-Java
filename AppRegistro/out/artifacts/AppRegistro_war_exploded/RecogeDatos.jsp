<%@ page import="java.sql.*" %>
<%@ page import="java.lang.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String usuario = request.getParameter("usuario");
    String contra = request.getParameter("contra");
    String pais = request.getParameter("pais");
    String tecnologias = request.getParameter("tecnologias");

    Connection conexion = null;
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    try {
        conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","2406");
        Statement instruccion = conexion.createStatement();
        String query = "INSERT INTO USERS(ID, NOMBRE, APELLIDOS, USUARIO, CONTRA, PAIS, TECNOLOGIA) VALUES (SEQ_USERS.NEXTVAL,'" + nombre + "','" + apellido + "', '" + usuario + "', '" + contra + "', '" + pais +"', '" + tecnologias + "')";
        instruccion.executeUpdate(query);
        out.println("Registrado con exito");

    } catch (SQLException e) {
        e.printStackTrace();
    }

   %>
</body>
</html>
