import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "SerchEngine")
public class SerchEngine extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String a = request.getParameter("search");
        String b = request.getParameter("number");

        Cookie cookie = new Cookie("b", b);
        Cookie cookie1 = new Cookie("a",a);
        cookie.setMaxAge(60*60);
        cookie1.setMaxAge(60*60);
        response.addCookie(cookie);
        response.addCookie(cookie1);

        HttpSession session = request.getSession();
        session.setAttribute("a",a);


        response.sendRedirect("Result");





    }
}
