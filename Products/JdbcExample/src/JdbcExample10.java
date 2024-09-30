import java.sql.*;
public class JdbcExample10 
{
    public static void main(String[] args) {
        try{
            Connection con = MyConnection2.getConnect();
            String query = "select * from student";
            PreparedStatement ps = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery();
           // rs.absolute(2);
           //rs.first();
//           rs.beforeFirst();
//            while(rs.next()){
//                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDouble(4));
//            }
            
            rs.afterLast();
            while(rs.previous()){
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDouble(4));
            }
        }catch(SQLException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
