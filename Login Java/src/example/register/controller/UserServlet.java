package example.register.controller;

import example.register.dao.UserDao;
import example.register.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserDao userDao= new UserDao();


        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String  email = request.getParameter("email");
        String contact_Number = request.getParameter("contact_Number");
        String username = request.getParameter("username");
        String password = request.getHeader("password");

        User user = new User();
        user.setFirst_name(first_name);
        user.setLast_name(last_name);
        user.setEmail(email);
        user.setContact_Number(contact_Number);
        user.setUsername(username);
        user.setPassword(password);


        try {
            userDao.registerUser(user);
            response.sendRedirect("success.jsp");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("user.jsp");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
