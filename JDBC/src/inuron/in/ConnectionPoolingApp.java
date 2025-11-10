package inuron.in;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionPoolingApp {
    public static void main(String[] args) throws SQLException {
        MysqlConnectionPoolDataSource  dataSource = new MysqlConnectionPoolDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/jdbc");
        dataSource.setUser("root");
        dataSource.setPassword("6398267712");
        Connection connnection = dataSource.getConnection();
        Statement statement =  connnection.createStatement();
        ResultSet res = statement.executeQuery("select sid,sname,sadrr from student ");
        while(res.next()){
            int sid = res.getInt(1);
            String sname = res.getString(2);
            String sadrr =res.getString(3);
            System.out.println(sid+ sname+ sadrr);


        }
        // sending back connection to connection pooling
        connnection.close();

    }
}
