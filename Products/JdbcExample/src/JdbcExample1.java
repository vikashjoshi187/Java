import java.sql.*;
public class JdbcExample1 
{
    public static void main(String[] args) {
        try{
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "root");
                  if(con==null)
                        System.out.println("Error while establishing connection");
                  else
                      System.out.println("Connection established successfully");
        }catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
