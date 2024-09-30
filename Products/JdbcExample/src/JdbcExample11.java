import java.sql.*;
public class JdbcExample11 
{
    public static void main(String[] args) {
        try{
            Connection con = MyConnection2.getConnect();
            String query = "select * from student";
            PreparedStatement ps = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(rs.getInt(1)==4)
                {
                    rs.updateString(2, "Vikas Joshi");
                    rs.updateRow();
                }
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDouble(4));
            }
        }catch(SQLException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
