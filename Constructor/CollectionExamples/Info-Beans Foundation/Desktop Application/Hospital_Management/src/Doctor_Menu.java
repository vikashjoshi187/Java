import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Doctor_Menu {
    public static void Doctor_Menu_main() {

        JFrame Doctor_Menu =new JFrame("DOCTOR PANEL");
        Doctor_Menu.setVisible(true);
        Doctor_Menu.setBounds(500, 200, 850, 850);
        Doctor_Menu.setLocationRelativeTo(null);
        Doctor_Menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton back_MAin_menu_btn=new JButton("<  Main Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Doctor_Menu.add(back_MAin_menu_btn);
        Doctor_Menu.setLayout(null);
        back_MAin_menu_btn.setBounds(50,30,120,50);


        back_MAin_menu_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                Main_menu.Mainmenu_Main();
                Doctor_Menu.dispose();
            }
        });

        JLabel Heading = new JLabel("DOCTOR PANEL 🩺");
        Doctor_Menu.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(300, 150, 1000, 50);


        JButton add_Doctor_btn=new JButton("ADD DOCTOR");
        add_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Doctor_Menu.add(add_Doctor_btn);
        Doctor_Menu.setLayout(null);
        add_Doctor_btn.setBounds(297,300,210,50);


        add_Doctor_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                Doctor_Info.Doctor_main();
                Doctor_Menu.dispose();
            }
        });


        JButton Info_Patient_btn=new JButton("DOCTOR'S LIST");
        Info_Patient_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Doctor_Menu.add(Info_Patient_btn);
        Doctor_Menu.setLayout(null);
        Info_Patient_btn.setBounds(297,450,210,50);

        JButton PatUnderDoc = new JButton("PATIENT UNDER DOCTOR");
        PatUnderDoc.setFont(new Font("Sarif", Font.PLAIN, 15));
        Doctor_Menu.add(PatUnderDoc);
        Doctor_Menu.setLayout(null);
        PatUnderDoc.setBounds(297,600,210,50);

        PatUnderDoc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                PatientUnderDoctor.patUnderDoctor();
                Doctor_Menu.dispose();
            }
        });
        Info_Patient_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Show_Doctor.Show_Doctors();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                Doctor_Menu.dispose();
            }
        });
    }

}
