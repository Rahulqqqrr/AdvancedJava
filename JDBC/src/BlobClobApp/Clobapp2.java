package BlobClobApp;

import ineuron.jdbc.utilty.jdbcutil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Clobapp2 {
    public static void main(String[] args) throws Exception {
        Connection connection =null;
        PreparedStatement pstmt =null;
        ResultSet res =null;

        String selectquery = "select* from cities where name =?";

        try{
            connection = jdbcutil.getjdbcConnection();;
            if(connection!=null){
                pstmt = connection.prepareStatement(selectquery);
            }
            if(pstmt!=null){
                pstmt.setString(1,"Benglore");
                File f = new File("src/BlobClobApp/history.txt");
                FileReader reader = new FileReader(f);
                pstmt.setCharacterStream(2,reader);
                System.out.println("File is inserting from"+f.getAbsolutePath());
                int noofrows =pstmt.executeUpdate();
                System.out.println("rows succesfully inserted");

            }



        }catch(SQLException e){
            e.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally{
            jdbcutil.CloseConnection(null,pstmt,connection);
        }
    }
}
