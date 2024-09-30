package dao;

import dto.CityDto;
import java.sql.*;
import java.util.ArrayList;
import myconn.MyConnection1;

public class CityDao {
     public ArrayList<CityDto> getCityList(int stateId){
        Connection con = MyConnection1.getConnect();
        ArrayList<CityDto> list = new ArrayList<>();
        try
        {
            String query = "select * from city where stateid=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,stateId);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CityDto city = new CityDto();
                city.setCityId(rs.getInt(1));
                city.setStateId(rs.getInt(2));
                city.setCityName(rs.getString(3));
                list.add(city);
            }
        }catch(SQLException e){
            System.out.println("Exception : "+e);
        }
        return list;
    }
   
}
