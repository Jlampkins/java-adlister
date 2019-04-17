import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/cats")
public class CatsServlet extends HttpServlet {
    Cats dao = DaoFactory.getCatsDao();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("cats", dao.getAllCats());
        request.getRequestDispatcher("/catLists.jsp").forward(request, response);


    }




}//end of class
