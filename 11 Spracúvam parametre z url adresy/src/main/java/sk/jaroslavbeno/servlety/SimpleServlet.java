package sk.jaroslavbeno.servlety;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/simpleservlet", "/daco"})
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html> <html><body>");

        out.print("<h1>Som v SimpleServlet</h1>");

        String meno = req.getParameter("meno");
        String priezvisko = req.getParameter("priezvisko");

        out.println("<br>");
        out.printf("meno: %s", meno);
        out.println("<br>");
        out.printf("priezvisko: %s", priezvisko);

        out.println("</body> </html>");


    }
}
