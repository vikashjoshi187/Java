import org.jdatepicker.JDateComponentFactory;
import org.jdatepicker.JDatePicker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDate;

public class Ward_details {
    static JFrame admit_frame;
    static JTable table;
    static JDatePicker datePicker;

    public static void admitPatient(String p_id) {
        admit_frame = new JFrame();
        admit_frame.setBounds(500, 200, 850, 850);
        admit_frame.setLocationRelativeTo(null);
        admit_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        admit_frame.setResizable(false);

        JPanel tablepane = new JPanel();
        tablepane.setBounds(5, 5, 5, 5);
        admit_frame.setContentPane(tablepane);
        tablepane.setLayout(null);

        DefaultTableModel tab_m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(tab_m);
        table.setBounds(20, 80, 200, 100);
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(25, 180, 800, 100);
        tablepane.add(jsp);
        jsp.createVerticalScrollBar();
        jsp.getViewport().setViewPosition(new Point(200, 300));
        admit_frame.add(jsp);

        JButton back_MAin_menu_btn1 = new JButton("<  Previous Menu");
        back_MAin_menu_btn1.setFont(new Font("Sarif", Font.PLAIN, 15));
        admit_frame.add(back_MAin_menu_btn1);
        back_MAin_menu_btn1.setBounds(50, 30, 150, 50);

        back_MAin_menu_btn1.addActionListener(ex -> {
            Schedule_Appointment.schedule_appointment();
            admit_frame.dispose();
        });

        JLabel Heading1 = new JLabel("WARD DETAILS");
        admit_frame.add(Heading1);
        Heading1.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading1.setBounds(280, 100, 1000, 50);

        JLabel appoint_label = new JLabel("Admit Date");
        admit_frame.add(appoint_label);
        appoint_label.setFont(new Font("Sarif", Font.PLAIN, 20));
        appoint_label.setBounds(225, 400, 200, 25);

        JPanel panel = new JPanel();
        JDateComponentFactory factory = new JDateComponentFactory();
        datePicker = factory.createJDatePicker();
        datePicker.getModel().setDate(LocalDate.now().getYear(), LocalDate.now().getMonthValue() - 1, LocalDate.now().getDayOfMonth());
        datePicker.getModel().setSelected(true);
        panel.add((Component) datePicker);
        panel.setBounds(365, 395, 210, 34);
        admit_frame.add(panel);

        int j = 0;
        String[] column = {"Ward_Id", "Ward_Name", "Bed_Price", "Total_Bed", "Nurse"};
        tab_m.setColumnIdentifiers(column);
        try {
            Connection con = Sconnection.connection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Ward");
            while (rs.next()) {
                int ward_id = rs.getInt(1);
                String ward_name = rs.getString(2);
                int total_bed = rs.getInt(3);
                int nurse_available = rs.getInt(4);
                float price = rs.getFloat(5);
                tab_m.addRow(new Object[]{ward_id, ward_name, price, total_bed, nurse_available});
                j++;
            }
        } catch (SQLException ex) {
            System.out.println("Exception " + ex);
        }
        if (j < 1) {
            JOptionPane.showMessageDialog(null, "No Record Found", " Error ", JOptionPane.ERROR_MESSAGE);
        }

        JLabel ward = new JLabel("Please Select Ward (By Patient)");
        admit_frame.add(ward);
        ward.setBounds(225, 480, 400, 30);
        ward.setFont(new Font("Sarif", Font.PLAIN, 22));

        JButton select_btn = new JButton("SELECT");
        admit_frame.add(select_btn);
        select_btn.setBounds(225, 540, 345, 40);

        select_btn.addActionListener(f -> {
            int year = datePicker.getModel().getYear();
            String month = "", day = "";
            if ((datePicker.getModel().getMonth() + 1) < 10) {
                month = "0" + (datePicker.getModel().getMonth() + 1);
            } else {
                month = String.valueOf((datePicker.getModel().getMonth()) + 1);
            }
            if ((datePicker.getModel().getDay()) < 10) {
                day = "0" + datePicker.getModel().getDay();
            } else {
                day = String.valueOf(datePicker.getModel().getDay());
            }
            String admit_date = day + "/" + month + "/" + year;
            String apt_date = null;
            Connection con = Sconnection.connection();
            Statement stmt = null;
            try {
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select apt_date from patient where p_id = '" + p_id + "'");
                while (rs.next()) {
                    apt_date = rs.getString(1);
                }
            } catch (SQLException e) {
                System.out.println("Exception : " + e);
            }
            if (Vliad_info_Check.IsValidAdmitDate(apt_date, admit_date)) {
                if (table.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(null, "Please Select a Ward ", "error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int status = JOptionPane.showConfirmDialog(null, "Do You Want to confirm this ward", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (status == JOptionPane.YES_OPTION) {
                        try {
                            DefaultTableModel tbl = (DefaultTableModel) table.getModel();
                            String w_id = tbl.getValueAt(table.getSelectedRow(), 0).toString();
                            if (table.getSelectedRowCount() == 1) {
                                String s = "UPDATE Patient set ward_id = '" + w_id + "', admit_date = '" + admit_date + "' where p_id = " + p_id;
                                PreparedStatement ps = con.prepareStatement(s);
                                ps.execute();
                                admit_frame.dispose();
                                Lab.lab_info(p_id);
                            }
                        } catch (Exception ex) {
                            System.out.println("Exception : " + ex);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter Correct Date ", "error", JOptionPane.ERROR_MESSAGE);
            }
        });


        JButton MediCM_btn = new JButton("CLICK HERE FOR MEDI-CLAIM");
        admit_frame.add(MediCM_btn);
        MediCM_btn.setBounds(225, 600, 345, 40);

        MediCM_btn.addActionListener(e -> {
            mediclaimAmount.mediclmMain(p_id);
        });

        admit_frame.setVisible(true);
    }
}
