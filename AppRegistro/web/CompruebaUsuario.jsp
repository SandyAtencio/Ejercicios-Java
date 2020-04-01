<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String usuario = request.getParameter("usuario");
    String contra = request.getParameter("contra");

    Connection conexion;
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");

    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    try {
        conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","2406");
        PreparedStatement instruccion = conexion.prepareStatement("SELECT * FROM USERS WHERE USUARIO =? AND CONTRA =?");
        instruccion.setString(1, usuario);
        instruccion.setString(2, contra);
        ResultSet rs = instruccion.executeQuery();

        /*if(rs.absolute(1)) out.println("Usuario registrado");
        else out.println("No hay usuario con esos datos");*/
       if(rs.next()){
            out.println("Usuario registrado");
        }else{
           out.println("No hay usuario con esos datos");
       }

    } catch (Exception e) {
        out.println("Ocurrio un error");
    }

%>
</body>
</html>
