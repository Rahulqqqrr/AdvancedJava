package in.neuron.DynamicInput;

import ineuron.jdbc.utilty.jdbcutil;
import ineuron.jdbc.utilty.jdbcutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertApp {
    public static void main(String[] args) throws Exception, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id");
        int sid =sc.nextInt();
//        System.out.println("enter the name");
//        String sname = sc.next();
//        System.out.println("enter the age");
//        int sage = sc.nextInt();
//        System.out.println("enter the adrr");
//        String sadrr = sc.next();

//        sname = " ' "+sname+" ' ";
//        sadrr = " ' "+sadrr+" ' ";

        Connection connection =null;
        PreparedStatement pstmt = null;
        ResultSet res = null;
        //String sqlInsertQuery ="insert into student (sid,sname,sage,sadrr)values(?,?,?,?)";
        String SelectQueery  = "select * from student where sid =?";



        try{
         connection=   jdbcutil.getjdbcConnection();
         if(connection!=null){
             System.out.println(connection);
            // pstmt =connection.prepareStatement(sqlInsertQuery);
             pstmt = connection.prepareStatement(SelectQueery);


         }
         if(pstmt!=null){
//             pstmt.setInt(1,sid);
//             pstmt.setString(2,sname);
//             pstmt.setInt(3,sage);
//             pstmt.setNString(4,sadrr);
             pstmt.setInt(1,sid);
             res = pstmt.executeQuery();

            // int rowaffected = pstmt.executeUpdate();
            // System.out.println(rowaffected);

         }
         if(res!=null){
             System.out.println("SID\t Sname\tsage\tsadrr");
             if(res.next()){
                 System.out.println(res.getInt(1)+ res.getString(2)+res.getInt(3)+res.getString(4));
             }else{
                 System.out.println("record not avialable :"+sid);
             }
         }
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            jdbcutil.CloseConnection(null,pstmt,connection);
            if(sc!=null){
                sc.close();
            }
        }






    }
}
