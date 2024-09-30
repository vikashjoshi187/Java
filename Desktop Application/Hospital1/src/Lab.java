import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class Lab {
    static JFrame lab_farme;
    static JTable table;

    public static void lab_info(String patient_id) {
        lab_farme = new JFrame("Lab Information");
        lab_farme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab_farme.setBounds(500, 200, 850, 850);
        lab_farme.setResizable(false);
        lab_farme.setLocationRelativeTo(null);

        JPanel tablepanal = new JPanel();
        tablepanal.setBounds(5, 5, 5, 5);
        lab_farme.setContentPane(tablepanal);
        tablepanal.setLayout(null);

        DefaultTableModel tab_m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(tab_m);
        table.setBounds(20, 80, 200, 100);
        JScrollPane jscrollpane = new JScrollPane(table);
        jscrollpane.setBounds(25, 180, 800, 150);
        tablepanal.add(jscrollpane);
        jscrollpane.createVerticalScrollBar();
        jscrollpane.getViewport().setViewPosition(new Point(200, 300));
        lab_farme.add(jscrollpane);

        JButton back_MAin_menu_btn = new JButton("<  Previous Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        lab_farme.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setBounds(20, 10, 120, 50);

        back_MAin_menu_btn.addActionListener(e -> {
            Schedule_Appointment.schedule_appointment();
            lab_farme.dispose();
        });

        JLabel Heading1 = new JLabel("TEST DETAILS");
        lab_farme.add(Heading1);
        Heading1.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading1.setBounds(280, 100, 1000, 50);

        JLabel admit = new JLabel("Do You Want To Prescribe Any Test");
        lab_farme.add(admit);
        admit.setBounds(225, 380, 4000, 25);
        admit.setFont(new Font("Sarif", Font.PLAIN, 22));

        JButton yes = new JButton("YES");
        yes.setBounds(300, 445, 80, 30);
        lab_farme.add(yes);

        yes.addActionListener(e2 -> {
            tab_m.setRowCount(0);
            String[] column = {"Test_Id", "Test_Name", "TestPrice"};
            tab_m.setColumnIdentifiers(column);
            int i = 0;
            try {
                Connection con = Sconnection.connection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM lab");
                while (rs.next()) {
                    int lab_id = rs.getInt(1);
                    String test_name = rs.getString(2);
                    float test_price = rs.getFloat(3);
                    tab_m.addRow(new Object[]{lab_id, test_name, test_price});
                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("Exception " + ex);
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", " Error ", JOptionPane.ERROR_MESSAGE);
            }

            JLabel ward = new JLabel("Please Select Test You Want to Prescribe");
            lab_farme.add(ward);
            ward.setBounds(225, 510, 450, 30);
            ward.setFont(new Font("Sarif", Font.PLAIN, 22));

            JButton select_btn = new JButton("SELECT");
            lab_farme.add(select_btn);
            select_btn.setBounds(225, 570, 345, 40);

            select_btn.addActionListener(f -> {
                Connection con = Sconnection.connection();
                Statement stmt = null;
                if (table.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(null, "Please Select a Test ", "error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int status = JOptionPane.showConfirmDialog(null, "Do You Want to confirm this test", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (status == JOptionPane.YES_OPTION) {
                        try {
                            DefaultTableModel tbl = (DefaultTableModel) table.getModel();
                            String test_id = tbl.getValueAt(table.getSelectedRow(), 0).toString();
                            if (table.getSelectedRowCount() == 1) {
                                String query = "insert into test (patient_id, test_id) values (?,?)";
                                PreparedStatement ps = con.prepareStatement(query);
                                ps.setString(1, patient_id);
                                ps.setString(2, test_id);
                                ps.execute();
                            }
                        } catch (Exception ex) {
                            System.out.println("Exception : " + ex);
                        }
                    }
                }

                JButton prescibe_medicine = new JButton("PRESCRIBE MEDICINE");
                lab_farme.add(prescibe_medicine);
                prescibe_medicine.setBounds(225, 640, 345, 40);

                prescibe_medicine.addActionListener(e -> {
                    PrescribeMedicine.prescribeMedicinemain(patient_id);
                    lab_farme.dispose();
                });
            });
        });

        JButton No = new JButton("NO");
        No.setBounds(400, 445, 80, 30);
        lab_farme.add(No);

        No.addActionListener(e -> {
            PrescribeMedicine.prescribeMedicinemain(patient_id);
            lab_farme.dispose();
        });
        lab_farme.setVisible(true);
    }
}
