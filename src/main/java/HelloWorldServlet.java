import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        System.out.println("Hey dumb ass.  You did it!");
        response.setContentType("text/html");
        PrintWriter output = response.getWriter();
        output.println("<h1>What up " + name + "?</h1><hr>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        PrintWriter output = response.getWriter();
        output.println("this is your email: " + email);
    }

}//end of class
