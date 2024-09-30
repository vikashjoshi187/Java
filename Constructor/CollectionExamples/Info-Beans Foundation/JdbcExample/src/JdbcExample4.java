import java.sql.*;
public class JdbcExample4 
{
    public static void main(String[] args) {
        try{
            Connection con = MyConnection1.getConnect();
            String query = "insert into student(name,email,per) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "simon sim");
            ps.setString(2, "simon@gmail.com");
            ps.setDouble(3, 54.34);
            
            int i = ps.executeUpdate();
            if(i>0)
                    System.out.println("Data inserted successfully");
            else
                    System.out.println("Error while inserting data");
        }catch(SQLException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
