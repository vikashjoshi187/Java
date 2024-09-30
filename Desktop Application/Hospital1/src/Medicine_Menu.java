import javax.swing.*;
import java.awt.*;

public class Medicine_Menu {
    public static void Medicine_Menu_main() {

        JFrame Medicine_Menu = new JFrame("MEDICINE PANEL");
        Medicine_Menu.setVisible(true);
        Medicine_Menu.setBounds(500, 200, 850, 850);
        Medicine_Menu.setLocationRelativeTo(null);
        Medicine_Menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton back_MAin_menu_btn = new JButton("<  Log Out");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Medicine_Menu.add(back_MAin_menu_btn);
        Medicine_Menu.setLayout(null);
        back_MAin_menu_btn.setBounds(50, 30, 120, 50);

        back_MAin_menu_btn.addActionListener(e -> {
            AdminOrPharmacist.main(new String[]{});
            Medicine_Menu.dispose();
        });

        JButton update_detail = new JButton("Update Details");
        Medicine_Menu.add(update_detail);
        update_detail.setBounds(620, 30, 150, 50);

        update_detail.addActionListener(e -> {
            UpdateAdminDetails.UpdateDetail(2);
            Medicine_Menu.dispose();
        });

        JLabel Heading = new JLabel("MEDICINE PANEL 💊");
        Medicine_Menu.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(265, 180, 1000, 50);

        JButton add_Medicine_btn = new JButton("ADD MEDICINE");
        add_Medicine_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Medicine_Menu.add(add_Medicine_btn);
        Medicine_Menu.setLayout(null);
        add_Medicine_btn.setBounds(297, 315, 210, 50);

        add_Medicine_btn.addActionListener(e -> {
            Medicine_Info.Medicine_main();
            Medicine_Menu.dispose();
        });

        JButton Info_Medicine_btn = new JButton("MEDICINE LIST");
        Info_Medicine_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Medicine_Menu.add(Info_Medicine_btn);
        Medicine_Menu.setLayout(null);
        Info_Medicine_btn.setBounds(297, 450, 210, 50);

        Info_Medicine_btn.addActionListener(e -> {
            Medicine_Show.show_medicine();
            Medicine_Menu.dispose();
        });
    }
}
