import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Medicine_Menu {
    public static void Medicine_Menu_main() {

        JFrame Medicine_Menu =new JFrame("MEDICINE PANEL");
        Medicine_Menu.setVisible(true);
        Medicine_Menu.setBounds(500, 200, 850, 850);
        Medicine_Menu.setLocationRelativeTo(null);
        Medicine_Menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton back_MAin_menu_btn=new JButton("<  Main Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Medicine_Menu.add(back_MAin_menu_btn);
        Medicine_Menu.setLayout(null);
        back_MAin_menu_btn.setBounds(50,30,120,50);


        back_MAin_menu_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                Main_menu.Mainmenu_Main();
                Medicine_Menu.dispose();
            }
        });

        JLabel Heading = new JLabel("MEDICINE PANEL 💊");
        Medicine_Menu.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(300, 150, 1000, 50);


        JButton add_Medicine_btn=new JButton("ADD MEDICINE");
        add_Medicine_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Medicine_Menu.add(add_Medicine_btn);
        Medicine_Menu.setLayout(null);
        add_Medicine_btn.setBounds(297,300,210,50);


        add_Medicine_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                Medicine_Info.Medicine_main();

                Medicine_Menu.dispose();
            }
        });


        JButton Info_Medicine_btn=new JButton("MEDICINE LIST");
        Info_Medicine_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Medicine_Menu.add(Info_Medicine_btn);
        Medicine_Menu.setLayout(null);
        Info_Medicine_btn.setBounds(297,450,210,50);


        Info_Medicine_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                Medicine_Show.show_medicine();
                Medicine_Menu.dispose();
            }
        });
    }

}
