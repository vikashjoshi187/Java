import java.sql.*;
public class JdbcExample8 
{
    public static void main(String[] args) {
        try{
            Connection con = MyConnection2.getConnect();
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("Driver name : "+dbmd.getDriverName());
            System.out.println("Driver Version : "+dbmd.getDriverVersion());
            System.out.println("Database Product name : "+dbmd.getDatabaseProductName());

            String query = "select * from student";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd =  rs.getMetaData();
            System.out.println("Column type name : "+rsmd.getColumnTypeName(2));
            System.out.println("Column name : "+rsmd.getColumnName(2));
            System.out.println("Total no. of columns : "+rsmd.getColumnCount());
            
        }catch(SQLException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
