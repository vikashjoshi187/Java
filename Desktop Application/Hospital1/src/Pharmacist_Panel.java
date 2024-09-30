import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pharmacist_Panel {
    public static void pharmacist() {
        JFrame pharmacist_Login_Frame = new JFrame("PHARMACIST LOG-IN");
        pharmacist_Login_Frame.setResizable(false);
        pharmacist_Login_Frame.setLayout(null);
        pharmacist_Login_Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pharmacist_Login_Frame.setSize(850, 850);
        pharmacist_Login_Frame.setLocationRelativeTo(null);

        JButton back_MAin_menu_btn = new JButton("< Back Menu");
        back_MAin_menu_btn.setBounds(20, 10, 150, 50);
        pharmacist_Login_Frame.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));

        back_MAin_menu_btn.addActionListener(e -> {
            AdminOrPharmacist.main(new String[]{});
            pharmacist_Login_Frame.dispose();
        });

        JLabel Heading = new JLabel("PHARMACIST LOG-IN ");
        pharmacist_Login_Frame.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(250, 120, 1000, 50);

        JLabel pharmacist_Name_Label = new JLabel("Pharmacist name");
        pharmacist_Login_Frame.add(pharmacist_Name_Label);
        pharmacist_Name_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        pharmacist_Name_Label.setBounds(190, 250, 200, 15);

        JTextField pharmacist_Name_TextField = new JTextField();
        pharmacist_Login_Frame.add(pharmacist_Name_TextField);
        pharmacist_Name_TextField.setBounds(360, 245, 250, 30);

        JLabel passwordLabel = new JLabel("Password");
        pharmacist_Login_Frame.add(passwordLabel);
        passwordLabel.setFont(new Font("Sarif", Font.PLAIN, 20));
        passwordLabel.setBounds(190, 355, 200, 15);

        JPasswordField passwordField = new JPasswordField();
        pharmacist_Login_Frame.add(passwordField);
        passwordField.setBounds(360, 350, 250, 30);

        JButton forget = new JButton("FORGET PASSWORD ?");
        pharmacist_Login_Frame.add(forget);
        forget.setBounds(420, 500, 175, 40);

        forget.addActionListener(e -> {
            Reset_password.reset_password(2);
            pharmacist_Login_Frame.dispose();
        });

        JButton pharmacist_login = new JButton("SUBMIT");
        pharmacist_Login_Frame.add(pharmacist_login);
        pharmacist_login.setBounds(200, 500, 175, 40);

        pharmacist_login.addActionListener(e ->{
            String user_Name = null;
            String password = null;
            try {
                Connection con = Sconnection.connection();
                Statement stmnt = con.createStatement();
                ResultSet rs = stmnt.executeQuery("SELECT admin_name, password FROM admin where admin_id = 2");
                while (rs.next()) {
                    user_Name = rs.getString(1);
                    password = rs.getString(2);
                }
            } catch (SQLException g) {
                System.out.println("Exception " + g);
            }
            String pharmacist = pharmacist_Name_TextField.getText();
            String pass = new String(passwordField.getPassword());
            if (pharmacist.equals(user_Name) && pass.equals(password)){
                pharmacist_Login_Frame.dispose();
                Medicine_Menu.Medicine_Menu_main();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Details ! ");
            }
        });

        pharmacist_Login_Frame.setVisible(true);
    }
}
