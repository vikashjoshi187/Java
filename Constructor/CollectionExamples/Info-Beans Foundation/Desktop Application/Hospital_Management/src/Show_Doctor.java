import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Show_Doctor {
    static JTable table;
    static String d_id,d_name,d_age,d_gender,d_blood_group,d_number,d_fees,d_specialization,d_room;
    public static void Show_Doctors() throws SQLException {
        int id, age, room_n;
        String name, gender, bg, number, specialization;
        double fees;
        String[] clm ={"ID","Name", "Age","Gender"," blood group","Contact","fees"," Specialization","Room No"};
        Connection con= sconnection.connection();
        JFrame jf=new JFrame("Doctor's Information");
        JPanel tablepane = new JPanel();
        tablepane.setBounds(5,5,5,5);
        jf.setContentPane(tablepane);
        tablepane.setLayout(null);

        JLabel d_detail_tab=new JLabel();
        d_detail_tab.setBounds(50,20,80,20);
        jf.add(d_detail_tab);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when we click on cross button over program will also terminate
        DefaultTableModel tab_m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        int i=0;
        tab_m.setColumnIdentifiers(clm);
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM doctor");

            while (rs.next()) {  // Position the cursor
                id = rs.getInt(1);
                name = rs.getString(2);
                age= rs.getInt(3);
                gender = rs.getString(4);
                bg = rs.getString(5);
                number = rs.getString(6);
                fees= rs.getDouble(7);
                specialization = rs.getString(8);
                room_n=rs.getInt(9);
                tab_m.addRow(new Object[] {id,name,age,gender,bg,number,fees,specialization,room_n});
                i++;
            }

        }
        catch(SQLException e){
            System.out.println("Exception " +e);
        }
        if(i<1){
            JOptionPane.showMessageDialog(null,"No Record Found"," Error",JOptionPane.ERROR_MESSAGE);
        } else {
            table = new JTable(tab_m);
            table.setBounds(20,80,200,100);
            JScrollPane jsp=new JScrollPane(table);
            jsp.setBounds(25,150,800,350);
            tablepane.add(jsp);
            jsp.createVerticalScrollBar();
            jsp.getViewport().setViewPosition(new Point(200,300));

            jf.add(jsp);
            jf.setSize(850,850);
            jf.setResizable(false);
            jf.setLocationRelativeTo(null);
            jf.setVisible(true);
            JButton back_MAin_menu_btn=new JButton("<  Main Menu");
            back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            back_MAin_menu_btn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

                    Main_menu.Mainmenu_Main();
                    jf.dispose();
                }
            });
            tablepane.add(back_MAin_menu_btn);
            jf.add(back_MAin_menu_btn);
            back_MAin_menu_btn.setBounds(20,10,120,50);

            JLabel Heading = new JLabel("DOCTORS LIST 🩺");
            jf.add(Heading);
            Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
            Heading.setBounds(260, 50, 1000, 50);

            JLabel speciality_label = new JLabel("Specalisation");
            jf.add(speciality_label);
            speciality_label.setFont(new Font("Sarif", Font.PLAIN, 20));
            speciality_label.setBounds(85, 630, 200, 25);
            String[] specialityArr = {"All Types","Surgeon", "Neurologist", "General practitioner", "Pediatrician", "Dermatologist"};

            JComboBox speciality_Combo = new JComboBox(specialityArr);
            speciality_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
            jf.add(speciality_Combo);
            speciality_Combo.setVisible(true);
            speciality_Combo.setBounds(80, 660, 200, 20);

            JLabel blood_Label = new JLabel("Blood Group");
            jf.add(blood_Label);
            blood_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
            blood_Label.setBounds(355, 630, 200, 25);

            String[] Blood_Group = {"All Types","A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
            JComboBox blood = new JComboBox(Blood_Group);
            blood.setFont(new Font("Sarif", Font.PLAIN, 15));
            jf.add(blood);
            blood.setVisible(true);
            blood.setBounds(350, 660, 150, 20);

            JLabel gender_Label = new JLabel("Gender");
            jf.add(gender_Label);
            gender_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
            gender_Label.setBounds(600, 630, 200, 25);

            String[] GENDER_ARR = {"All Types","Male", "Female", "Other"};
            JComboBox GENDER = new JComboBox(GENDER_ARR);
            GENDER.setFont(new Font("Sarif", Font.PLAIN, 15));
            jf.add(GENDER);
            jf.add(GENDER);
            GENDER.setVisible(true);
            GENDER.setBounds(595, 660, 150, 20);

            JButton delete_Doctor_btn=new JButton("DELETE SELECTED ROW");
            delete_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            jf.add(delete_Doctor_btn);
            jf.setLayout(null);
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
                        d_id = tbl.getValueAt(table.getSelectedRow(), 0).toString();
                        d_name = tbl.getValueAt(table.getSelectedRow(), 1).toString();
                        d_age = tbl.getValueAt(table.getSelectedRow(), 2).toString();
                        d_gender = tbl.getValueAt(table.getSelectedRow(), 3).toString();
                        d_blood_group = tbl.getValueAt(table.getSelectedRow(), 4).toString();
                        d_number = tbl.getValueAt(table.getSelectedRow(), 5).toString();
                        d_fees = tbl.getValueAt(table.getSelectedRow(), 6).toString();
                        d_specialization = tbl.getValueAt(table.getSelectedRow(), 7).toString();
                        d_room = tbl.getValueAt(table.getSelectedRow(), 8).toString();

                        DefaultTableModel tbl2 = (DefaultTableModel) table.getModel();
                        if (table.getSelectedRowCount() == 1) {
                            String s = "delete from doctor where doctor_id = '" + d_id + "'";
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
            jf.add(search_Doctor_btn);
            jf.setLayout(null);
            search_Doctor_btn.setBounds(80, 720, 660, 50);

            search_Doctor_btn.addActionListener(new ActionListener() {
                int i=0;
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        tab_m.setRowCount(0);
                        int id, age, room_n;
                        String name, d_gender, bg, number, specialization;
                        double fees;

                        String Doc_specialisation= (String) speciality_Combo.getSelectedItem();
                        String Blood_Group=(String) blood.getSelectedItem();
                        String Gender = (String) GENDER.getSelectedItem();
                        Statement stmt = con.createStatement();
                        ResultSet rs=null;

                        if (Gender.equals("All Types") && Doc_specialisation.equals("All Types")&& Blood_Group.equals("All Types")){
                            rs = stmt.executeQuery("SELECT * FROM doctor ;");
                        } else if (Gender.equals("All Types")&& Blood_Group.equals("All Types")){
                            rs = stmt.executeQuery("SELECT * FROM doctor where d_specilazation = '" +Doc_specialisation+"';");
                        } else if (Gender.equals("All Types")&&  Doc_specialisation.equals("All Types")){
                            rs = stmt.executeQuery("SELECT * FROM doctor where   blood_grup ='" +Blood_Group+"';");
                        } else if (Blood_Group.equals("All Types")&&  Doc_specialisation.equals("All Types")){
                            rs = stmt.executeQuery("SELECT * FROM doctor where   d_gender = '"+Gender+"';");
                        } else if (Blood_Group.equals("All Types")){
                            rs = stmt.executeQuery("SELECT * FROM doctor where d_specilazation = '" +Doc_specialisation+"' And d_gender = '"+Gender+"' ;");
                        } else if (Doc_specialisation.equals("All Types")){
                            rs = stmt.executeQuery("SELECT * FROM doctor where  d_gender = '"+Gender+"' AND blood_grup = '"+Blood_Group+"' ;");
                        } else if (Gender.equals("All Types")){
                            rs = stmt.executeQuery("SELECT * FROM doctor where d_specilazation = '" +Doc_specialisation+"' And blood_grup = '"+Blood_Group+"' ;");
                        } else {
                            rs = stmt.executeQuery("SELECT * FROM doctor where d_specilazation = '" +Doc_specialisation+"' And d_gender = '"+Gender+"' AND blood_grup = '"+Blood_Group+"' ;");
                        }

                        while (rs.next()) {  // Position the cursor
                            id = rs.getInt(1);
                            name = rs.getString(2);
                            age= rs.getInt(3);
                            d_gender = rs.getString(4);
                            bg = rs.getString(5);
                            number = rs.getString(6);
                            fees= rs.getDouble(7);
                            specialization = rs.getString(8);
                            room_n=rs.getInt(9);
                            tab_m.addRow(new Object[] {id,name,age,d_gender,bg,number,fees,specialization,room_n});
                            i++;
                        }
                    }
                    catch(SQLException f){
                        System.out.println("Exception " +f);
                    }
                    if(i<1){
                        JOptionPane.showMessageDialog(null,"No Record Found"," Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        }
        jf.validate();
    }
}