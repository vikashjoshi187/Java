import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin_Panel {
    public static void main(String[] args) throws Exception {

        JFrame Admin_Login_Frame =new JFrame("ADMIN LOG-IN");
        Container c=Admin_Login_Frame.getContentPane();
        Admin_Login_Frame.setResizable(false);
        Admin_Login_Frame.setVisible(true);
        Admin_Login_Frame.setLayout(null);
        Admin_Login_Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Admin_Login_Frame.setSize(850,850);
        Admin_Login_Frame.setLocationRelativeTo(null); // center frame1 on screen



        JLabel Heading=new JLabel("ADMIN LOG-IN ");
        Admin_Login_Frame.add(Heading);
        Heading.setFont(new Font("Sarif",Font.PLAIN,33));
        Heading.setBounds(250,150,1000,50);

       JLabel admin_Name_Label=new JLabel("Admin name");
       Admin_Login_Frame.add(admin_Name_Label);
       admin_Name_Label.setFont(new Font("Sarif",Font.PLAIN,20));
       admin_Name_Label.setBounds(200,250,200,15);


       JTextField admin_Name_TextField=new JTextField();
       Admin_Login_Frame.add(admin_Name_TextField);
       admin_Name_TextField.setBounds(350,245,250,30);

        JLabel passwordLabel=new JLabel("Password");
        Admin_Login_Frame.add(passwordLabel);
        passwordLabel.setFont(new Font("Sarif",Font.PLAIN,20));
        passwordLabel.setBounds(200,355,200,15);


        JPasswordField passwordField=new JPasswordField();
        Admin_Login_Frame.add(passwordField);
        passwordField.setBounds(350,350,250,30);


        JButton Admin_login =new JButton("SUBMIT");
        Admin_Login_Frame.add(Admin_login);
        Admin_login.setBounds(200,500,400,40);
        Admin_Login_Frame.setLocationRelativeTo(c);






        Admin_login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_menu MainmenuObj = new Main_menu();
                MainmenuObj.Mainmenu_Main();
                Admin_Login_Frame.dispose();
            }
        });

    }
}
