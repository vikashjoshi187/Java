package dao;
import myconn.MyConnection1;
import java.sql.*;
import dto.StateDto;
import java.util.ArrayList;

public class StateDao 
{
    public ArrayList<StateDto> getStateList(){
        Connection con = MyConnection1.getConnect();
        ArrayList<StateDto> list = new ArrayList<>();
        try
        {
            String query = "select * from state";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                StateDto state = new StateDto();
                state.setStateId(rs.getInt(1));
                state.setStateName(rs.getString(2));
                list.add(state);
            }
        }catch(SQLException e){
            System.out.println("Exception : "+e);
        }
        return list;
    }
}
