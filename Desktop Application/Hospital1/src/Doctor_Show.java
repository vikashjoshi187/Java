import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class Doctor_Show {
    static JTable table;
    static Connection con = null;
    static String d_id,d_name,d_gender,d_age,d_contact,d_bg;

    public static void Show_Doctors() {
        con = Sconnection.connection();
        JFrame jf = new JFrame("Doctor's Information");
        JPanel tablepane = new JPanel();
        tablepane.setBounds(5, 5, 5, 5);
        jf.setContentPane(tablepane);
        tablepane.setLayout(null);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultTableModel tab_m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //All cells false
                return false;
            }
        };

        int i = 0;
        String[] clm = {"ID", "Name", "Age", "Gender", " blood group", "Contact", "fees", " Specialization", "Room No"};
        tab_m.setColumnIdentifiers(clm);
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM doctor");
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String gender = rs.getString(4);
                String bg = rs.getString(5);
                String number = rs.getString(6);
                float fees = rs.getFloat(7);
                String specialization = rs.getString(9);
                int room_n = rs.getInt(10);
                tab_m.addRow(new Object[]{id, name, age, gender, bg, number, fees, specialization, room_n});
                i++;
            }
        } catch (SQLException e) {
            System.out.println("Exception " + e);
        }
        if (i < 1) {
            JOptionPane.showMessageDialog(null, "No Record Found", " Error", JOptionPane.ERROR_MESSAGE);
        } else {
            table = new JTable(tab_m);
            table.setBounds(20, 100, 200, 200);
            JScrollPane jsp = new JScrollPane(table);
            jsp.setBounds(20, 100, 800, 200);
            tablepane.add(jsp);
            jsp.createVerticalScrollBar();
            jsp.getViewport().setViewPosition(new Point(200, 300));
            jf.add(jsp);

            jf.setSize(850, 850);
            jf.setResizable(false);
            jf.setLocationRelativeTo(null);
            jf.setVisible(true);

            JButton back_MAin_menu_btn = new JButton("<  Doctor Menu");
            back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            jf.add(back_MAin_menu_btn);
            back_MAin_menu_btn.setBounds(50, 30, 150, 50);

            back_MAin_menu_btn.addActionListener(e -> {
                Doctor_Menu.Doctor_Menu_main();
                jf.dispose();
            });

            JLabel Heading = new JLabel("DOCTORS LIST 🩺");
            jf.add(Heading);
            Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
            Heading.setBounds(260, 50, 1000, 50);

            JLabel speciality_label = new JLabel("Specalisation");
            jf.add(speciality_label);
            speciality_label.setFont(new Font("Sarif", Font.PLAIN, 20));
            speciality_label.setBounds(85, 540, 200, 25);
            String[] specialityArr = {"All Types", "Surgeon", "Neurologist", "General practitioner", "Pediatrician", "Dermatologist"};

            JComboBox speciality_Combo = new JComboBox(specialityArr);
            speciality_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
            jf.add(speciality_Combo);
            speciality_Combo.setBounds(80, 570, 200, 20);

            JLabel blood_Label = new JLabel("Blood Group");
            jf.add(blood_Label);
            blood_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
            blood_Label.setBounds(355, 540, 200, 25);

            String[] blood_Group = {"All Types", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
            JComboBox blood = new JComboBox(blood_Group);
            blood.setFont(new Font("Sarif", Font.PLAIN, 15));
            jf.add(blood);
            blood.setBounds(350, 570, 150, 20);

            JLabel gender_Label = new JLabel("Gender");
            jf.add(gender_Label);
            gender_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
            gender_Label.setBounds(600, 540, 200, 25);

            String[] GENDER_ARR = {"All Types", "Male", "Female", "Other"};
            JComboBox GENDER = new JComboBox(GENDER_ARR);
            GENDER.setFont(new Font("Sarif", Font.PLAIN, 15));
            jf.add(GENDER);
            GENDER.setBounds(595, 570, 150, 20);

            JButton delete_Doctor_btn = new JButton("Select Row to Update");
            delete_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            jf.add(delete_Doctor_btn);
            delete_Doctor_btn.setBounds(340, 310, 200, 30);

            delete_Doctor_btn.addActionListener(e -> {
                if (table.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(null, "Please Select Row ", "error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    int status = JOptionPane.showConfirmDialog(null, "Do You Want to Update This Row", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (status == JOptionPane.YES_OPTION) {
                        DefaultTableModel tbl = (DefaultTableModel) table.getModel();
                        d_id = tbl.getValueAt(table.getSelectedRow(), 0).toString();
                        d_name = tbl.getValueAt(table.getSelectedRow(), 1).toString();
                        d_age = tbl.getValueAt(table.getSelectedRow(), 2).toString();
                        d_gender = tbl.getValueAt(table.getSelectedRow(), 3).toString();
                        d_bg = tbl.getValueAt(table.getSelectedRow(),4).toString();
                        d_contact = tbl.getValueAt(table.getSelectedRow(), 5).toString();

                        JLabel ul_name = new JLabel("Name");
                        jf.add(ul_name);
                        ul_name.setBounds(40, 365, 100, 30);
                        ul_name.setFont(new Font("Sarif", Font.PLAIN, 20));

                        JTextField u_name = new JTextField(d_name);
                        u_name.setBounds(150, 365, 100, 30);
                        jf.add(u_name);

                        JLabel ul_age = new JLabel("Age");
                        jf.add(ul_age);
                        ul_age.setBounds(270, 365, 100, 30);
                        ul_age.setFont(new Font("Sarif", Font.PLAIN, 20));

                        String[] age_arr = new String[102];
                        for (int j = 0; j < age_arr.length; j++) {
                            age_arr[j] = String.valueOf(j);
                        }
                        age_arr[101] = "Above 100";
                        JComboBox Age_Combo = new JComboBox(age_arr);
                        Age_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
                        Age_Combo.setSelectedItem(d_age);
                        jf.add(Age_Combo);
                        Age_Combo.setBounds(390, 365, 100, 30);

                        JLabel ul_gen = new JLabel("Gender");
                        jf.add(ul_gen);
                        ul_gen.setBounds(40, 405, 100, 30);
                        ul_gen.setFont(new Font("Sarif", Font.PLAIN, 20));

                        String[] u_gender = {"Male", "Female", "Other"};
                        JComboBox g_combo = new JComboBox(u_gender);
                        g_combo.setFont(new Font("Sarif", Font.PLAIN, 15));
                        jf.add(g_combo);
                        g_combo.setSelectedItem(d_gender);
                        g_combo.setBounds(150, 405, 100, 30);

                        JLabel ul_contact = new JLabel("Contact");
                        jf.add(ul_contact);
                        ul_contact.setBounds(270, 405, 100, 30);
                        ul_contact.setFont(new Font("Sarif", Font.PLAIN, 20));

                        JTextField u_contact = new JTextField();
                        u_contact.setBounds(390, 405, 100, 30);
                        jf.add(u_contact);
                        u_contact.setText(d_contact);

                        JLabel ul_blood= new JLabel("BloodGroup");
                        jf.add(ul_blood);
                        ul_blood.setBounds(510, 365, 120, 30);
                        ul_blood.setFont(new Font("Sarif", Font.PLAIN, 20));

                        String[] u_blood = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-","Not Known"};
                        JComboBox gb_combo = new JComboBox(u_blood);
                        gb_combo.setFont(new Font("Sarif", Font.PLAIN, 15));
                        jf.add(gb_combo);
                        gb_combo.setSelectedItem(d_bg);
                        gb_combo.setBounds(650, 365, 120, 30);

                        JButton update_Patient_btn = new JButton("UPDATE SELECTED ROW");
                        update_Patient_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
                        jf.add(update_Patient_btn);
                        update_Patient_btn.setBounds(80, 480, 660, 40);

                        update_Patient_btn.addActionListener(f -> {
                            d_name = u_name.getText();
                            d_age = ""+Age_Combo.getSelectedItem();
                            d_gender = ""+g_combo.getSelectedItem();
                            d_contact = u_contact.getText();
                            d_bg = ""+gb_combo.getSelectedItem();
                            if(Vliad_info_Check.isValidName(d_name) && Vliad_info_Check.isValidContactNumber(d_contact)) {
                                try {
                                    con = Sconnection.connection();
                                    DefaultTableModel tbl2 = (DefaultTableModel) table.getModel();
                                    if (table.getSelectedRowCount() == 1) {
                                        String s = " update doctor set doc_age=?,doc_gender=?,doc_name=?,doc_contact=?, bloodgroup=? where doc_id= '" + d_id + "'";
                                        PreparedStatement ps = con.prepareStatement(s);
                                        ps.setString(1, d_age);
                                        ps.setString(2, d_gender);
                                        ps.setString(3, d_name);
                                        ps.setString(4, d_contact);
                                        ps.setString(5, d_bg);
                                        int a = ps.executeUpdate();
                                        if (a > 0) {
                                            JOptionPane.showMessageDialog(null, "Data updated successfully");
                                            tab_m.setValueAt(d_name, table.getSelectedRow(), 1);
                                            tab_m.setValueAt(d_gender, table.getSelectedRow(), 3);
                                            tab_m.setValueAt(d_age, table.getSelectedRow(), 2);
                                            tab_m.setValueAt(d_contact, table.getSelectedRow(), 5);
                                            tab_m.setValueAt(d_bg, table.getSelectedRow(), 4);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Failed to update");
                                        }
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
            jf.add(search_Doctor_btn);
            search_Doctor_btn.setBounds(80, 620, 660, 50);

            search_Doctor_btn.addActionListener(e -> {
                int j = 0;
                try {
                    tab_m.setRowCount(0);
                    String Doc_specialisation = (String) speciality_Combo.getSelectedItem();
                    String Blood_Group = (String) blood.getSelectedItem();
                    String Gender = (String) GENDER.getSelectedItem();
                    Statement stmt = con.createStatement();
                    ResultSet rs = null;

                    if (Gender.equals("All Types") && Doc_specialisation.equals("All Types") && Blood_Group.equals("All Types")) {
                        rs = stmt.executeQuery("SELECT * FROM doctor ;");
                    } else if (Gender.equals("All Types") && Blood_Group.equals("All Types")) {
                        rs = stmt.executeQuery("SELECT * FROM doctor where doc_specialization = '" + Doc_specialisation + "';");
                    } else if (Gender.equals("All Types") && Doc_specialisation.equals("All Types")) {
                        rs = stmt.executeQuery("SELECT * FROM doctor where bloodgroup ='" + Blood_Group + "';");
                    } else if (Blood_Group.equals("All Types") && Doc_specialisation.equals("All Types")) {
                        rs = stmt.executeQuery("SELECT * FROM doctor where d_gender = '" + Gender + "';");
                    } else if (Blood_Group.equals("All Types")) {
                        rs = stmt.executeQuery("SELECT * FROM doctor where doc_specialization = '" + Doc_specialisation + "' And d_gender = '" + Gender + "' ;");
                    } else if (Doc_specialisation.equals("All Types")) {
                        rs = stmt.executeQuery("SELECT * FROM doctor where  d_gender = '" + Gender + "' AND bloodgroup = '" + Blood_Group + "' ;");
                    } else if (Gender.equals("All Types")) {
                        rs = stmt.executeQuery("SELECT * FROM doctor where doc_specialization = '" + Doc_specialisation + "' And bloodgroup = '" + Blood_Group + "' ;");
                    } else {
                        rs = stmt.executeQuery("SELECT * FROM doctor where doc_specialization = '" + Doc_specialisation + "' And d_gender = '" + Gender + "' AND bloodgroup = '" + Blood_Group + "' ;");
                    }

                    while (rs.next()) {
                        int d_id = rs.getInt(1);
                        String d_name = rs.getString(2);
                        int d_age = rs.getInt(3);
                        String d_gender = rs.getString(4);
                        String d_bg = rs.getString(5);
                        String d_number = rs.getString(6);
                        float d_fees = rs.getFloat(7);
                        String d_specialization = rs.getString(9);
                        int d_room_n = rs.getInt(10);
                        tab_m.addRow(new Object[]{d_id, d_name, d_age, d_gender, d_bg, d_number, d_fees, d_specialization, d_room_n});
                        j++;
                    }
                } catch (SQLException f) {
                    System.out.println("Exception " + f);
                }
                if (j < 1) {
                    JOptionPane.showMessageDialog(null, "No Record Found", " Error", JOptionPane.ERROR_MESSAGE);
                }

            });
        }
        jf.validate();
    }
}
