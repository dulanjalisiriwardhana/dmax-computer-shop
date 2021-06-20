package dmaxcomputershop;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DmaxComputerShop {

    public static void main(String[] args) {
        DBConnection _dbConn = new DBConnection();
        if (_dbConn.isConnected()) {
            loadDataMetaTable("Select * from meta_data;");
        } else {
            JOptionPane.showMessageDialog(null, "Database not connected");
        }
    }

    private static void loadDataMetaTable(String query) {
        DBConnection _dbConn = new DBConnection();
        Statement st;
        ResultSet rs;

        String user = "";
      

        try {
            st = _dbConn.databaseConn().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                user = rs.getString("username");
      
            }
            if (user.equals("")) {
                new SignUpForm().setVisible(true);
            } else {
                new LoginForm().setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
