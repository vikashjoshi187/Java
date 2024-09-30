import java.sql.*;
public class MyConnection2 
{
    public static Connection getConnect(){
        Connection con = null;
        try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(GetDetails.URL, GetDetails.USER, GetDetails.PASS);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Exception  : "+e);
        }
        return con;
    }
}
