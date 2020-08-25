import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        HttpSession httpSession = request.getSession();

        if(username.equals("Adam") &&  password.equals("abc123")){
            httpSession.setAttribute("username",username);
          response.sendRedirect("success.jsp");

        }
        else{
            response.sendRedirect("login.jsp");
        }

//        int k =3;
//        request.setAttribute("k",k);


        //Request Dispatcher
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Sq");
//        requestDispatcher.forward(request, response);






    }
}
