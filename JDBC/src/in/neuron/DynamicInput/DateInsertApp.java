package in.neuron.DynamicInput;

import com.mysql.cj.protocol.Resultset;
import ineuron.jdbc.utilty.jdbcutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateInsertApp {
    public static void main(String[] args) throws ParseException {
        Connection connection =null;
        PreparedStatement pstmt = null;
        ResultSet res =null;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name =in.next();
        System.out.println("Enter the dob::(dd-mm-yyyy)");
        String sdob = in.next();
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //java.util.Date udate =sdf.parse(sdob);
       // long time = udate.getTime();
//        java.sql.Date sqldate = new java.sql.Date(time);
//        System.out.println("String dob"+sdob);
       // System.out.println("Util date is:"+udate);
        //System.out.println("Sql date is:"+sqldate);
        System.out.println();
       // String sqlinsert = "insert into userdata(name,dob) values(?,?)";
        String swlect= "select*from userdata where name =?";
        try{
            connection = jdbcutil.getjdbcConnection();
            if(connection!=null){
                //pstmt= connection.prepareStatement(sqlinsert);
                pstmt= connection.prepareStatement(swlect);
            }
            if(pstmt!=null){
                pstmt.setString(1,name);
               // pstmt.setDate(2,sqldate);
                //int  rowAffected =pstmt.executeUpdate();
                //System.out.println(rowAffected);
                res = pstmt.executeQuery();
            }
            if(res!=null){
                if(res.next()) {
                    String username = res.getString(1);
                    java.sql.Date userdob = res.getDate(2);
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    String date = sdf.format(userdob);
                    System.out.println("Nmae is :"+username);
                    System.out.println("Dob is:"+date);
                }else{
                    System.out.println("Record not found");
                }

            }
        }catch(SQLException se){
            se.printStackTrace();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                jdbcutil.CloseConnection(res,pstmt,connection);
            }catch(Exception se){
                se.printStackTrace();
            }
            if(in!=null){
                in.close();
            }
        }
    }
}
