import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminOrPharmacist {
    JFrame frame;
    JButton adminButton;
    JButton pharmacistButton;

    public AdminOrPharmacist() {
        frame = new JFrame();
        frame.setTitle("Role Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(850, 850);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        JButton back_MAin_menu_btn = new JButton("< Exit");
        back_MAin_menu_btn.setBounds(20, 10, 150, 50);
        frame.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 20));

        back_MAin_menu_btn.addActionListener(e -> {
            frame.dispose();
        });

        JLabel main_Heading = new JLabel("Bit By Bit Hospital");
        frame.add(main_Heading);
        main_Heading.setFont(new Font("Sarif", Font.PLAIN, 50));
        main_Heading.setBounds(225, 120, 1000, 60);

        JLabel Heading = new JLabel("Login As");
        frame.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 40));
        Heading.setBounds(350, 210, 1000, 50);

        adminButton = new JButton("Admin");
        adminButton.setFont(new Font("Sarif", Font.PLAIN, 25));
        adminButton.setBounds(300, 320, 250, 75);

        adminButton.addActionListener(e -> {
            frame.dispose();
            Admin_Panel.admin();
        });

        pharmacistButton = new JButton("Pharmacist");
        pharmacistButton.setFont(new Font("Sarif", Font.PLAIN, 25));
        pharmacistButton.setBounds(300, 460, 250, 75);

        pharmacistButton.addActionListener(e -> {
            frame.dispose();
            Pharmacist_Panel.pharmacist();
        });

        frame.add(adminButton);
        frame.add(pharmacistButton);
        frame.setVisible(true);
    }

   public static void main(String[] args) {
        new AdminOrPharmacist();
    }
}
