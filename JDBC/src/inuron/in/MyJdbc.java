package inuron.in;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.Scanner;

public class MyJdbc {
    public static void main(String[] args) throws SQLException {
//        Driver driver = new Driver();
//        DriverManager.registerDriver(driver);

//          String url ="jdbc:mysql://localhost:3306/jdbc";
//          String user= "root";
//          String password = "6398267712";

     // Connection connection= DriverManager.getConnection(url,user,password);
      //Statement statement = connection.createStatement();
      //String selectquery ="select sid,sname,sage,sadrr from student";
     // ResultSet res = statement.executeQuery(selectquery);
//      while(res.next()){
//           int sid = res.getInt("sid");
//           String sname  = res.getString("sname");
//           int sage = res.getInt("sage");
//            String sadrr = res.getString("sadrr");
//            System.out.println(sid + "\t" +sname +"\t"+sage +"\t"+sadrr) ;
//      }

//      res.close();
//      statement.close();
//      connection.close();


      // industry standard code way

        Connection connection = null;
        Statement statement = null;
        ResultSet res = null;

        String url ="jdbc:mysql://localhost:3306/jdbc";
        String user= "root";
        String password = "6398267712";
        System.out.println("Enter the input");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id");
        int sid =sc.nextInt();
        System.out.println("enter the name");
        String sname = sc.next();
        System.out.println("enter the age");
        int sage = sc.nextInt();
        System.out.println("enter the adrr");
        String sadrr = sc.next();

        sname = " ' "+sname+" ' ";
        sadrr = " ' "+sadrr+" ' ";

        try{
            connection= DriverManager.getConnection(url,user,password);
            if(connection!=null){
                 statement = connection.createStatement();
                if(statement!=null){

                    //String selectquery ="select sid,sname,sage,sadrr from student";
                    //String insertQuery = "insert into student values(34,'rahul',25,'sar')";

                    String insertQuery = "insert into student(sid,sname,sage,sadrr) values ("+sid+ "," +sname+ ","  +sage+", "+sadrr+")";

                   // String delQuery = " delete from student where sid =7";
                    int noOfrows = statement.executeUpdate(insertQuery);
                    System.out.println("No of rows Affected"+ noOfrows);
//                    res = statement.executeQuery(selectquery);
//                    if(res!=null){
//                        while(res.next()){
//                            int sid = res.getInt("sid");
//                            String sname  = res.getString("sname");
//                            int sage = res.getInt("sage");
//                            String sadrr = res.getString("sadrr");
//                            System.out.println(sid + "\t" +sname +"\t"+sage +"\t"+sadrr) ;
//                        }
//                    }
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
           // res.close();
            if(statement!=null) {
                statement.close();
            }
            if(connection!=null) {
                connection.close();
            }
        }












    }
}
