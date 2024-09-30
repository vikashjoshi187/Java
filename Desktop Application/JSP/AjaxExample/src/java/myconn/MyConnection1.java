package myconn;
import java.sql.*;
public class MyConnection1 
{
    static String URL = "jdbc:mysql://localhost:3306/swingdemo";
    static String USER = "root";
    static String PASS = "root";
    
    public static Connection getConnect(){
        Connection con = null;
        try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(URL, USER, PASS);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Exception  : "+e);
        }
        return con;
    }
}
