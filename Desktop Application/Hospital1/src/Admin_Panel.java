import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Admin_Panel {
    public static void admin() {
        JFrame Admin_Login_Frame = new JFrame("ADMIN LOG-IN");
        Admin_Login_Frame.setResizable(false);
        Admin_Login_Frame.setLayout(null);
        Admin_Login_Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Admin_Login_Frame.setSize(850, 850);
        Admin_Login_Frame.setLocationRelativeTo(null);

        JButton back_MAin_menu_btn = new JButton("< Back Menu");
        back_MAin_menu_btn.setBounds(20, 10, 150, 50);
        Admin_Login_Frame.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));

        back_MAin_menu_btn.addActionListener(e -> {
            AdminOrPharmacist.main(new String[]{});
            Admin_Login_Frame.dispose();
        });

        JLabel Heading = new JLabel("ADMIN LOG-IN ");
        Admin_Login_Frame.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(280, 120, 1000, 50);

        JLabel admin_Name_Label = new JLabel("Admin name");
        Admin_Login_Frame.add(admin_Name_Label);
        admin_Name_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        admin_Name_Label.setBounds(200, 250, 200, 15);

        JTextField admin_Name_TextField = new JTextField();
        Admin_Login_Frame.add(admin_Name_TextField);
        admin_Name_TextField.setBounds(350, 245, 250, 30);

        JLabel passwordLabel = new JLabel("Password");
        Admin_Login_Frame.add(passwordLabel);
        passwordLabel.setFont(new Font("Sarif", Font.PLAIN, 20));
        passwordLabel.setBounds(200, 355, 200, 15);

        JPasswordField passwordField = new JPasswordField();
        Admin_Login_Frame.add(passwordField);
        passwordField.setBounds(350, 350, 250, 30);

        JButton forget = new JButton("FORGET PASSWORD ?");
        Admin_Login_Frame.add(forget);
        forget.setBounds(420, 500, 175, 40);

        forget.addActionListener(e -> {
            Reset_password.reset_password(1);
            Admin_Login_Frame.dispose();
        });

        JButton Admin_login = new JButton("SUBMIT");
        Admin_Login_Frame.add(Admin_login);
        Admin_login.setBounds(200, 500, 175, 40);

        Admin_login.addActionListener(e ->{
            String user_Name = null;
            String password = null;
            try {
                Connection con = Sconnection.connection();
                Statement stmnt = con.createStatement();
                ResultSet rs = stmnt.executeQuery("SELECT admin_name, password FROM admin where admin_id = 1");
                while (rs.next()) {
                    user_Name = rs.getString(1);
                    password = rs.getString(2);
                }
            } catch (SQLException g) {
                System.out.println("Exception " + g);
            }
            String admin = admin_Name_TextField.getText();
            String pass = new String(passwordField.getPassword());
//            if (admin.equals(user_Name) && pass.equals(password)){
                Admin_Login_Frame.dispose();
                Main_menu.Mainmenu_Main();
//            } else {
//                JOptionPane.showMessageDialog(null, "Wrong Details ! ");
//            }
        });

        Admin_Login_Frame.setVisible(true);
    }
}
