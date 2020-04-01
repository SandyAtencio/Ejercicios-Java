package Web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/ServletsHeaders")
public class Servlets extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String metodoHttp = req.getMethod();
        String uri = req.getRequestURI();

        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class=\"conatiner text-center\">");
        out.print("<h1>Headers HTTP</h1>");
        out.print("Metodo Http: " + metodoHttp + "<br>");
        out.print("Uri solicitada: " + uri + "<br>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
    }
}
