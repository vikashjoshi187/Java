import java.sql.*;
public class JdbcExample3 
{
    public static void main(String[] args) {
        try{
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itep5","root", "root");
                  if(con==null)
                        System.out.println("Error while establishing connection");
                  else
                      System.out.println("Connection established successfully");
                  
                  String query = "create table student (rno int primary key auto_increment,name varchar(45)  not null,email varchar(45) not null,per double default 0 check(per>=0 and per<=100))";
                  Statement stmt = con.createStatement();
                  boolean status = stmt.execute(query);
                  System.out.println("Status : "+status);
                  System.out.println("Table created successfully");
        }catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
