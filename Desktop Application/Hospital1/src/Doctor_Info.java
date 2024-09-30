import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class Doctor_Info {

    static JFrame Doctor_Info;
    static JTextField doctor_Name_TextField, phone_No_Field, Fee_Field;
    static JComboBox age_Combo, speciality_Combo, blood;
    static JRadioButton Male, Female, others;
    static ButtonGroup selectGender;

    public static void Doctor_main() {

        Doctor_Info = new JFrame("DOCTOR'S INFORMATION");
        Container c = Doctor_Info.getContentPane();
        Doctor_Info.setResizable(false);
        Doctor_Info.setLayout(null);
        Doctor_Info.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Doctor_Info.setBounds(500, 200, 850, 850);
        Doctor_Info.setLocationRelativeTo(null); // center frame1 on screen

        JLabel Heading = new JLabel("DOCTOR'S INFORMATION 🩺");
        Doctor_Info.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(200, 150, 1000, 50);

        JButton back_MAin_menu_btn = new JButton("<  Doctor Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Doctor_Info.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setBounds(50, 30, 150, 50);

        back_MAin_menu_btn.addActionListener(e -> {
            Doctor_Menu.Doctor_Menu_main();
            Doctor_Info.dispose();
        });

        JLabel doctor_Name_Label = new JLabel("Doctor's Name");
        Doctor_Info.add(doctor_Name_Label);
        doctor_Name_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        doctor_Name_Label.setBounds(200, 250, 200, 15);

        doctor_Name_TextField = new JTextField();
        Doctor_Info.add(doctor_Name_TextField);
        doctor_Name_TextField.setBounds(400, 245, 200, 30);

        JLabel genderLabel = new JLabel("Gender");
        Doctor_Info.add(genderLabel);
        genderLabel.setFont(new Font("Sarif", Font.PLAIN, 20));
        genderLabel.setBounds(200, 325, 200, 20);

        Male = new JRadioButton("Male");
        Doctor_Info.add(Male);
        Male.setFont(new Font("Sarif", Font.PLAIN, 20));
        Male.setBounds(300, 325, 77, 25);
        c.add(Male);
        Male.setSelected(true);

        Female = new JRadioButton("Female");
        Doctor_Info.add(Female);
        Female.setFont(new Font("Sarif", Font.PLAIN, 20));
        Female.setBounds(390, 325, 105, 25);
        c.add(Female);

        others = new JRadioButton("Others");
        Doctor_Info.add(others);
        others.setFont(new Font("Sarif", Font.PLAIN, 20));
        others.setBounds(500, 325, 150, 25);
        c.add(others);

        selectGender = new ButtonGroup();
        selectGender.add(Male);
        selectGender.add(Female);
        selectGender.add(others);

        JLabel blood_Label = new JLabel("Blood");
        Doctor_Info.add(blood_Label);
        blood_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        blood_Label.setBounds(470, 395, 200, 15);

        String[] Blood_Group = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
        blood = new JComboBox(Blood_Group);
        blood.setFont(new Font("Sarif", Font.PLAIN, 15));
        c.add(blood);
        Doctor_Info.add(blood);
        blood.setBounds(530, 395, 85, 20);

        JLabel phone_No_Label = new JLabel("Phone No.");
        Doctor_Info.add(phone_No_Label);
        phone_No_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        phone_No_Label.setBounds(200, 395, 200, 15);

        phone_No_Field = new JTextField();
        Doctor_Info.add(phone_No_Field);
        phone_No_Field.setBounds(310, 388, 140, 30);

        String[] Age_arr = new String[56];
        int age = 22;
        for (int i = 0; i < Age_arr.length; i++) {
            Age_arr[i] = "" + age;
            age++;
        }

        JLabel age_label = new JLabel("Age");
        Doctor_Info.add(age_label);
        age_label.setFont(new Font("Sarif", Font.PLAIN, 20));
        age_label.setBounds(200, 445, 200, 25);

        age_Combo = new JComboBox(Age_arr);
        age_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
        c.add(age_Combo);
        Doctor_Info.add(blood);
        age_Combo.setVisible(true);
        age_Combo.setBounds(310, 450, 140, 20);

        JLabel appoint_label = new JLabel("Fees ");
        Doctor_Info.add(appoint_label);
        appoint_label.setFont(new Font("Sarif", Font.PLAIN, 20));
        appoint_label.setBounds(460, 445, 200, 25);

        Fee_Field = new JTextField();
        Doctor_Info.add(Fee_Field);
        Fee_Field.setBounds(510, 445, 100, 30);

        JLabel speciality_label = new JLabel("Specaility");
        Doctor_Info.add(speciality_label);
        speciality_label.setFont(new Font("Sarif", Font.PLAIN, 20));
        speciality_label.setBounds(200, 520, 200, 25);
        String[] specialityArr = {"Surgeon", "Neurologist", "General practitioner", "Pediatrician", "Dermatologist", "Dermatologist"};
        speciality_Combo = new JComboBox(specialityArr);
        speciality_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
        c.add(speciality_Combo);

        Doctor_Info.add(blood);
        speciality_Combo.setVisible(true);
        speciality_Combo.setBounds(310, 525, 200, 20);

        Doctor_Info.setVisible(true);
        JButton doc_Infobtn = new JButton("SUBMIT");
        Doctor_Info.add(doc_Infobtn);
        doc_Infobtn.setBounds(200, 600, 405, 50);
        doc_Infobtn.addActionListener(e -> {
            int Row_Cou = 0;
            Connection connect = Sconnection.connection();
            try {
                PreparedStatement st = connect.prepareStatement("SELECT COUNT(doc_contact) FROM doctor WHERE doc_contact ='" + phone_No_Field.getText() + "';");
                ResultSet Ecount = st.executeQuery();
                while (Ecount.next()) {
                    Row_Cou = Ecount.getInt(1);
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            if (Row_Cou < 1) {
                if (Vliad_info_Check.isValidName(doctor_Name_TextField.getText()) && Vliad_info_Check.isValidContactNumber(phone_No_Field.getText()) && Vliad_info_Check.isValidFee(Fee_Field.getText())) {
                    try {
                        String gender = null;
                        ButtonModel genderselected = selectGender.getSelection();
                        if (genderselected == Male.getModel()) {
                            gender = "Male";
                        } else if (genderselected == Female.getModel()) {
                            gender = "Female";
                        } else if (genderselected == others.getModel()) {
                            gender = "Other";
                        } else {
                            JOptionPane.showMessageDialog(null, "Please select a gender");
                        }
                        Doctor_Info.dispose();
                        Connection con = Sconnection.connection();
                        PreparedStatement st = con.prepareStatement("INSERT INTO doctor(doc_name,doc_age,doc_gender,bloodgroup,doc_contact,doc_fees,doc_specialization,doc_room) values(?,?,?,?,?,?,?,?)");
                        st.setString(1, doctor_Name_TextField.getText());
                        st.setString(2, String.valueOf(age_Combo.getSelectedItem()));
                        st.setString(3, gender);
                        st.setString(4, String.valueOf(blood.getSelectedItem()));
                        st.setString(5, phone_No_Field.getText());
                        st.setString(6, Fee_Field.getText());
                        st.setString(7, String.valueOf(speciality_Combo.getSelectedItem()));

                        Random dice = new Random();
                        st.setString(8, String.valueOf(dice.nextInt(51)));

                        st.execute();
                        st.close();
                        con.close();
                        Doctor_Menu.Doctor_Menu_main();
                        Doctor_Info.dispose();
                    } catch (Exception ex) {
                        System.out.println("Exception : " + ex);
                        ex.printStackTrace();
                    }
                } else if (Fee_Field.getText().equals("") || Fee_Field.getText() == null) {
                    JOptionPane.showMessageDialog(null, "Fee Field Empty \nPlease First Enter Fee", "Fee cannot be empty", JOptionPane.ERROR_MESSAGE);
                } else if (!Vliad_info_Check.isValidName(doctor_Name_TextField.getText())) {
                    JOptionPane.showMessageDialog(null, "Invalid Name \nPlease Enter Correct Name.", "Invalid Name", JOptionPane.ERROR_MESSAGE);
                } else if (!Vliad_info_Check.isValidContactNumber(phone_No_Field.getText())) {
                    JOptionPane.showMessageDialog(null, "Invalid Phone Number \nPlease Enter Correct Phone Number.", "Invalid Phone NO.", JOptionPane.ERROR_MESSAGE);
                } else if (!Vliad_info_Check.isValidFee(Fee_Field.getText())) {
                    JOptionPane.showMessageDialog(null, "Invalid Fee\nPlease RE-enter must be >=1000. ", "Invalid fee", JOptionPane.ERROR_MESSAGE);
                }
            }//DupliCate Number
            else {
                JOptionPane.showMessageDialog(null, "Number Already Registered \nPlease Enter Another Number", " Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}