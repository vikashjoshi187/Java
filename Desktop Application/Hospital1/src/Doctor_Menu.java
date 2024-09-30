import javax.swing.*;
import java.awt.*;

public class Doctor_Menu {
    public static void Doctor_Menu_main() {

        JFrame Doctor_Menu = new JFrame("DOCTOR PANEL");
        Doctor_Menu.setVisible(true);
        Doctor_Menu.setBounds(500, 200, 850, 850);
        Doctor_Menu.setLocationRelativeTo(null);
        Doctor_Menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton back_MAin_menu_btn = new JButton("<  Main Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Doctor_Menu.add(back_MAin_menu_btn);
        Doctor_Menu.setLayout(null);
        back_MAin_menu_btn.setBounds(50, 30, 120, 50);

        back_MAin_menu_btn.addActionListener(e -> {
            Main_menu.Mainmenu_Main();
            Doctor_Menu.dispose();
        });

        JLabel Heading = new JLabel("DOCTOR PANEL 🩺");
        Doctor_Menu.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 35));
        Heading.setBounds(270, 150, 1000, 50);

        JButton add_Doctor_btn = new JButton("ADD DOCTOR");
        add_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Doctor_Menu.add(add_Doctor_btn);
        Doctor_Menu.setLayout(null);
        add_Doctor_btn.setBounds(297, 275, 210, 50);

        add_Doctor_btn.addActionListener(e -> {
            Doctor_Info.Doctor_main();
            Doctor_Menu.dispose();
        });

        JButton Info_Patient_btn = new JButton("DOCTOR'S LIST");
        Info_Patient_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Doctor_Menu.add(Info_Patient_btn);
        Doctor_Menu.setLayout(null);
        Info_Patient_btn.setBounds(297, 400, 210, 50);

        JButton PatUnderDoc = new JButton("PATIENT UNDER DOCTOR");
        PatUnderDoc.setFont(new Font("Sarif", Font.PLAIN, 13));
        Doctor_Menu.add(PatUnderDoc);
        Doctor_Menu.setLayout(null);
        PatUnderDoc.setBounds(297, 525, 210, 50);

        PatUnderDoc.addActionListener(e -> {
            PatientUnderDoctor.patUnderDoctor();
            Doctor_Menu.dispose();
        });

        Info_Patient_btn.addActionListener(e -> {
            Doctor_Show.Show_Doctors();
            Doctor_Menu.dispose();
        });
    }
}
