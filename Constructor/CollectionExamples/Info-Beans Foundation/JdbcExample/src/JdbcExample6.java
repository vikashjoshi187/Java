import java.sql.*;
public class JdbcExample6 
{
    public static void main(String[] args) {
        try{
            Connection con = MyConnection2.getConnect();
            String query = "update student set name=? where rno=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,"Jackson jack");
            ps.setInt(2,2);
            int i = ps.executeUpdate();
            if(i>0)
                System.out.println("Record updated successfully");
            else
                System.out.println("Error while updating data");
        }catch(SQLException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
