import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.time.LocalDate;
import org.jdatepicker.*;

public class Schedule_Appointment {
    static Connection con = null;
    static JFrame schedule_Appointment, admit_frame;
    static JLabel doc_room;
    static JTable table;
    static ResultSet rs = null;
    static Statement stmt = null;
    static String p_id, doc_name;
    static int p_Pass;
    static JDatePicker datePicker;

    public static void schedule_appointment() {

        schedule_Appointment = new JFrame();
        schedule_Appointment.setResizable(false);
        schedule_Appointment.setBounds(500, 200, 850, 850);
        schedule_Appointment.setLocationRelativeTo(null);
        schedule_Appointment.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton back_MAin_menu_btn = new JButton("<  Patient Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        schedule_Appointment.add(back_MAin_menu_btn);
        schedule_Appointment.setLayout(null);
        back_MAin_menu_btn.setBounds(50, 30, 150, 50);

        back_MAin_menu_btn.addActionListener(e -> {
            Patient_menu.Patient_menu_main();
            schedule_Appointment.dispose();
        });

        JLabel Heading = new JLabel("SCHEDULE APPOINTMENT");
        schedule_Appointment.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(250, 150, 1000, 50);

        JLabel patient_id_Label = new JLabel("Enter Patient's ID");
        schedule_Appointment.add(patient_id_Label);
        patient_id_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        patient_id_Label.setBounds(250, 250, 180, 15);

        JTextField patient_id_TextField = new JTextField();
        schedule_Appointment.add(patient_id_TextField);
        patient_id_TextField.setBounds(460, 245, 170, 30);

        JLabel patient_otp_Label = new JLabel("Enter Patient Code");
        schedule_Appointment.add(patient_otp_Label);
        patient_otp_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        patient_otp_Label.setBounds(250, 340, 180, 15);

        JTextField patient_otp_TextField = new JTextField();
        schedule_Appointment.add(patient_otp_TextField);
        patient_otp_TextField.setBounds(460, 335, 170, 30);

        JButton sch_Submit = new JButton("SUBMIT");
        schedule_Appointment.add(sch_Submit);
        sch_Submit.setBounds(250, 420, 378, 40);

        sch_Submit.addActionListener(e -> {
            int p_code;
            p_id = patient_id_TextField.getText();
            String p_code_S = patient_otp_TextField.getText();
            if (p_id.equals("") || p_code_S.equals("")) {
                JOptionPane.showMessageDialog(null, "Please First Enter Patient Code", " Error ", JOptionPane.ERROR_MESSAGE);
            } else {
                p_code = Integer.parseInt(p_code_S);
                con = Sconnection.connection();
                String room_num = null;
                int i = 0;
                try {
                    stmt = con.createStatement();
                    rs = stmt.executeQuery("select p_password, doc_room, doc_name from doctor d INNER JOIN patient p ON p.doctor_id = d.doc_id where p_id = '" + p_id + "' ;");
                    while (rs.next()) {
                        i++;
                        room_num = rs.getString(2);
                        doc_name = rs.getString(3);
                        p_Pass = rs.getInt(1);
                    }
                } catch (SQLException ex) {
                    System.out.println("Exception : " + ex);
                }
                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "Doctor is not Available", " Error ", JOptionPane.ERROR_MESSAGE);
                } else if (p_code != p_Pass) {
                    JOptionPane.showMessageDialog(null, "Invalid Code ! \nPlease Re-Enter", " Error ", JOptionPane.ERROR_MESSAGE);
                } else {
                    schedule_Appointment.repaint();
                    doc_room = new JLabel("Your Doctor is Available in room number " + room_num);
                    doc_room.setBounds(250, 490, 600, 40);
                    doc_room.setFont(new Font("Sarif", Font.PLAIN, 19));
                    schedule_Appointment.add(doc_room);

                    JButton meet = new JButton("MEET DOCTOR");
                    schedule_Appointment.add(meet);
                    meet.setBounds(250, 570, 378, 40);

                    meet.addActionListener(e1 -> {
                        schedule_Appointment.dispose();
                        adtmitORPrescribe.admitOrPrescribe(doc_name, patient_id_TextField.getText());
                    });
                }
            }
        });

        schedule_Appointment.setVisible(true);
    }
}
