import org.jdatepicker.JDateComponentFactory;
import org.jdatepicker.JDatePicker;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.time.LocalDate;

public class Billdilouge {
    static String p_id;
    static int p_Pass;static String status;
    static JDatePicker datePicker;
    public static void bill_details() {
        JFrame bill_frame=new JFrame("VERIFICATION");
        bill_frame.setResizable(false);
        bill_frame.setBounds(290,200,850,850);
        bill_frame.setLocationRelativeTo(null);
        bill_frame.setLayout(null);
        bill_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton back_MAin_menu_btn = new JButton("<  Main Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        bill_frame.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setBounds(20, 10, 120, 50);

        back_MAin_menu_btn.addActionListener(e -> {
            Main_menu.Mainmenu_Main();
            bill_frame.dispose();
        });

        JLabel Heading = new JLabel("BILL ENTRY");
        bill_frame.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(300, 80, 1000, 50);

        JLabel patient_id_Label = new JLabel("Enter Patient's ID");
        bill_frame.add(patient_id_Label);
        patient_id_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        patient_id_Label.setBounds(195, 180, 180, 15);

        JTextField patient_id_TextField = new JTextField();
        bill_frame.add(patient_id_TextField);
        patient_id_TextField.setBounds(195, 260, 180, 30);

        JLabel patient_otp_Label = new JLabel("Enter Patient Code");
        bill_frame.add(patient_otp_Label);
        patient_otp_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        patient_otp_Label.setBounds(415, 180, 180, 15);

        JTextField patient_otp_TextField = new JTextField();
        bill_frame.add(patient_otp_TextField);
        patient_otp_TextField.setBounds(415, 260, 180, 30);

        JLabel discharge_label = new JLabel("Discharge Date");
        bill_frame.add(discharge_label);
        discharge_label.setFont(new Font("Sarif", Font.PLAIN, 20));
        discharge_label.setBounds(195, 360, 200, 25);

        JPanel panel = new JPanel();
        JDateComponentFactory factory = new JDateComponentFactory();
        datePicker = factory.createJDatePicker();
        datePicker.getModel().setDate(LocalDate.now().getYear(), LocalDate.now().getMonthValue() - 1, LocalDate.now().getDayOfMonth());
        datePicker.getModel().setSelected(true);
        panel.add((Component) datePicker);
        panel.setBounds(390, 358, 210, 35);

        panel.add((Component) datePicker);
        bill_frame.add(panel);

        JLabel test_label = new JLabel("Do You Get Test From Our Us");
        bill_frame.add(test_label);
        test_label.setFont(new Font("Sarif", Font.PLAIN, 19));
        test_label.setBounds(195, 460, 290, 25);

        Container c = bill_frame.getContentPane();
        String[] y_n = new String[]{"YES","NO"};
        JComboBox y_n_combo = new JComboBox(y_n);
        y_n_combo.setFont(new Font("Sarif", Font.PLAIN, 15));
        c.add(y_n_combo);
        bill_frame.add(y_n_combo);
        y_n_combo.setBounds(495, 460, 100, 30);

        JButton sch_Submit = new JButton("SUBMIT");
        bill_frame.add(sch_Submit);
        sch_Submit.setBounds(195, 560, 400, 50);

        sch_Submit.addActionListener(e -> {
            String y_n_choose = String.valueOf(y_n_combo.getSelectedItem());
            int year = datePicker.getModel().getYear();
            String month = "", day = "";
            if ((datePicker.getModel().getMonth() + 1) < 10) {
                month = "0" + (datePicker.getModel().getMonth() + 1);
            } else {
                month = String.valueOf((datePicker.getModel().getMonth() + 1));
            }
            if ((datePicker.getModel().getDay()) < 10) {
                day = "0" + datePicker.getModel().getDay();
            } else {
                day = String.valueOf(datePicker.getModel().getDay());
            }
            String dis_date = day + "/" + month + "/" + year;
            String admit_date = null;
            int p_code;
            p_id = patient_id_TextField.getText();
            String p_code_S = patient_otp_TextField.getText();
            Connection con = Sconnection.connection();
            Statement stmt = null;
            try {
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select admit_date from patient where p_id = '" + p_id + "'");
                while (rs.next()) {
                    admit_date = rs.getString(1);
                }
            } catch (SQLException ex) {
                System.out.println("Exception : " + ex);
            }
            if (p_id.equals("")) {
                JOptionPane.showMessageDialog(null, "Please First Enter Patient Id", " Error ", JOptionPane.ERROR_MESSAGE);
            } else if (p_code_S.equals("")) {
                JOptionPane.showMessageDialog(null, "Please First Enter Patient Code", " Error ", JOptionPane.ERROR_MESSAGE);
            } else {
                p_code = Integer.parseInt(p_code_S);
                int i = 0;
                try {
                    stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("select p_password,status from patient where p_id = '" + p_id + "' ;");
                    while (rs.next()) {
                        i++;
                        p_Pass = rs.getInt(1);
                        status=rs.getString(2);

                    }
                } catch (SQLException ex) {
                    System.out.println("Exception : " + ex);
                }
                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Code or ID", " Error ", JOptionPane.ERROR_MESSAGE);
                } else if (p_code != p_Pass) {
                    JOptionPane.showMessageDialog(null, "Invalid Code ! \nPlease Re-Enter", " Error ", JOptionPane.ERROR_MESSAGE);
                } else if(!(Vliad_info_Check.IsValidAdmitDate(admit_date,dis_date))){
                    JOptionPane.showMessageDialog(null, "Please Enter Correct Date ", "error", JOptionPane.ERROR_MESSAGE);
                } else {
                    String s = "UPDATE Patient set status = 'Deactivate', discharge_date = '" + dis_date + "' where p_id = " + p_id;
                    PreparedStatement ps = null;
                    try {
                        ps = con.prepareStatement(s);
                        ps.execute();
                    } catch (SQLException ex) {
                        System.out.println("exception : " + ex);
                    }
                    if(status.equals("Active")) {
                        bill_frame.dispose();
                        Bill.hospital_bill(p_id,y_n_choose,dis_date);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Patient is no more active", " Error ", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        bill_frame.setVisible(true);
    }
}
