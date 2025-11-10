package BlobClobApp;

import ineuron.jdbc.utilty.jdbcutil;
import org.apache.commons.io.IOUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectApp {
    public static void main(String[] args) {
        Connection connection =null;
        PreparedStatement pstmt = null;
        ResultSet res = null;
        String sqlselect = "select * from person where name =?";
        String name ="nitin";
        try{
            connection = jdbcutil.getjdbcConnection();
             if (connection!=null){
                 pstmt = connection.prepareStatement(sqlselect);
             }
             if(pstmt!=null){
                 pstmt.setString(1,name );
                 res = pstmt.executeQuery();
             }
             if(res!=null){
                 if(res.next()){
                     String username = res.getString(1);
                     InputStream is  =res.getBinaryStream(2);
                     int i =is.read();
                     String filename = "d.jpeg";
                     FileOutputStream fos =new FileOutputStream(filename);
                     IOUtils.copy(is,fos);


                     //byte [] buffer = new byte[2048];
//
//                     while(i!=-1){
//                         fos.write(i);
//                         i=is.read();
//                     }
                    // fos.flush();
                     System.out.println("Record available:"+name);
                 }else{
                     System.out.println("Record not found :"+name);
                 }
             }


        }catch(SQLException e){
            e.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
