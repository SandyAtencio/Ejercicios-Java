<%@ page import="Utilerias.Conversiones, java.util.Date" %>
<%@ page contentType="application/vnd.ms excel" %>
<%
    String nomArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "attachment;filename=" + nomArchivo);
%>
<html>
    <head>
        <title>Reporte de excel</title>
    </head>
    <body>
        <h1>Reporte de excel</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis basica de Java</td>
                <td><%= Conversiones.formato(new Date()) %></td>
            </tr>
            <tr>
                <td>2. Fundamentos de Electronica</td>
                <td>Aprenderemos los diferentes circuitos electricos</td>
                <td><%= Conversiones.formato(new Date()) %></td>
            </tr>
        </table>
    </body>
</html>
