import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Add")
public class Add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int i =Integer.parseInt(request.getParameter("first"));
        int j = Integer.parseInt(request.getParameter("second"));

        int k = i +j;
        Cookie cookie1= new Cookie("s", j+"");
        Cookie cookie = new Cookie("k", k+"");
        cookie.setMaxAge(60);
        response.addCookie(cookie);
        response.addCookie(cookie1);


        response.sendRedirect("Sq");


    }
}
