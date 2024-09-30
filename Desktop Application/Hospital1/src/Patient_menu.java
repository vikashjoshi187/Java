import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Patient_menu {
    public static void Patient_menu_main() {

        JFrame Patient_menu = new JFrame("PATIENT PANEL");
        Patient_menu.setVisible(true);
        Patient_menu.setBounds(500, 200, 850, 850);
        Patient_menu.setLocationRelativeTo(null);
        Patient_menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton back_MAin_menu_btn = new JButton("<  Main Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Patient_menu.add(back_MAin_menu_btn);
        Patient_menu.setLayout(null);
        back_MAin_menu_btn.setBounds(50, 30, 120, 50);

        back_MAin_menu_btn.addActionListener(e -> {
             Main_menu.Mainmenu_Main();
             Patient_menu.dispose();
        });

        JLabel Heading = new JLabel("PATIENT PANEL ");
        Patient_menu.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 35));
        Heading.setBounds(270, 150, 1000, 50);

        JButton add_Patient_btn = new JButton("ADD PATIENT");
        add_Patient_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Patient_menu.add(add_Patient_btn);
        Patient_menu.setLayout(null);
        add_Patient_btn.setBounds(297, 275, 210, 50);

        add_Patient_btn.addActionListener(e -> {
             Patient_Info.Patientmain();
             Patient_menu.dispose();
        });

        JButton Info_Patient_btn = new JButton("PATIENT'S LIST");
        Info_Patient_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Patient_menu.add(Info_Patient_btn);
        Patient_menu.setLayout(null);
        Info_Patient_btn.setBounds(297, 400, 210, 50);

        Info_Patient_btn.addActionListener(e -> {
             Patient_Show.show_patient();
             Patient_menu.dispose();
        });

        JButton appoint_Patient_btn = new JButton("Schedule Appointment");
        appoint_Patient_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Patient_menu.add(appoint_Patient_btn);
        Patient_menu.setLayout(null);
        appoint_Patient_btn.setBounds(297, 525, 210, 50);

        appoint_Patient_btn.addActionListener(e -> {
                Schedule_Appointment.schedule_appointment();
                Patient_menu.dispose();
        });
    }
}
