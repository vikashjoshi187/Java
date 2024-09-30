import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sconnection {
    static Connection con;
    public static Connection connection() throws SQLException {


        try{
            String url="jdbc:mysql://localhost:3306/HMS";
            String username="root";
            String password="rootroot";
             con= DriverManager.getConnection(url,username,password);
            Statement st= con.createStatement();
            String query;
//          query="create database deleteit";
            // query=""
//          query=" create table patient (patient_id int(3) not null,patient_name varchar(50) not null,p_gender varchar(10) not null,patient_age int(2) not null,p_contact int(12) not null,apt_date int(7) not null,bloodgroup varchar(20) not null);  ";
//          query=" create table Medicine (med_id int(3) not null,med_name varchar(50) not null,med_usage varchar(50) not null,med_eperiod varchar(50) not null,med_price int(5) not null,med_mg int(5) not null,med_quantity int (10) not null);  ";
//          query=" create table Ward (total_bed int(3) not null,ward_name varchar(50) not null,nurse_available int(2) not null,bed_price float(5) not null);  ";
//            query=" create table Lab (test_num int(3) not null,test_name varchar(50) not null,test_price float(5) not null);  ";
//            query = " create table Doctor (doctor_id int(3) not null, doctor_name varchar(50) not null, d_age int(3) not null, d_gender varchar(10) not null, d_contact int(12) not null, doc_fess int(7) not null, d_specilazation varchar(50), d_room int(3))";
//            st.execute(query); //it returns  a boolean value in case we get any value return it's not give true on creation of database bcz this operation did not return anything
            System.out.println("Table created successfully");
//            con.close();

        } catch (SQLException sq)
        {
            System.out.println("Exception: "+sq);
        }
        return con;
    }





//    Connection connection() {
//        Connection  con=null;
//        try{
//            String url="jdbc:mysql://localhost:3306/HMS";
//            String username="root";
//            String password="rootroot";
//            con= DriverManager.getConnection(url,username,password);
//            System.out.println("Connected to mysql successfully");
//            Statement st= con.createStatement();
//            String query;
//            query="create database DB";
//            st.execute(query); //it returns  a boolean value in case we get any value return it's not give true on creation of database bcz this operation did not return anything
//        } catch (SQLException sq)
//        {
//            System.out.println("Exception: "+sq);
//        }
//        return  con;
//    }
}