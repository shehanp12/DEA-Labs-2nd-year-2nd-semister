import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Result")
public class Result extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookies[] = request.getCookies();

        for (Cookie c : cookies) {
            if (c.getName().equals("a")) {
                PrintWriter out = response.getWriter();
                out.print("Name: " + c.getName() + " & Value: " + c.getValue());

            }

//      String a= (String) session.getAttribute("a");
//
//        try (PrintWriter printWriter = response.getWriter()) {
//            printWriter.println(a);
//
//        }


        }
    }
    }
