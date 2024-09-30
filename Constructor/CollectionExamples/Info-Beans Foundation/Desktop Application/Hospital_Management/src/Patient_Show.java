import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Patient_Show {
    static JTable table;
    static Connection con= null;
    static JFrame patient_show;
    static String p_id,p_name,p_gender,p_age,p_number,blood_group,p_appoint_date;
    public static void show_patient(){
        String[] clm = {"ID","Name","Gender","Age","Contact","Appointment Date","Blood Group"};
        try {
            con = sconnection.connection();
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
        patient_show = new JFrame("Patient's Information");
        JPanel tablepan=new JPanel();
        tablepan.setBounds(5,5,5,5);
        patient_show.setContentPane(tablepan);
        tablepan.setLayout(null);

        JLabel d_detail_tab=new JLabel();
        d_detail_tab.setBounds(50,20,80,20);
        patient_show.add(d_detail_tab);
        patient_show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when we click on cross button over program will also terminate
        DefaultTableModel tab_m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        int i=0;
        String id;
        String name;
        String gender;
        String age;
        String number;
        String bg;
        String appoint_date;
        tab_m.setColumnIdentifiers(clm);
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM patient");
            while (rs.next()) {  // Position the cursor
                id = rs.getString(1);
                name = rs.getString(2);
                gender = rs.getString(3);
                age= rs.getString(4);
                number = rs.getString(5);
                appoint_date = rs.getString(6);
                bg = rs.getString(7);
                tab_m.addRow(new Object[] {id,name,gender,age,number,appoint_date,bg});
                i++;
            }
        }
        catch(SQLException e){
            System.out.println("Exception " +e);
        }
        if(i<1){
            JOptionPane.showMessageDialog(null,"No Record Found"," Error ",JOptionPane.ERROR_MESSAGE);
        } else {
            table = new JTable(tab_m);
            table.setBounds(20,80,200,100);
            JScrollPane jsp=new JScrollPane(table);
            jsp.setBounds(25,150,800,380);
            tablepan.add(jsp);
            jsp.createVerticalScrollBar();
            jsp.getViewport().setViewPosition(new Point(200,300));

            patient_show.add(jsp);
            patient_show.setSize(850,850);
            patient_show.setResizable(false);
            patient_show.setLocationRelativeTo(null);
            patient_show.setVisible(true);

        }

        JButton back_MAin_menu_btn=new JButton("<  Main Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        tablepan.add(back_MAin_menu_btn);
        patient_show.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setBounds(20,10,120,50);

        back_MAin_menu_btn.addActionListener(e -> {
            Main_menu.Mainmenu_Main();
            patient_show.dispose();
        });

        JLabel Heading = new JLabel("PATIENT LIST ");
        patient_show.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(300, 50, 1000, 50);

        JLabel blood_Label = new JLabel("Blood Group");
        patient_show.add(blood_Label);
        blood_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        blood_Label.setBounds(355, 630, 200, 25);

        String[] Blood_Group = {"All Types","A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
        JComboBox blood = new JComboBox(Blood_Group);
        blood.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_show.add(blood);
        blood.setVisible(true);
        blood.setBounds(350, 660, 150, 20);

        JLabel gender_Label = new JLabel("Gender");
        patient_show.add(gender_Label);
        gender_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        gender_Label.setBounds(600, 630, 200, 25);

        String[] GENDER_ARR = {"All Types","Male", "Female", "Others"};
        JComboBox GENDER = new JComboBox(GENDER_ARR);
        GENDER.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_show.add(GENDER);
        GENDER.setVisible(true);
        GENDER.setBounds(595, 660, 150, 20);

        JLabel age_label = new JLabel("Age");
        patient_show.add(age_label);
        age_label.setFont(new Font("Sarif", Font.PLAIN, 20));
        age_label.setBounds(85, 630, 200, 25);

        String[] Age_arr = new String[103];
        for (int j = 1; j < Age_arr.length; j++) {
            Age_arr[j] = "" + (j-1);
        }
        Age_arr[0] = "All Types";
        Age_arr[102] = "Above 100";
        JComboBox age_Combo = new JComboBox(Age_arr);
        age_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_show.add(age_Combo);
        age_Combo.setVisible(true);
        age_Combo.setBounds(80, 660, 150, 20);

        JButton delete_Doctor_btn=new JButton("DELETE SELECTED ROW");
        delete_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_show.add(delete_Doctor_btn);
        patient_show.setLayout(null);
        delete_Doctor_btn.setBounds(80, 550, 660, 50);

        delete_Doctor_btn.addActionListener(e -> {
            if (table.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Please Select Row ", "error",
                        JOptionPane.ERROR_MESSAGE);
            }
            int status = JOptionPane.showConfirmDialog(null, "Do You Want to Delete This Row", "Confirm", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_OPTION) {
                try {
                    DefaultTableModel tbl = (DefaultTableModel) table.getModel();
                    p_id = tbl.getValueAt(table.getSelectedRow(), 0).toString();
                    p_name = tbl.getValueAt(table.getSelectedRow(), 1).toString();
                    p_gender = tbl.getValueAt(table.getSelectedRow(), 2).toString();
                    p_age = tbl.getValueAt(table.getSelectedRow(), 3).toString();
                    p_number = tbl.getValueAt(table.getSelectedRow(), 4).toString();
                    blood_group = tbl.getValueAt(table.getSelectedRow(), 5).toString();
                    p_appoint_date = tbl.getValueAt(table.getSelectedRow(), 6).toString();

                    Connection con = sconnection.connection();
                    DefaultTableModel tbl2 = (DefaultTableModel) table.getModel();
                    if (table.getSelectedRowCount() == 1) {
                        String s = "delete from patient where patient_id = '" + p_id + "'";
                        PreparedStatement ps = con.prepareStatement(s);
                        ps.execute();
                        tbl2.removeRow(table.getSelectedRow());
                    }
                } catch (Exception ex) {
                    System.out.println("Exception : " + ex);
                }
            }
        });

        JButton search_Doctor_btn=new JButton("SEARCH ACCORDINGLY");
        search_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_show.add(search_Doctor_btn);
        patient_show.setLayout(null);
        search_Doctor_btn.setBounds(80, 720, 660, 50);

        search_Doctor_btn.addActionListener(new ActionListener() {
            int i=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    tab_m.setRowCount(0);
                    String id;
                    String name;
                    String p_gender;
                    String age;
                    String number;
                    String bg;
                    String appoint_date;

                    String Age = (String) age_Combo.getSelectedItem();
                    String Blood_Group=(String) blood.getSelectedItem();
                    String Gender = (String) GENDER.getSelectedItem();
                    Statement stmt = con.createStatement();
                    ResultSet rs=null;

                    if (Gender.equals("All Types") && Age.equals("All Types")&& Blood_Group.equals("All Types")){
                        rs = stmt.executeQuery("SELECT * FROM patient ;");
                    } else if (Gender.equals("All Types")&& Blood_Group.equals("All Types")){
                        rs = stmt.executeQuery("SELECT * FROM patient where patient_age = '" +Age+"';");
                    } else if (Gender.equals("All Types")&&  Age.equals("All Types")){
                        rs = stmt.executeQuery("SELECT * FROM patient where bloodgroup ='" +Blood_Group+"';");
                    } else if (Blood_Group.equals("All Types")&&  Age.equals("All Types")){
                        rs = stmt.executeQuery("SELECT * FROM patient where   p_gender = ' " +Gender+ "';");
                    } else if (Blood_Group.equals("All Types")){
                        rs = stmt.executeQuery("SELECT * FROM patient where patient_age = '" +Age+"' And p_gender = '"+Gender+"' ;");
                    } else if (Age.equals("All Types")){
                        rs = stmt.executeQuery("SELECT * FROM patient where  p_gender = '"+Gender+"' AND bloodgroup = '"+Blood_Group+"' ;");
                    } else if (Gender.equals("All Types")){
                        rs = stmt.executeQuery("SELECT * FROM patient where patient_age = '" +Age+"' And bloodgroup = '"+Blood_Group+"' ;");
                    } else {
                        rs = stmt.executeQuery("SELECT * FROM patient where patient_age = '" +Age+"' And p_gender = '"+Gender+"' AND bloodgroup = '"+Blood_Group+"' ;");
                    }
//                    ResultSetMetaData rsmd=rs.getMetaData();
//                    int col_count=rsmd.getColumnCount();
//                    int row=rs.getRow();
//                    String clm_name[]= new String[col_count];

                    while (rs.next()) {  // Position the cursor
                        id = rs.getString(1);
                        name = rs.getString(2);
                        p_gender = rs.getString(3);
                        age= rs.getString(4);
                        number = rs.getString(5);
                        appoint_date = rs.getString(6);
                        bg = rs.getString(7);
                        tab_m.addRow(new Object[] {id,name,p_gender,age,number,appoint_date,bg});
                        i++;
                    }
                }
                catch(SQLException f){
                    System.out.println("Exception " +f);
                }
                if(i<1){
                    JOptionPane.showMessageDialog(null,"No Record Found"," Error ",JOptionPane.ERROR_MESSAGE);
                } else {
                    table = new JTable(tab_m);
                    table.setBounds(20,80,200,100);
                    JScrollPane jsp=new JScrollPane(table);
                    jsp.setBounds(25,150,800,380);
                    tablepan.add(jsp);
                    jsp.createVerticalScrollBar();
                    jsp.getViewport().setViewPosition(new Point(200,300));

                    patient_show.add(jsp);
                    patient_show.setSize(850,850);
                    patient_show.setResizable(false);
                    patient_show.setLocationRelativeTo(null);
                    patient_show.setVisible(true);
                }
            }
        });
    }
}