package example.register.dao;

import example.register.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    public int registerUser(User user) throws ClassNotFoundException{
        int result=0;

        String SQL="INSERT INTO user (first_name,last_name,email,contact_Number,username,password) VALUES(?,?,?,?,?,?)";

        Class.forName("com.mysql.jdbc.Driver");

        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);

                ) {
            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,user.getFirst_name());
            preparedStatement.setString(3,user.getLast_name());
            preparedStatement.setString(4,user.getEmail());
            preparedStatement.setString(5,user.getContact_Number());
            preparedStatement.setString(6,user.getUsername());
            preparedStatement.setString(7,user.getPassword());

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return  result;


    }
}
