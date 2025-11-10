package BlobClobApp;

import ineuron.jdbc.utilty.jdbcutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlopbClobOperation {
    public static void main(String[] args) {
        Connection connection =null;
        PreparedStatement pstmt = null;
        try {
            connection = jdbcutil.getjdbcConnection();
            String sqlInsertQuery = "insert into person(name,image) values (?,?)";
            if(connection!=null) {
                pstmt = connection.prepareStatement(sqlInsertQuery);
            }
            if(pstmt!=null) {

                pstmt.setString(1, "nitin");
                File file = new File("download.jpeg");
                FileInputStream fis = new FileInputStream(file);
                pstmt.setBlob(2,fis);
                System.out.println("image from:"+file.getAbsolutePath());
               int noofrows=  pstmt.executeUpdate();
               if(noofrows==1){
                   System.out.println("successfully inserted ");
               }else{
                   System.out.println("No records submitted ");
               }

            }

        }catch(SQLException se){
            se.printStackTrace();

        }catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                jdbcutil.CloseConnection(null,pstmt,connection);
            }catch(Exception e){
                e.printStackTrace();
            }
        }



    }

}
