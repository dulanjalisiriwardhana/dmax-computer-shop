package dmaxcomputershop;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    boolean x = false;

    public Connection databaseConn() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dmax_computer_shop?autoReconnect=false&useSSL=false", "root", "");
            x = true;
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            x = false;
        }
        return con;
    }

    public boolean isConnected() {
        databaseConn();
        return x;
    }
}
