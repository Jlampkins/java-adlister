import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class AdServlet extends HttpServlet {
    Ads dao = DaoFactory.getAdsDao();


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("ads", dao.all());
        request.getRequestDispatcher("ads/index.jsp").forward(request, response);

//        System.out.println(dao.all());


    }

}
