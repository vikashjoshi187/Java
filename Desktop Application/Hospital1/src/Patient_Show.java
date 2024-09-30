import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class Patient_Show {
    static JTable table;
    static Connection con = null;
    static JFrame patient_show;
    static String p_id,p_name,p_gender,p_age,p_contact,p_bg;
    public static void show_patient() {
        String[] clm = {"ID", "Name", "Gender", "Age", "Contact", "Appointment Date", "Blood Group","email"};
        con = Sconnection.connection();
        patient_show = new JFrame("Patient's Information");
        JPanel tablepan = new JPanel();
        tablepan.setBounds(5, 5, 5, 5);
        patient_show.setContentPane(tablepan);
        tablepan.setLayout(null);

        patient_show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DefaultTableModel tab_m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        int i = 0;
        tab_m.setColumnIdentifiers(clm);
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM patient");
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String gender = rs.getString(3);
                String age = rs.getString(4);
                String number = rs.getString(5);
                String appoint_date = rs.getString(8);
                String bg = rs.getString(6);
                String email=rs.getString(7);
                tab_m.addRow(new Object[]{id, name, gender, age, number, appoint_date, bg,email});
                i++;
            }
        } catch (SQLException e) {
            System.out.println("Exception " + e);
        }
        if (i < 1) {
            JOptionPane.showMessageDialog(null, "No Record Found", " Error ", JOptionPane.ERROR_MESSAGE);
        } else {
            table = new JTable(tab_m);
            table.setBounds(20, 100, 200, 200);
            JScrollPane jsp = new JScrollPane(table);
            jsp.setBounds(20, 100, 800, 200);
            tablepan.add(jsp);
            jsp.createVerticalScrollBar();
            jsp.getViewport().setViewPosition(new Point(200, 300));

            patient_show.add(jsp);
            patient_show.setLayout(null);
            patient_show.setSize(850, 850);
            patient_show.setResizable(false);
            patient_show.setLocationRelativeTo(null);
            patient_show.setVisible(true);
        }

        JButton back_MAin_menu_btn = new JButton("<  Patient Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_show.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setBounds(50, 30, 150, 50);

        back_MAin_menu_btn.addActionListener(e -> {
            Patient_menu.Patient_menu_main();
            patient_show.dispose();
        });

        JLabel Heading = new JLabel("PATIENT LIST ");
        patient_show.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(300, 50, 1000, 50);

        JLabel blood_Label = new JLabel("Blood Group");
        patient_show.add(blood_Label);
        blood_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        blood_Label.setBounds(355, 540, 200, 25);

        String[] Blood_Group = {"All Types", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-","Not Known"};
        JComboBox blood = new JComboBox(Blood_Group);
        blood.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_show.add(blood);
        blood.setBounds(350, 570, 150, 20);

        JLabel gender_Label = new JLabel("Gender");
        patient_show.add(gender_Label);
        gender_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        gender_Label.setBounds(600, 540, 200, 25);

        String[] GENDER_ARR = {"All Types", "Male", "Female", "Others"};
        JComboBox GENDER = new JComboBox(GENDER_ARR);
        GENDER.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_show.add(GENDER);
        GENDER.setBounds(595, 570, 150, 20);

        JLabel age_label = new JLabel("Age");
        patient_show.add(age_label);
        age_label.setFont(new Font("Sarif", Font.PLAIN, 20));
        age_label.setBounds(85, 540, 200, 25);

        String[] Age_arr = new String[103];
        for (int j = 1; j < Age_arr.length; j++) {
            Age_arr[j] = String.valueOf(j - 1);
        }
        Age_arr[0] = "All Types";
        Age_arr[102] = "Above 100";
        JComboBox age_Combo = new JComboBox(Age_arr);
        age_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_show.add(age_Combo);
        age_Combo.setBounds(80, 570, 150, 20);

        JButton delete_Patient_btn = new JButton("Select Row to Update");
        delete_Patient_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_show.add(delete_Patient_btn);
        delete_Patient_btn.setBounds(340, 310, 200, 30);

        delete_Patient_btn.addActionListener(e -> {
            if (table.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Please Select Row ", "error", JOptionPane.ERROR_MESSAGE);
            } else {
                int status = JOptionPane.showConfirmDialog(null, "Do You Want to Update This Row", "Confirm", JOptionPane.YES_NO_OPTION);
                if (status == JOptionPane.YES_OPTION) {
// geting data to update database
                    DefaultTableModel tbl = (DefaultTableModel) table.getModel();
                    p_id = tbl.getValueAt(table.getSelectedRow(), 0).toString();
                    p_name = tbl.getValueAt(table.getSelectedRow(), 1).toString();
                    p_gender = tbl.getValueAt(table.getSelectedRow(), 2).toString();
                    p_age = tbl.getValueAt(table.getSelectedRow(), 3).toString();
                    p_contact = tbl.getValueAt(table.getSelectedRow(), 4).toString();
                    p_bg = tbl.getValueAt(table.getSelectedRow(),6).toString();
//showing data to change
                    JLabel ul_name = new JLabel("Name");
                    patient_show.add(ul_name);
                    ul_name.setBounds(40, 365, 100, 30);
                    ul_name.setFont(new Font("Sarif", Font.PLAIN, 20));

                    JTextField u_name = new JTextField(p_name);
                    u_name.setBounds(150, 365, 100, 30);
                    patient_show.add(u_name);

                    JLabel ul_age = new JLabel("Age");
                    patient_show.add(ul_age);
                    ul_age.setBounds(270, 365, 100, 30);
                    ul_age.setFont(new Font("Sarif", Font.PLAIN, 20));

                    String[] age_arr = new String[102];
                    for (int j = 0; j < age_arr.length; j++) {
                        age_arr[j] = String.valueOf(j);
                    }
                    age_arr[101] = "Above 100";
                    JComboBox Age_Combo = new JComboBox(age_arr);
                    Age_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
                    Age_Combo.setSelectedItem(p_age);
                    patient_show.add(Age_Combo);
                    Age_Combo.setBounds(390, 365, 100, 30);

                    JLabel ul_gen = new JLabel("Gender");
                    patient_show.add(ul_gen);
                    ul_gen.setBounds(40, 405, 100, 30);
                    ul_gen.setFont(new Font("Sarif", Font.PLAIN, 20));

                    String[] u_gender = {"Male", "Female", "Other"};
                    JComboBox g_combo = new JComboBox(u_gender);
                    g_combo.setFont(new Font("Sarif", Font.PLAIN, 15));
                    patient_show.add(g_combo);
                    g_combo.setSelectedItem(p_gender);
                    g_combo.setBounds(150, 405, 100, 30);

                    JLabel ul_contact = new JLabel("Contact");
                    patient_show.add(ul_contact);
                    ul_contact.setBounds(270, 405, 100, 30);
                    ul_contact.setFont(new Font("Sarif", Font.PLAIN, 20));

                    JTextField u_contact = new JTextField();
                    u_contact.setBounds(390, 405, 100, 30);
                    patient_show.add(u_contact);
                    u_contact.setText(p_contact);

                    JLabel ul_blood= new JLabel("BloodGroup");
                    patient_show.add(ul_blood);
                    ul_blood.setBounds(510, 365, 120, 30);
                    ul_blood.setFont(new Font("Sarif", Font.PLAIN, 20));

                    String[] u_blood = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-","Not Known"};
                    JComboBox gb_combo = new JComboBox(u_blood);
                    gb_combo.setFont(new Font("Sarif", Font.PLAIN, 15));
                    patient_show.add(gb_combo);
                    gb_combo.setSelectedItem(p_bg);
                    gb_combo.setBounds(650, 365, 120, 30);

                    JButton update_Patient_btn = new JButton("UPDATE SELECTED ROW");
                    update_Patient_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
                    patient_show.add(update_Patient_btn);
                    update_Patient_btn.setBounds(80, 480, 660, 40);

                    update_Patient_btn.addActionListener(f -> {
                        p_name = u_name.getText();
                        p_age = ""+Age_Combo.getSelectedItem();
                        p_gender = ""+g_combo.getSelectedItem();
                        p_contact = u_contact.getText();
                        p_bg = ""+gb_combo.getSelectedItem();
                        u_name.setText("");
                        System.out.println(u_name.getText());
                        if(Vliad_info_Check.isValidName(p_name) && Vliad_info_Check.isValidContactNumber(p_contact)) {
                            try {
                                Connection con = Sconnection.connection();
                                DefaultTableModel tbl2 = (DefaultTableModel) table.getModel();
                                if (table.getSelectedRowCount() == 1) {
                                    String s = " update patient set p_age=?,p_gender=?,p_name=?,p_contact=?, bloodgroup=? where p_id= '" + p_id + "'";
                                    PreparedStatement ps = con.prepareStatement(s);
                                    ps.setString(1, p_age);
                                    ps.setString(2, p_gender);
                                    ps.setString(3, p_name);
                                    ps.setString(4, p_contact);
                                    ps.setString(5, p_bg);
                                    int a = ps.executeUpdate();
                                    if (a > 0) {
                                        JOptionPane.showMessageDialog(null, "Data updated successfully");
                                        // tbl2.fireTableDataChanged();
                                        tab_m.setValueAt(p_name, table.getSelectedRow(), 1);
                                        tab_m.setValueAt(p_gender, table.getSelectedRow(), 2);
                                        tab_m.setValueAt(p_age, table.getSelectedRow(), 3);
                                        tab_m.setValueAt(p_contact, table.getSelectedRow(), 4);
                                        tab_m.setValueAt(p_bg, table.getSelectedRow(), 6);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Failed to update");
                                    }
                                    //update code ends
                                }
                            } catch (Exception ex) {
                                System.out.println("Exception : " + ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid Details\nEnter correct details");
                        }
                    });
                }
            }
        });

        JButton search_Doctor_btn = new JButton("SEARCH ACCORDINGLY");
        search_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_show.add(search_Doctor_btn);
        search_Doctor_btn.setBounds(80, 620, 660, 40);

        search_Doctor_btn.addActionListener(e -> {
            int i1 = 0;
            try {
                tab_m.setRowCount(0);

                String Age = (String) age_Combo.getSelectedItem();
                String Blood_Group1 = (String) blood.getSelectedItem();
                String Gender = (String) GENDER.getSelectedItem();
                Statement stmt = con.createStatement();
                ResultSet rs = null;

                if (Gender.equals("All Types") && Age.equals("All Types") && Blood_Group1.equals("All Types")) {
                    rs = stmt.executeQuery("SELECT * FROM patient ;");
                } else if (Gender.equals("All Types") && Blood_Group1.equals("All Types")) {
                    rs = stmt.executeQuery("SELECT * FROM patient where p_age = '" + Age + "';");
                } else if (Gender.equals("All Types") && Age.equals("All Types")) {
                    rs = stmt.executeQuery("SELECT * FROM patient where bloodgroup ='" + Blood_Group1 + "';");
                } else if (Blood_Group1.equals("All Types") && Age.equals("All Types")) {
                    rs = stmt.executeQuery("SELECT * FROM patient where p_gender = '" + Gender + "';");
                } else if (Blood_Group1.equals("All Types")) {
                    rs = stmt.executeQuery("SELECT * FROM patient where p_age = '" + Age + "' And p_gender = '" + Gender + "' ;");
                } else if (Age.equals("All Types")) {
                    rs = stmt.executeQuery("SELECT * FROM patient where  p_gender = '" + Gender + "' AND bloodgroup = '" + Blood_Group1 + "' ;");
                } else if (Gender.equals("All Types")) {
                    rs = stmt.executeQuery("SELECT * FROM patient where p_age = '" + Age + "' And bloodgroup = '" + Blood_Group1 + "' ;");
                } else {
                    rs = stmt.executeQuery("SELECT * FROM patient where p_age = '" + Age + "' And p_gender = '" + Gender + "' AND bloodgroup = '" + Blood_Group1 + "' ;");
                }

                while (rs.next()) {
                    String id1 = rs.getString(1);
                    String name1 = rs.getString(2);
                    String p_gender = rs.getString(3);
                    String age1 = rs.getString(4);
                    String number1 = rs.getString(5);
                    String appoint_date1 = rs.getString(6);
                    String bg1 = rs.getString(7);
                    tab_m.addRow(new Object[]{id1, name1, p_gender, age1, number1, appoint_date1, bg1});
                    i1++;
                }
            } catch (SQLException f) {
                System.out.println("Exception " + f);
            }
            if (i1 < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", " Error ", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
