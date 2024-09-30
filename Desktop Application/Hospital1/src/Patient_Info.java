import Email.GemailSend;
import org.jdatepicker.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDate;
import java.util.Random;

public class Patient_Info {
    static String username = "harshika.p3.hp@gmail.com";
    static JFrame patient_Info;
    static JTextField p_Name_TextField, phone_No_Field, Email_Field;
    static ButtonGroup selectGender;
    static JComboBox blood, age_Combo, doctor_combo;
    static JRadioButton male, female, others;
    static JDatePicker datePicker;
    static JTable table;
    static ResultSet rs;

    static void Patientmain() {
        patient_Info = new JFrame("PATIENT'S INFORMATION");
        Container c = patient_Info.getContentPane();

        patient_Info.setResizable(false);
        patient_Info.setLayout(null);
        patient_Info.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        patient_Info.setBounds(500, 200, 850, 850);
        patient_Info.setLocationRelativeTo(null);

        JButton back_MAin_menu_btn = new JButton("<  Patient Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        patient_Info.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setBounds(50, 30, 150, 50);

        back_MAin_menu_btn.addActionListener(e -> {
            Patient_menu.Patient_menu_main();
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

        String[] Blood_Group = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-","Not Known"};
        blood = new JComboBox(Blood_Group);
        blood.setFont(new Font("Sarif", Font.PLAIN, 15));
        c.add(blood);
        patient_Info.add(blood);
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
            Age_arr[i] = String.valueOf(i);
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
        age_Combo.setBounds(300, 500, 140, 20);

        JLabel appoint_label = new JLabel("Appointment Date");
        patient_Info.add(appoint_label);
        appoint_label.setFont(new Font("Sarif", Font.PLAIN, 20));
        appoint_label.setBounds(200, 570, 200, 25);

        JPanel panel = new JPanel();
        JDateComponentFactory factory = new JDateComponentFactory();
        datePicker = factory.createJDatePicker();
        datePicker.getModel().setDate(LocalDate.now().getYear(), LocalDate.now().getMonthValue() - 1, LocalDate.now().getDayOfMonth());
        datePicker.getModel().setSelected(true);
        panel.add((Component) datePicker);
        panel.setBounds(400, 565, 210, 34);

        panel.add((Component) datePicker);
        patient_Info.add(panel);
        patient_Info.setVisible(true);

        JButton patientInfobtn = new JButton("SUBMIT");
        patient_Info.add(patientInfobtn);
        patientInfobtn.setBounds(200, 640, 405, 50);

        patientInfobtn.addActionListener(e -> {

            int Row_Cou = 0;
            Connection connect = Sconnection.connection();
            try {
                PreparedStatement st = connect.prepareStatement("SELECT COUNT(email) FROM patient WHERE email='" + Email_Field.getText() + "';");
                ResultSet Ecount = st.executeQuery();
                while (Ecount.next()) {
                    Row_Cou = Ecount.getInt(1);
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            if (Row_Cou < 1) {//Condition For Duplicate Email
                int year = datePicker.getModel().getYear();
                String month = "", day = "";
                if ((datePicker.getModel().getMonth() + 1) < 10) {
                    month = "0" + (datePicker.getModel().getMonth() + 1);
                } else {
                    month = String.valueOf((datePicker.getModel().getMonth() + 1));
                }
                if ((datePicker.getModel().getDay()) < 10) {
                    day = "0" + datePicker.getModel().getDay();
                } else {
                    day = String.valueOf(datePicker.getModel().getDay());
                }
                String date = day + "/" + month + "/" + year;
                if (Vliad_info_Check.isValidName(p_Name_TextField.getText()) && Vliad_info_Check.isValidContactNumber(phone_No_Field.getText()) && Vliad_info_Check.IsValidEmail(Email_Field.getText()) && Vliad_info_Check.IsValidDate(datePicker)) {
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

                        Random dice = new Random();
                        int otp = dice.nextInt(1000, 10000);

                        Connection con = Sconnection.connection();
                        PreparedStatement st = con.prepareStatement("INSERT INTO Patient(p_name,p_gender,p_age,p_contact,apt_date,bloodgroup,email,p_password,status) values(?,?,?,?,?,?,?,?,?)");
                        st.setString(1, p_Name_TextField.getText());
                        st.setString(2, gender);
                        st.setString(3, String.valueOf(age_Combo.getSelectedItem()));
                        st.setString(4, phone_No_Field.getText());
                        st.setString(5, date);
                        st.setString(6, String.valueOf(blood.getSelectedItem()));
                        st.setString(7, Email_Field.getText());
                        st.setInt(8, otp);
                        st.setString(9,"Active");
                        st.execute();

                        int send_id = 0;
                        try {
                            Statement stmt = con.createStatement();
                            rs = stmt.executeQuery("SELECT p_id FROM patient where email = '" + Email_Field.getText() + "'And p_contact= '" + phone_No_Field.getText() + "';");
                            while (rs.next()) {
                                send_id = rs.getInt(1);
                            }
                        } catch (SQLException ex) {
                            System.out.println("Exception " + ex);
                        }

//                        String to = Email_Field.getText();
//                        String from = "harshika.p3.hp@gmail.com";
//                        String subject = "Welcome to Bit by Bit hospital";
//                        String text = "Hello " + p_Name_TextField.getText() + ".\nYour Registration is Successful\nYour Id is- " + send_id + "\nPlease refer this OTP when you arrive for treatment\nOTP is- " + otp + ".\nAppointment date is- " + date + ".\nThank You For Choosing Bit By Bit Hospital";
//                        boolean b = GemailSend.sendEmail(username, to, from, subject, text);
//                        if (b) {
//                            System.out.println("Email is sent successfully");
//                        } else {
//                            System.out.println("There is problem in sending email");
//                        }

                        patient_Info.dispose();

                        JFrame selection = new JFrame();
                        selection.setResizable(false);
                        selection.setLayout(null);
                        selection.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        selection.setBounds(500, 200, 850, 850);
                        selection.setLocationRelativeTo(null);

                        String[] clm = {"ID", "Name", "Age", "Gender", " blood group", "Contact", "fees", " Specialization", "Room No"};
                        JPanel tablepane = new JPanel();
                        tablepane.setBounds(5, 5, 5, 5);
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

                        JButton back_MAin_menu_btn1 = new JButton("<  Patient Menu");
                        back_MAin_menu_btn1.setFont(new Font("Sarif", Font.PLAIN, 15));
                        selection.add(back_MAin_menu_btn1);
                        back_MAin_menu_btn1.setBounds(50, 30, 150, 50);

                        back_MAin_menu_btn1.addActionListener(ex -> {
                            Patient_menu.Patient_menu_main();
                            selection.dispose();
                        });

                        Container c1 = selection.getContentPane();
                        JLabel Heading1 = new JLabel("DOCTOR SELECTION");
                        selection.add(Heading1);
                        Heading1.setFont(new Font("Sarif", Font.PLAIN, 33));
                        Heading1.setBounds(220, 100, 1000, 50);

                        JLabel doctor_type_Label = new JLabel("Doctor Type");
                        selection.add(doctor_type_Label);
                        doctor_type_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
                        doctor_type_Label.setBounds(195, 480, 200, 25);

                        String[] specialityArr = {"Surgeon", "Neurologist", "General practitioner", "Pediatrician", "Dermatologist"};
                        doctor_combo = new JComboBox(specialityArr);
                        doctor_combo.setFont(new Font("Sarif", Font.PLAIN, 15));
                        doctor_combo.setBounds(340, 475, 200, 30);
                        c1.add(doctor_combo);

                        JButton search_btn = new JButton("SEARCH");
                        selection.add(search_btn);
                        search_btn.setBounds(225, 530, 300, 35);

                        search_btn.addActionListener(f -> {
                            tab_m.setRowCount(0);
                            String selected_specialization = String.valueOf(doctor_combo.getSelectedItem());
                            int id, age, room_n;
                            String name, d_gender, bg, number, specialization;
                            double fees;
                            int i = 0;
                            tab_m.setColumnIdentifiers(clm);
                            try {
                                Statement stmt = con.createStatement();
                                rs = stmt.executeQuery("SELECT * FROM doctor where doc_specialization = '" + selected_specialization + "';");
                                while (rs.next()) {  // Position the cursor
                                    id = rs.getInt(1);
                                    name = rs.getString(2);
                                    age = rs.getInt(3);
                                    d_gender = rs.getString(4);
                                    bg = rs.getString(5);
                                    number = rs.getString(6);
                                    fees = rs.getDouble(7);
                                    specialization = rs.getString(9);
                                    room_n = rs.getInt(10);
                                    tab_m.addRow(new Object[]{id, name, age, d_gender, bg, number, fees, specialization, room_n});
                                    i++;
                                }
                            } catch (SQLException ex) {
                                System.out.println("Exception " + ex);
                            }
                            if (i < 1) {
                                JOptionPane.showMessageDialog(null, "No Doctor Available", " Error", JOptionPane.ERROR_MESSAGE);
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
                                        ResultSet rs = stmt.executeQuery("select p_id from patient where p_name = '" + p_Name_TextField.getText() + "'");
                                        while (rs.next()) {
                                            p_id = rs.getInt(1);
                                        }
                                        if (table.getSelectedRowCount() == 1) {
                                            String s = "UPDATE Patient set doctor_id = '" + d_id + "' where p_id = " + p_id;
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
                    } catch (Exception ex) {
                        System.out.println("Exception : " + ex);
                        ex.printStackTrace();
                    }
                } else if (!Vliad_info_Check.IsValidEmail(Email_Field.getText())) {
                    JOptionPane.showMessageDialog(null, "Invalid Email\n Please Re-enter", " Error", JOptionPane.ERROR_MESSAGE);
                } else if (!Vliad_info_Check.isValidContactNumber(phone_No_Field.getText())) {
                    if (phone_No_Field.getText() == null) {
                        JOptionPane.showMessageDialog(null, "Valid Number Needed", " Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "In-Valid Number", " Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (!Vliad_info_Check.isValidName(p_Name_TextField.getText())) {
                    if (p_Name_TextField.getText() == null) {
                        JOptionPane.showMessageDialog(null, "Name Needed", " Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "In-Valid Name", " Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }///Same Data If
            else {
                JOptionPane.showMessageDialog(null, "Email Already Registered \nPlease Enter Another Email", " Error", JOptionPane.ERROR_MESSAGE);
            }

        });
    }
}
