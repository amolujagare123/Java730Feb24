package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection
        String username = "root";
        String password = "root";
        String connectionURL = "jdbc:mysql://localhost:3306/730batchlive";

        Connection con = DriverManager.getConnection(connectionURL,username,password);

        // 3. creating a statement
        Statement st = con.createStatement();

        //4. execute the query ( DML - data manipulation language query)
        // insert / update /delete
        String sql = "insert into student values(12,'Swapnil','IT',78)";

        st.executeUpdate(sql);

    }
}
