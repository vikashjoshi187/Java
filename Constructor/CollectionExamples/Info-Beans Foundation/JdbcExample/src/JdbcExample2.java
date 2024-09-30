import java.sql.*;
public class JdbcExample2 
{
    public static void main(String[] args) {
        try{
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "root");
                  if(con==null)
                        System.out.println("Error while establishing connection");
                  else
                      System.out.println("Connection established successfully");
                  
                  String query = "create database itep5";
                  Statement stmt = con.createStatement();
                  boolean status = stmt.execute(query);
                  System.out.println("Status : "+status);
                  System.out.println("Database created successfully");
        }catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
