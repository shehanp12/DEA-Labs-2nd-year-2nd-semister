package registation.example.controller;

import registation.example.dao.UserDao;
import registation.example.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class Registration extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserDao userDao= new UserDao();

        String username = request.getParameter("username");
        String lastname = request.getParameter("lastname");
        String password = request.getParameter("password");

        User user= new User();
        user.setUsername(username);
        user.setLastname(lastname);
        user.setPassword(password);

        try {
            userDao.registerUser(user);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
