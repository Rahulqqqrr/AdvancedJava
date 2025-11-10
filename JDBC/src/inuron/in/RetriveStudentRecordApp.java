package inuron.in;
import ineuron.jdbc.utilty.jdbcutil;

import java.sql.*;

public class RetriveStudentRecordApp {
    public static void main(String[] args) {
        Connection connection = null;
        CallableStatement cstmt = null;
        ResultSet res = null;
        Integer id =18;
        try {
            connection = jdbcutil.getjdbcConnection();
            //String storedprocedure ="{call getStudents(?)}";
            String storedProcedure = "{call getStudentsbyId(?,?,?)}";
            if(connection!=null){
                cstmt =connection.prepareCall(storedProcedure);
            }
            if(cstmt!=null){

                cstmt.setInt(1,id);
                //register the output parameter foe specific  data conversion
                //use jdbcTypes to map all java datatypes to db specfic datatypes

                cstmt.registerOutParameter(2,Types.VARCHAR);
                cstmt.registerOutParameter(3,Types.VARCHAR);

                cstmt.execute();
                //res=cstmt.getResultSet();
                System.out.println("Name of the student is:"+cstmt.getString(2));
                System.out.println("Address of the Student is :"+cstmt.getString(3));
            }
//            if(res!=null){
//                if(res.next()){
//                    int sid = res.getInt(1);
//                    String sname =res.getString(2);
//                    String sadrr= res.getString(3);
//                    System.out.println("SID\tSNAME\tSADRR");
//                    System.out.println(sid+ "\t"+sname+"\t"+sadrr);
//                }else{
//                    System.out.println("Record not Found::" +id);
//                }
           // }

        }catch (SQLException e) {
            e.printStackTrace();
        }catch( Exception e){
            e.printStackTrace();
        }finally {
            try{
                jdbcutil.CloseConnection(null,cstmt,connection);
            }catch(Exception  e){
                e.printStackTrace();

            }
        }
    }
}
