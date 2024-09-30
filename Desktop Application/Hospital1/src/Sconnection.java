import java.sql.*;

public class Sconnection {
    static Connection con;

    public static Connection connection() {
        try {
            String url = "jdbc:mysql://localhost:3306/hospital";
            String username = "root";
            String password = "root";
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException sq) {
            System.out.println("Exception: " + sq);
        }
        return con;
    }
}
