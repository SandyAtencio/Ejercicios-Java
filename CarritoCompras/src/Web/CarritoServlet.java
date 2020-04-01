package Web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;character=UTF-8");

        //creamos o recuperamos el objeto http session
        HttpSession session = req.getSession();

        //recuperar la lista de articulos agregados previamente si existen
        List<String> articulos = (List<String>) session.getAttribute("articulos");

        //verificar si la lista de articulos ya existe
        if(articulos == null){
            articulos = new ArrayList<>();
            session.setAttribute("articulos", articulos);
        }

        //se procesa el nuevo articulo
        String articuloNuevo = req.getParameter("articulo");

        //revisamos y agregamos el nuevo articulo
        if(articuloNuevo != null && !articuloNuevo.trim().equals("")){
            articulos.add(articuloNuevo);
        }

        PrintWriter out = resp.getWriter();
        out.print("<h1>Lista de articulos</h1>");
        out.print("<br>");
        //iteramos todos los articulos
        for (String arti: articulos) {
            out.print("<li>" + arti +"</li>");
        }

        //agregar link para regresar al inicio
        out.print("<br>");
        out.print("<a href='/CarritoCompras'>Regresar al inicio</a>");
    }
}
