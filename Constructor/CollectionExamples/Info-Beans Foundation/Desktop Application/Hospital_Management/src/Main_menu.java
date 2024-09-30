import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main_menu {
  public static  void Mainmenu_Main() {
        JFrame mainMenu=new JFrame("MAIN MENU");
        mainMenu.setLayout(null);
        mainMenu.setVisible(true);
        mainMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainMenu.setBounds(800,200,850,850);
        mainMenu.setResizable(false);
        mainMenu.setLocationRelativeTo(null); // center frame1 on 

        JLabel Heading=new JLabel("MAIN MENU");
        mainMenu.add(Heading);
        Heading.setFont(new Font("Sarif",Font.PLAIN,33));
        Heading.setBounds(300,150,1000,50);


        JButton addPatient =new JButton("PATIENT PANEL");
        mainMenu.add(addPatient);
        addPatient.setBounds(125,300,250,50);

        JButton addDoctor =new JButton("DOCTOR PANEL");
        mainMenu.add(addDoctor);
        addDoctor.setBounds(425,300,250,50);
//        mainMenu.setLocationRelativeTo(c);


        JButton addMedicie =new JButton("MEDICINE PANEL");
        mainMenu.add(addMedicie);
        addMedicie.setBounds(125,400,250,50);


        addDoctor.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Doctor_Menu.Doctor_Menu_main();
                mainMenu.dispose();
            }
        });

        addPatient.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                Patient_menu.Patient_menu_main();
                mainMenu.dispose();
            }
        });

        addMedicie.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                Medicine_Menu.Medicine_Menu_main();
                mainMenu.dispose();
            }
        });





    }
}
