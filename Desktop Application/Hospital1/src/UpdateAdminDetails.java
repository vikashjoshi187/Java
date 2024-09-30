import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class UpdateAdminDetails {
    public static void UpdateDetail(int admin_id) {

        JFrame UpdateAdminDetails = new JFrame("UPDATE DETAILS");
        UpdateAdminDetails.setBounds(300, 200, 850, 850);
        UpdateAdminDetails.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        UpdateAdminDetails.setLayout(null);
        UpdateAdminDetails.setLocationRelativeTo(null);

        JLabel UpdteDetail = new JLabel("UPDATE DETAILS");
        UpdateAdminDetails.add(UpdteDetail);
        UpdteDetail.setBounds(270, 100, 350, 50);
        UpdteDetail.setFont(new Font("Sarif", Font.PLAIN, 33));

        JButton back_MAin_menu_btn = new JButton("<  Back Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        UpdateAdminDetails.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setBounds(50, 30, 150, 50);

        back_MAin_menu_btn.addActionListener(e -> {
            if(admin_id == 1)
                Main_menu.Mainmenu_Main();
            else
                Medicine_Menu.Medicine_Menu_main();
            UpdateAdminDetails.dispose();
        });

        JLabel UpdateName = new JLabel("Update Name");
        UpdateName.setBounds(270, 300, 350, 50);
        UpdateName.setFont(new Font("Sarif", Font.PLAIN, 20));
        UpdateAdminDetails.add(UpdateName);

        JTextField updtNameTxtField = new JFormattedTextField();
        updtNameTxtField.setBounds(450, 315, 150, 20);
        UpdateAdminDetails.add(updtNameTxtField);

        JLabel oldPass = new JLabel("Old Password");
        oldPass.setBounds(270, 400, 350, 50);
        oldPass.setFont(new Font("Sarif", Font.PLAIN, 20));
        UpdateAdminDetails.add(oldPass);

        JPasswordField oldPassTxtField = new JPasswordField();
        oldPassTxtField.setBounds(450, 415, 150, 20);
        UpdateAdminDetails.add(oldPassTxtField);

        JLabel UpdatePass = new JLabel("New Password");
        UpdatePass.setBounds(270, 500, 350, 50);
        UpdatePass.setFont(new Font("Sarif", Font.PLAIN, 20));
        UpdateAdminDetails.add(UpdatePass);

        JPasswordField updtPassTxtField = new JPasswordField();
        updtPassTxtField.setBounds(450, 515, 150, 20);
        UpdateAdminDetails.add(updtPassTxtField);

        String updatepass = new String(updtPassTxtField.getPassword());
        System.out.println(updtNameTxtField.getText());
        System.out.println(updatepass);

        JButton updateBtn = new JButton("Update Details");
        updateBtn.setBounds(250, 600, 350, 50);
        UpdateAdminDetails.add(updateBtn);

        updateBtn.addActionListener(e -> {
            String updatepass1 = new String(updtPassTxtField.getPassword());
            String Oldpass = new String(oldPassTxtField.getPassword());
            boolean Oldpasscheck = Vliad_info_Check.isvalidOldPass(admin_id, Oldpass, updtNameTxtField.getText());
            if(admin_id == 1 || admin_id == 2) {
                if (Vliad_info_Check.IsvalidPassword(updatepass1) && Vliad_info_Check.isValidName(updtNameTxtField.getText()) && Oldpasscheck) {
                    try {
                        Connection con = Sconnection.connection();
                        String s = "update admin set admin_name ='" + updtNameTxtField.getText() + "', password='" + updatepass1 + "' WHERE admin_id = " + admin_id;
                        PreparedStatement ps = con.prepareStatement(s);
                        ps.execute();
                        System.out.println("Updated Sucessfully");
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    JOptionPane.showMessageDialog(null, "Password And Name Updated Successfully", "Success", JOptionPane.ERROR_MESSAGE);
                    if (admin_id == 1)
                        Main_menu.Mainmenu_Main();
                    else
                        Medicine_Menu.Medicine_Menu_main();
                    UpdateAdminDetails.dispose();
                } else if (!Vliad_info_Check.isValidName(updtNameTxtField.getText())) {
                    JOptionPane.showMessageDialog(null, "Enter Valid User Name ", " Error", JOptionPane.ERROR_MESSAGE);
                } else if (!Oldpasscheck) {
                    JOptionPane.showMessageDialog(null, "Please Enter Correct Old Password", " Error", JOptionPane.ERROR_MESSAGE);
                } else if (!Vliad_info_Check.IsvalidPassword(updatepass1)) {
                    JOptionPane.showMessageDialog(null, "Invalid Password ! \nPassword must contains :-\n1 Uppercase, 1 Lowercase, 1 Special Symbol And 1 Digit");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Id !\nPlease Re-Enter");
            }
        });
        UpdateAdminDetails.setVisible(true);
    }
}
