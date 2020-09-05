package registation.example.dao;

import registation.example.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    public  int registerUser(User libraryuser) throws ClassNotFoundException{

        String  INSERT_USES= "INSERT INTO user(username,lastname,password) VALUES (?,?,?)";

        int resut=0;

        Class.forName("com.mysql.jdbc.Driver");
        String url= "jdbc:mysql://localhost:3306/library";
        String user ="root";
        String password= "root";
        try(
                Connection connection = DriverManager.getConnection(url,user,password);
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USES)
                ) {
            preparedStatement.setString(1,libraryuser.getUsername());
            preparedStatement.setString(2,libraryuser.getLastname());
            preparedStatement.setString(3,libraryuser.getPassword());
            System.out.println(preparedStatement);


            preparedStatement.executeUpdate();




        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return resut;

    }



}
