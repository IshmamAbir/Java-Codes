package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try
        {
            String url ="jdbc:mysql://localhost:3306/javatestdb";
            Connection connection = DriverManager.getConnection(url, "root", "1234");

            Statement statement=connection.createStatement();

            String insert="INSERT INTO `javatestdb`.`students` (`ID`, ` name`, `dept`) VALUES ('4', 'ishmam', 'cse');";
            int i = statement.executeUpdate(insert);

            String show="select * FROM students";
            ResultSet result= statement.executeQuery(show);

            while (result.next()){
                int id=result.getInt("ID");
                String name=result.getString(" name");

                System.out.println(id+" "+name);
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
