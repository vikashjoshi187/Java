import org.jdatepicker.JDateComponentFactory;
import org.jdatepicker.JDatePicker;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDate;
public class Patient_Info implements ActionListener {
    static JFrame patient_Info;
    static JTextField p_Name_TextField, phone_No_Field,Email_Field;
    static ButtonGroup selectGender;
    static JComboBox blood, age_Combo,doctor_combo;
    static JRadioButton male, female, others;
    static JDatePicker datePicker;
    static JTable table;
    static ResultSet rs;
    static <JDateComponentFactory> void Patientmain() {
        patient_Info = new JFrame("PATIENT'S INFORMATION");
        Container c = patient_Info.getContentPane();

        patient_Info.setResizable(false);
        patient_Info.setLayout(null);
        patient_Info.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        patient_Info.setBounds(500, 200, 850, 850);
        patient_Info.setLocationRelativeTo(null); // center frame1 on screen

        JButton back_MAin_menu_btn = new JButton("<  Main Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_Info.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setBounds(50, 30, 120, 50);

        back_MAin_menu_btn.addActionListener(e -> {
            Main_menu.Mainmenu_Main();
            patient_Info.dispose();
        });

        JLabel Heading = new JLabel("PATIENT'S INFORMATION");
        patient_Info.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(200, 150, 1000, 50);

        JLabel patient_Name_Label = new JLabel("Patient's Name");
        patient_Info.add(patient_Name_Label);
        patient_Name_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        patient_Name_Label.setBounds(200, 250, 200, 15);

        p_Name_TextField = new JTextField();
        patient_Info.add(p_Name_TextField);
        p_Name_TextField.setBounds(400, 245, 200, 30);

        JLabel genderLabel = new JLabel("Gender");
        patient_Info.add(genderLabel);
        genderLabel.setFont(new Font("Sarif", Font.PLAIN, 20));
        genderLabel.setBounds(200, 325, 200, 20);

        male = new JRadioButton("Male");
        patient_Info.add(male);
        male.setFont(new Font("Sarif", Font.PLAIN, 20));
        male.setBounds(300, 325, 80, 25);
        c.add(male);
        male.setSelected(true);

        female = new JRadioButton("Female");
        patient_Info.add(female);
        female.setFont(new Font("Sarif", Font.PLAIN, 20));
        female.setBounds(390, 325, 105, 25);
        c.add(female);

        others = new JRadioButton("Other");
        patient_Info.add(others);
        others.setFont(new Font("Sarif", Font.PLAIN, 20));
        others.setBounds(500, 325, 150, 25);
        c.add(others);

        selectGender = new ButtonGroup();
        selectGender.add(male);
        selectGender.add(female);
        selectGender.add(others);

        JLabel blood_Label = new JLabel("Blood");
        patient_Info.add(blood_Label);
        blood_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        blood_Label.setBounds(470, 500, 200, 15);

        String[] Blood_Group = { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" };
        blood = new JComboBox(Blood_Group);
        blood.setFont(new Font("Sarif", Font.PLAIN, 15));
        c.add(blood);
        patient_Info.add(blood);
        blood.setVisible(true);
        blood.setBounds(540, 500, 75, 20);

        JLabel Email_Label = new JLabel("Email");
        patient_Info.add(Email_Label);
        Email_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        Email_Label.setBounds(200, 380, 200, 15);

        Email_Field = new JTextField();
        patient_Info.add(Email_Field);
        Email_Field.setBounds(310, 375, 295, 30);

        JLabel phone_No_Label = new JLabel("Phone No.");
        patient_Info.add(phone_No_Label);
        phone_No_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        phone_No_Label.setBounds(200, 435, 200, 15);

        phone_No_Field = new JTextField();
        patient_Info.add(phone_No_Field);
        phone_No_Field.setBounds(310, 428, 140, 30);

        String[] Age_arr = new String[102];
        for (int i = 0; i < Age_arr.length; i++) {
            Age_arr[i] = "" + i;
        }
        Age_arr[101] = "Above 100";

        JLabel age_label = new JLabel("Age");
        patient_Info.add(age_label);
        age_label.setFont(new Font("Sarif", Font.PLAIN, 20));
        age_label.setBounds(200, 495, 200, 25);

        age_Combo = new JComboBox(Age_arr);
        age_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
        c.add(age_Combo);
        patient_Info.add(blood);
        age_Combo.setVisible(true);
        age_Combo.setBounds(310, 500, 140, 20);

        JLabel appoint_label = new JLabel("Appointment");
        patient_Info.add(appoint_label);
        appoint_label.setFont(new Font("Sarif", Font.PLAIN, 20));
        appoint_label.setBounds(200, 580, 200, 25);

        JPanel panel = new JPanel();
        JDateComponentFactory factory = new JDateComponentFactory();
        datePicker = factory.createJDatePicker();
        datePicker.getModel().setDate(LocalDate.now().getYear(), LocalDate.now().getMonthValue() - 1, LocalDate.now().getDayOfMonth());
        datePicker.getModel().setSelected(true);
        panel.add((Component) datePicker);
        panel.setBounds(400, 575, 210, 34);

        panel.add((Component) datePicker);
        patient_Info.add(panel);
        patient_Info.setVisible(true);

        JButton patientInfobtn = new JButton("SUBMIT");
        patient_Info.add(patientInfobtn);
        patientInfobtn.setBounds(200, 650, 405, 50);
        patientInfobtn.addActionListener(new Patient_Info());
    }

    public void actionPerformed(ActionEvent e) {
        int year = datePicker.getModel().getYear();
        int month = datePicker.getModel().getMonth();
        int day = datePicker.getModel().getDay();
        String date = day + "/" + month + "/" + year;

        if (Vliad_info_Check.isValidName(p_Name_TextField.getText()) && Vliad_info_Check.isValidContactNumber(phone_No_Field.getText()) && Vliad_info_Check.IsValidEmail(Email_Field.getText())&& Vliad_info_Check.IsValidDate(datePicker) ) {
            try {
                String gender = null;
                ButtonModel genderselected = selectGender.getSelection();
                if (genderselected == male.getModel()) {
                    gender = "Male";
                } else if (genderselected == female.getModel()) {
                    gender = "Female";
                } else if (genderselected == others.getModel()) {
                    gender = "Other";
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a gender");
                }
                Connection con = sconnection.connection();
                PreparedStatement st = con.prepareStatement("INSERT INTO Patient(patient_name,p_gender,patient_age,p_contact,apt_date,bloodgroup) values(?,?,?,?,?,?)");
                st.setString(1, p_Name_TextField.getText());
                st.setString(2, "" + gender);
                st.setString(3, "" + age_Combo.getSelectedItem());
                st.setString(4, phone_No_Field.getText());
                st.setString(5, date);
                st.setString(6, "" + blood.getSelectedItem());
                st.execute();
                patient_Info.dispose();

                JFrame selection = new JFrame();
                selection.setResizable(false);
                selection.setLayout(null);
                selection.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                selection.setBounds(500, 200, 850, 850);
                selection.setLocationRelativeTo(null);

                String[] clm ={"ID","Name", "Age","Gender"," blood group","Contact","fees"," Specialization","Room No"};
                JPanel tablepane = new JPanel();
                tablepane.setBounds(5,5,5,5);
                selection.setContentPane(tablepane);
                tablepane.setLayout(null);

                selection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                DefaultTableModel tab_m = new DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };

                table = new JTable(tab_m);
                table.setBounds(20, 80, 200, 100);
                JScrollPane jsp = new JScrollPane(table);
                jsp.setBounds(25, 180, 800, 250);
                tablepane.add(jsp);
                jsp.createVerticalScrollBar();
                jsp.getViewport().setViewPosition(new Point(200, 300));
                selection.add(jsp);

                JButton back_MAin_menu_btn = new JButton("<  Main Menu");
                back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
                selection.add(back_MAin_menu_btn);
                back_MAin_menu_btn.setBounds(50, 30, 120, 50);

                back_MAin_menu_btn.addActionListener(ex -> {
                    Main_menu.Mainmenu_Main();
                    selection.dispose();
                });

                Container c = selection.getContentPane();
                JLabel Heading = new JLabel("DOCTOR SELECTION");
                selection.add(Heading);
                Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
                Heading.setBounds(220, 100, 1000, 50);

                JLabel doctor_type_Label = new JLabel("Doctor Type");
                selection.add(doctor_type_Label);
                doctor_type_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
                doctor_type_Label.setBounds(195, 480, 200, 25);

                String[] specialityArr = {"Surgeon", "Neurologist", "General practitioner", "Pediatrician", "Dermatologist"};
                doctor_combo = new JComboBox(specialityArr);
                doctor_combo.setFont(new Font("Sarif", Font.PLAIN, 15));
                doctor_combo.setVisible(true);
                doctor_combo.setBounds(340, 475, 200, 30);
                c.add(doctor_combo);

                JButton search_btn = new JButton("SEARCH");
                selection.add(search_btn);
                search_btn.setBounds(225, 530, 300, 35);

                search_btn.addActionListener(f -> {
                    tab_m.setRowCount(0);
                    String selected_specialization = String.valueOf(doctor_combo.getSelectedItem());
                    int id, age, room_n;
                    String name, d_gender, bg, number, specialization;
                    double fees;
                    int i=0;
                    tab_m.setColumnIdentifiers(clm);
                    try{
                        Statement stmt = con.createStatement();
                        rs = stmt.executeQuery("SELECT * FROM doctor where d_specilazation = '" + selected_specialization + "';");
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
                    } catch(SQLException ex){
                        System.out.println("Exception " +ex);
                    }
                    if(i<1){
                        JOptionPane.showMessageDialog(null,"No Doctor Available"," Error",JOptionPane.ERROR_MESSAGE);
                    }
                });

                JButton select_btn = new JButton("SELECT");
                selection.add(select_btn);
                select_btn.setBounds(225, 580, 300, 35);

                select_btn.addActionListener(f -> {
                    if (table.getSelectedRow() == -1) {
                        JOptionPane.showMessageDialog(null, "Please Select Doctor ", "error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        int status = JOptionPane.showConfirmDialog(null, "Do You Want to select doctor", "Confirm", JOptionPane.YES_NO_OPTION);
                        if (status == JOptionPane.YES_OPTION) {
                            try {
                                DefaultTableModel tbl = (DefaultTableModel) table.getModel();
                                String d_id = tbl.getValueAt(table.getSelectedRow(), 0).toString();
                                int p_id = 0;
                                Statement stmt = con.createStatement();
                                ResultSet rs = stmt.executeQuery("select patient_id from patient where patient_name = '"+p_Name_TextField.getText()+"'");
                                while (rs.next()) {
                                    p_id = rs.getInt(1);
                                }
                                if (table.getSelectedRowCount() == 1) {
                                    String s = "UPDATE Patient set doctor_id = '" + d_id + "' where patient_id = " + p_id;
                                    PreparedStatement ps = con.prepareStatement(s);
                                    ps.execute();
                                    selection.dispose();
                                    Patient_menu.Patient_menu_main();
                                }
                                con.close();
                            } catch (Exception ex) {
                                System.out.println("Exception : " + ex);
                            }
                        }
                    }
                });

                selection.setVisible(true);
                st.close();
            }
            catch (Exception ex) {
                System.out.println("Exception : " + ex);
                ex.printStackTrace();
            }
        } else if (Vliad_info_Check.isValidContactNumber(phone_No_Field.getText()) == false && Vliad_info_Check.isValidName(p_Name_TextField.getText()) == false) {// For Invalid PHone Number
            phone_No_Field.setText("Number Needed");
            p_Name_TextField.setText("In-Valid Name");
        } else if (Vliad_info_Check.isValidContactNumber(phone_No_Field.getText()) == false) {// For Invalid PHone Number
            if (phone_No_Field.getText() == null) {
                phone_No_Field.setText("Valid Number Needed");
            } else {
                phone_No_Field.setText("In-Valid Number");
            }
        } else if (Vliad_info_Check.isValidName(p_Name_TextField.getText()) == false) {
            if (p_Name_TextField.getText() == null) {
                p_Name_TextField.setText("Name Needed");
            } else {
                p_Name_TextField.setText("In-Valid Name");
            }
        }
    }
}