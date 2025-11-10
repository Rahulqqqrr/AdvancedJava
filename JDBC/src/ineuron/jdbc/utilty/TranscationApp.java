package ineuron.jdbc.utilty;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TranscationApp {
    public static void main(String[] args) {


        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = jdbcutil.getjdbcConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}