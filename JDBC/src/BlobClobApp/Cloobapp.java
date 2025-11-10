package BlobClobApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ineuron.jdbc.utilty.jdbcutil;

public class Cloobapp {
    public static void main(String[] args) throws Exception {
        Connection connection =null;
        PreparedStatement pstmt =null;
        String Sqlinsertquery = "insert into cities(name,history) values(?,?)";


        try{
            connection =jdbcutil.getjdbcConnection();;
            if(connection!=null){
                pstmt = connection.prepareStatement(Sqlinsertquery);
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
