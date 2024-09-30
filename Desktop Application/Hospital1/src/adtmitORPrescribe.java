import javax.swing.*;
import java.awt.*;

public class adtmitORPrescribe {
    public static void admitOrPrescribe(String dr_name, String patinet_id) {
        JFrame AdmitORprescribe = new JFrame("Admit OR Prescribe");
        AdmitORprescribe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        AdmitORprescribe.setBounds(350, 100, 850, 850);
        AdmitORprescribe.setLayout(null);
        AdmitORprescribe.setResizable(false);
        AdmitORprescribe.setLocationRelativeTo(null);

        JButton back_MAin_menu_btn = new JButton("< Previous Menu");
        back_MAin_menu_btn.setBounds(20, 10, 150, 50);
        AdmitORprescribe.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));

        back_MAin_menu_btn.addActionListener(e -> {
            Schedule_Appointment.schedule_appointment();
            AdmitORprescribe.dispose();
        });

        JLabel Question = new JLabel("Hello  Dr." + dr_name);
        Question.setFont(new Font("Sarif", Font.BOLD, 30));
        AdmitORprescribe.add(Question);
        Question.setBounds(315, 120, 500, 35);

        Question = new JLabel(" Do you want to admit or prescribe");
        Question.setFont(new Font("Sarif", Font.PLAIN, 30));
        AdmitORprescribe.add(Question);
        Question.setBounds(195, 200, 500, 35);

        JButton Admit_Btn = new JButton("Admit");
        AdmitORprescribe.add(Admit_Btn);
        Admit_Btn.setBounds(175, 330, 500, 70);
        Admit_Btn.setFont(new Font("Sarif", Font.PLAIN, 20));

        Admit_Btn.addActionListener(e -> {
            Ward_details.admitPatient(patinet_id);
            AdmitORprescribe.dispose();
        });

        JButton Priscibe_Btn = new JButton("Prescribe");
        AdmitORprescribe.add(Priscibe_Btn);
        Priscibe_Btn.setBounds(175, 500, 500, 70);
        Priscibe_Btn.setFont(new Font("Sarif", Font.PLAIN, 20));

        Priscibe_Btn.addActionListener(e -> {
            Lab.lab_info(patinet_id);
            AdmitORprescribe.dispose();
        });

        AdmitORprescribe.setVisible(true);
    }
//    public static void main(String[] args) {
//        admitOrPrescribe("Hathi","3");
//    }
}
