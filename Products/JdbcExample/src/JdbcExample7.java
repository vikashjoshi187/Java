import java.sql.*;
public class JdbcExample7 
{
    public static void main(String[] args) {
        try{
            Connection con = MyConnection2.getConnect();
            String query = "delete from student where rno=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,1);
            int i = ps.executeUpdate();
            if(i>0)
                System.out.println("Record deleted successfully");
            else
                System.out.println("Error while deleting data");
        }catch(SQLException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
