import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Schedule_Appointment {
    static JFrame Schedule_Appointment ;
    public static void Schedule_Appointment(){
        Schedule_Appointment = new JFrame();
        Schedule_Appointment.setBounds(500, 200, 850, 850);
        Schedule_Appointment.setLocationRelativeTo(null);
        Schedule_Appointment.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton back_MAin_menu_btn=new JButton("<  Main Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        Schedule_Appointment.add(back_MAin_menu_btn);
        Schedule_Appointment.setLayout(null);
        back_MAin_menu_btn.setBounds(50,30,120,50);

        back_MAin_menu_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                Main_menu.Mainmenu_Main();
                Schedule_Appointment.dispose();
            }
        });

        JLabel Heading = new JLabel("SCHEDULE APPOINTMENT");
        Schedule_Appointment.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(250, 150, 1000, 50);

        JLabel medicine_Name_Label = new JLabel("Enter Patient's ID");
        Schedule_Appointment.add(medicine_Name_Label);
        medicine_Name_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        medicine_Name_Label.setBounds(250, 330, 180, 15);

        JTextField medicine_Name_TextField = new JTextField();
        Schedule_Appointment.add(medicine_Name_TextField);
        medicine_Name_TextField.setBounds(430, 325, 160, 30);

        JButton docSubmit =new JButton("SUBMIT");
        Schedule_Appointment.add(docSubmit);
        docSubmit.setBounds(250,500,350,40);

        docSubmit.addActionListener(e -> {
            Main_menu.Mainmenu_Main();
            Schedule_Appointment.dispose();
        });

        Schedule_Appointment.setVisible(true);
    }
}
