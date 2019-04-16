import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

@WebServlet(name = "PageCountServlet", urlPatterns = "/count")
public class PageCountServlet extends HttpServlet {
    private int counter = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter output = response.getWriter();
        output.println("<h1>page counter: " + counter + "</h1>");
        counter++;
        String reset = request.getParameter("reset");
        if (reset.equalsIgnoreCase("reset")) {
            counter = 0;
        }


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {



    }
}