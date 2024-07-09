// HelloWorldServlet.java (a simple servlet)
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, World from a WAR!</h1>");
        out.println("</body></html>");
    }
}
