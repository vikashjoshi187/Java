import javax.swing.*;
import java.sql.*;
import java.awt.*;

public class Reset_password {

    static String username1, answer1, username, password, answer, securityQuestion;
    static JButton saveDetailsButton, backButton;
    static JFrame frame;
    static Connection con;
    static JLabel usernameLabel, securityQuestionLabel, answerLabel, newPasswordLabel, L_Hms, securityQuestionLabel2;
    static JTextField usernameTextField, answerTextField;
    static JPasswordField newPassTextField;

    public static void reset_password(int admin_id) {
        try {
            con = Sconnection.connection();
            Statement st = con.createStatement();
            String q = "select * from admin where admin_id = "+admin_id;
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                securityQuestion = rs.getString("security_question");
            }
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }

        frame = new JFrame("Forget password");

        L_Hms = new JLabel("Enter Details");
        L_Hms.setFont(new Font("Sarif", Font.PLAIN, 33));
        L_Hms.setBounds(320, 100, 1000, 50);
        frame.add(L_Hms);

        usernameLabel = new JLabel("Name");
        usernameLabel.setBounds(200, 200, 200, 15);
        usernameLabel.setFont(new Font("Sarif", Font.PLAIN, 20));
        frame.add(usernameLabel);

        usernameTextField = new JTextField();
        usernameTextField.setBounds(400, 195, 300, 30);
        frame.add(usernameTextField);

        securityQuestionLabel = new JLabel("Security Question");
        securityQuestionLabel.setBounds(200, 240, 200, 100);
        securityQuestionLabel.setFont(new Font("Sarif", Font.PLAIN, 20));
        frame.add(securityQuestionLabel);

        securityQuestionLabel2 = new JLabel(securityQuestion);
        securityQuestionLabel2.setBounds(400, 240, 500, 100);
        securityQuestionLabel2.setFont(new Font("Sarif", Font.PLAIN, 20));
        frame.add(securityQuestionLabel2);

        answerLabel = new JLabel("Answer");
        answerLabel.setBounds(200, 300, 100, 140);
        answerLabel.setFont(new Font("Sarif", Font.PLAIN, 20));
        frame.add(answerLabel);

        answerTextField = new JTextField();
        answerTextField.setBounds(400, 355, 300, 30);
        frame.add(answerTextField);

        newPasswordLabel = new JLabel("New Password");
        newPasswordLabel.setBounds(200, 430, 150, 30);
        newPasswordLabel.setFont(new Font("Sarif", Font.PLAIN, 20));
        frame.add(newPasswordLabel);

        newPassTextField = new JPasswordField();
        newPassTextField.setBounds(400, 430, 300, 30);
        frame.add(newPassTextField);

        saveDetailsButton = new JButton("Save");
        saveDetailsButton.setBounds(260, 520, 300, 50);
        frame.add(saveDetailsButton);

        backButton = new JButton("<  Admin Panel");
        backButton.setFont(new Font("Sarif", Font.PLAIN, 15));
        frame.add(backButton);
        backButton.setBounds(50, 30, 150, 50);

        backButton.addActionListener(e -> {
            if(admin_id == 1)
                Admin_Panel.admin();
            else
                Pharmacist_Panel.pharmacist();
            frame.dispose();
        });

        frame.setBounds(500, 200, 850, 850);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        saveDetailsButton.addActionListener(e -> {
            String pass = new String(newPassTextField.getPassword());
            if (isValidDetails(admin_id)) {
                try {
                    if (Vliad_info_Check.IsvalidPassword(pass)) {
                        PreparedStatement ps = con.prepareStatement("UPDATE admin SET password = ? WHERE admin_id = '"+admin_id+"'");
                        ps.setString(1, password);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Password Updated Successfully");
                        if(admin_id == 1){
                            Admin_Panel.admin();
                        } else {
                            Pharmacist_Panel.pharmacist();
                        }
                        frame.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Password ! \nPassword must contains :-\n1 Uppercase, 1 Lowercase, 1 Special Symbol And 1 Digit");
                    }
                } catch (Exception g) {
                    System.out.println("Exception : " + g);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Details Entered \nPlease try Again ");
            }
        });
    }

    private static boolean isValidDetails(int admin_id) {
        answer = answerTextField.getText();
        username = usernameTextField.getText();
        password = new String(newPassTextField.getPassword());
        try {
            con = Sconnection.connection();
            Statement st = con.createStatement();
            String q = "select * from admin where admin_id = "+admin_id;
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                username1 = rs.getString("admin_name");
                answer1 = rs.getString("answer");
            }
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        return username.equals(username1) && answer.equals(answer1);
    }
}
