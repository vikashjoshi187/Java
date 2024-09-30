import java.sql.*;
public class JdbcExample5 
{
    public static void main(String[] args) {
        try{
            Connection con = MyConnection2.getConnect();
            String query = "select * from student";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDouble(4));
            }
        }catch(SQLException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
