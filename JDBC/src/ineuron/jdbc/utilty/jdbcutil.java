package ineuron.jdbc.utilty;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class jdbcutil {
    private jdbcutil(){

    }
    public static Connection getjdbcConnection() throws SQLException , IOException {
        Connection connection = null;
        //Establish the connection
//        String url = "jdbc:mysql://localhost:3306/jdbc";
//        String user ="root";
//        String password= "6398267712";


        Properties props = new Properties();

        FileInputStream fis = new FileInputStream("E:\\java backend\\JDBC\\src\\in\\ineuron\\properties\\jdbc.properties");
        props.load(fis);
        //Establish the connection
        String url = props.getProperty("url");
        String user= props.getProperty("user");
        String password = props.getProperty("password");


         connection = DriverManager.getConnection(url,user,password);
         if(connection!=null){
             return connection;
         }
       return connection;
    }

    public static  void CloseConnection (ResultSet res, Statement statement,Connection connection) throws Exception{

        if(res!=null){
            res.close();
        }
        if(statement!=null){
            statement.close();
        }
        if(statement!=null){
            statement.close();
        }


    }

}
