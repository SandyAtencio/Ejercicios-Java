package Servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/Servlet")
public class Servlets extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String usuario = request.getParameter("usuario");
        String contra = request.getParameter("contra");
        String paises[] = request.getParameterValues("pais");
        String tecnologias[] = request.getParameterValues("tecnologias");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultados Servlets</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Parametros procesados por el Servlets</h1><br>");
        out.println("Nombre: " + nombre);
        out.println("<br>");
        out.println("Apellidos: " + apellido);
        out.println("<br>");
        out.println("Usuario: " +  usuario);
        out.println("<br>");
        out.println("Contraseña: " + contra);
        out.println("<br>");
        out.println("Pais: ");
        for (String pais: paises) {
            out.println(pais);
            out.println(" / ");
        }
        out.println("<br>");
        out.println("Tecnologias: ");
        for (String tecnologia: tecnologias) {
            out.println(tecnologia);
            out.println(" / ");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
