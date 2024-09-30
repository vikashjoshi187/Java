import javax.swing.*;
import java.awt.*;

public class Main_menu {
    public static void Mainmenu_Main() {
        JFrame mainMenu = new JFrame("MAIN MENU");
        mainMenu.setLayout(null);
        mainMenu.setVisible(true);
        mainMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainMenu.setBounds(800, 200, 850, 850);
        mainMenu.setResizable(false);
        mainMenu.setLocationRelativeTo(null);

        JLabel Heading = new JLabel("MAIN MENU");
        mainMenu.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(300, 150, 1000, 50);

        JButton LOGOUTBTN = new JButton("LOG OUT");
        mainMenu.add(LOGOUTBTN);
        LOGOUTBTN.setBounds(30, 20, 150, 50);

        LOGOUTBTN.addActionListener(e -> {
            AdminOrPharmacist.main(new String[]{});
            mainMenu.dispose();
        });

        JButton addPatient = new JButton("PATIENT PANEL");
        mainMenu.add(addPatient);
        addPatient.setBounds(125, 300, 250, 50);

        addPatient.addActionListener(e -> {
            Patient_menu.Patient_menu_main();
            mainMenu.dispose();
        });

        JButton addDoctor = new JButton("DOCTOR PANEL");
        mainMenu.add(addDoctor);
        addDoctor.setBounds(425, 300, 250, 50);

        addDoctor.addActionListener(e -> {
            Doctor_Menu.Doctor_Menu_main();
            mainMenu.dispose();
        });

//        JButton addMedicie = new JButton("MEDICINE PANEL");
//        mainMenu.add(addMedicie);
//        addMedicie.setBounds(125, 400, 250, 50);
//
//        addMedicie.addActionListener(e -> {
//            Medicine_Menu.Medicine_Menu_main();
//            mainMenu.dispose();
//        });

        JButton ward = new JButton("WARD PANEL");
        mainMenu.add(ward);
        ward.setBounds(425, 400, 250, 50);

        ward.addActionListener(e -> {
            Ward_Menu.Ward_Info();
            mainMenu.dispose();
        });

        JButton lab = new JButton("LAB PANEL");
        mainMenu.add(lab);
        lab.setBounds(125, 400, 250, 50);

        lab.addActionListener(e -> {
            Lab_Menu.lab_Info();
            mainMenu.dispose();
        });

        JButton bill = new JButton("BILL PANEL");
        mainMenu.add(bill);
        bill.setBounds(275, 500, 250, 50);

        bill.addActionListener(e -> {
            Billdilouge.bill_details();
            mainMenu.dispose();
        });

        JButton update_detail = new JButton("Update Details");
        mainMenu.add(update_detail);
        update_detail.setBounds(620, 20, 200, 50);

        update_detail.addActionListener(e -> {
            UpdateAdminDetails.UpdateDetail(1);
            mainMenu.dispose();
        });
    }
}
