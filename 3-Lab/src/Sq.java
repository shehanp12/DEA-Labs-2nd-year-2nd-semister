import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Sq")
public class Sq extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        int k =0;
        Cookie cookies[] =request.getCookies();

        for(Cookie c :cookies){
            if(c.getName().equals("k")){
                PrintWriter out = response.getWriter();
                out.print("Name: "+c.getName()+" & Value: "+c.getValue());

            }

        }


//        for(int i=0;i<cookies.length;i++){
//            PrintWriter out = response.getWriter();
//            out.print("Name: "+cookies[i].getName()+" & Value: "+cookies[i].getValue());
//        }
//        k = k*k;
//
//        PrintWriter out = response.getWriter();
//        out.println("Result is"+k);

    }
}
