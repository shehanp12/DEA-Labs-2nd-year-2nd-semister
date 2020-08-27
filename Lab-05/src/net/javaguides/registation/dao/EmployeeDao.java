package net.javaguides.registation.dao;

import net.javaguides.registation.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {

    public int registerEmployee(Employee employee) throws  ClassNotFoundException{

        String INSERT_USERS_SQL="INSERT INTO employee (id,first_name,last_name,username,password,address,contact) VALUES (?,?,?,?,?,?,?)";

        int result=0;

        Class.forName("com.mysql.jdbc.Driver");

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalogin","root","root");
                PreparedStatement preparedStatement =connection.prepareStatement(INSERT_USERS_SQL)

                ) {
            //Step02:Create a statment using connection object
            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,employee.getFirstName());
            preparedStatement.setString(3,employee.getLastName());
            preparedStatement.setString(4,employee.getUsername());
            preparedStatement.setString(5,employee.getPassword());
            preparedStatement.setString(6,employee.getAddress());
            preparedStatement.setString(7,employee.getContact());

            System.out.println(preparedStatement);

            //Step 03: Excute the query or update the query
            result =preparedStatement.executeUpdate();


        }








        catch (SQLException throwable) {
            throwable.printStackTrace();
        }

        return  result;

    }

}
