import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class Medicine_Show {
    static JTable table;
    static Connection con = null;
    static JFrame medicine_show;
    static String m_id;

    public static void show_medicine() {
        medicine_show = new JFrame("Medicine's Information");
        JPanel table_pane = new JPanel();
        table_pane.setBounds(5, 5, 5, 5);
        table_pane.setLayout(null);
        medicine_show.setContentPane(table_pane);

        medicine_show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DefaultTableModel tab_m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        int i = 0;
        con = Sconnection.connection();
        String[] clm = {"ID", "Name", "Usage", "Period", "Price", "Mg", "Quantity"};
        tab_m.setColumnIdentifiers(clm);
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM medicine");
            while (rs.next()) {
                int med_id = rs.getInt(1);
                String med_name = rs.getString(2);
                String med_usage = rs.getString(3);
                String med_period = rs.getString(4);
                float med_price = rs.getInt(5);
                String med_mg = rs.getString(6);
                int med_quantity = rs.getInt(7);
                tab_m.addRow(new Object[]{med_id, med_name, med_usage, med_period, med_price, med_mg, med_quantity});
                i++;
            }
        } catch (SQLException e) {
            System.out.println("Exception " + e);
        }
        if (i < 1) {
            JOptionPane.showMessageDialog(null, "No Record Found", " Error ", JOptionPane.ERROR_MESSAGE);
        } else {
            table = new JTable(tab_m);
            table.setBounds(20, 80, 200, 100);
            JScrollPane jsp = new JScrollPane(table);
            jsp.setBounds(25, 120, 800, 290);
            table_pane.add(jsp);
            jsp.createVerticalScrollBar();
            jsp.getViewport().setViewPosition(new Point(200, 300));

            medicine_show.add(jsp);
            medicine_show.setSize(850, 850);
            medicine_show.setResizable(false);
            medicine_show.setLocationRelativeTo(null);
            medicine_show.setVisible(true);

            JButton back_MAin_menu_btn = new JButton("<  Medicine Menu");
            back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            medicine_show.add(back_MAin_menu_btn);
            back_MAin_menu_btn.setBounds(20, 10, 150, 50);

            back_MAin_menu_btn.addActionListener(e -> {
                Medicine_Menu.Medicine_Menu_main();
                medicine_show.dispose();
            });

            String[] Usage = {"All Types", "Heart", "Liver", "Fever", "Cold", "Allergies", "Diarrhea", "Headaches", "Stomach Ache", "Mononucleosis"};
            JComboBox usage_Combo = new JComboBox(Usage);
            usage_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
            usage_Combo.setBounds(85, 550, 200, 25);
            medicine_show.add(usage_Combo);

            JLabel medicineUsage = new JLabel("Usage");
            medicine_show.add(medicineUsage);
            medicineUsage.setFont(new Font("Sarif", Font.PLAIN, 20));
            medicineUsage.setBounds(90, 510, 200, 25);

            JLabel medicine_id_label = new JLabel("Medicine ID");
            medicine_show.add(medicine_id_label);
            medicine_id_label.setFont(new Font("Sarif", Font.PLAIN, 20));
            medicine_id_label.setBounds(390, 510, 200, 25);

            JTextField medicine_id_Textfield = new JTextField();
            medicine_show.add(medicine_id_Textfield);
            medicine_id_Textfield.setFont(new Font("Sarif", Font.PLAIN, 15));
            medicine_id_Textfield.setBounds(390, 550, 120, 25);

            JButton delete_medicine_btn = new JButton("DELETE SELECTED ROW");
            delete_medicine_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            medicine_show.add(delete_medicine_btn);
            delete_medicine_btn.setBounds(80, 440, 660, 50);

            delete_medicine_btn.addActionListener(e -> {
                if (table.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(null, "Please Select Row ", "error",
                            JOptionPane.ERROR_MESSAGE);
                }
                int status = JOptionPane.showConfirmDialog(null, "Do You Want to Delete This Row", "Confirm", JOptionPane.YES_NO_OPTION);
                if (status == JOptionPane.YES_OPTION) {
                    try {
                        DefaultTableModel tbl = (DefaultTableModel) table.getModel();
                        m_id = tbl.getValueAt(table.getSelectedRow(), 0).toString();

                        Connection con = Sconnection.connection();
                        DefaultTableModel tbl2 = (DefaultTableModel) table.getModel();
                        if (table.getSelectedRowCount() == 1) {
                            String s = "delete from medicine where med_id = '" + m_id + "'";
                            PreparedStatement ps = con.prepareStatement(s);
                            ps.execute();
                            tbl2.removeRow(table.getSelectedRow());
                        }
                    } catch (Exception ex) {
                        System.out.println("Exception : " + ex);
                    }
                }
            });

            JButton search_Doctor_btn = new JButton("SEARCH ACCORDINGLY");
            search_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            medicine_show.add(search_Doctor_btn);
            search_Doctor_btn.setBounds(80, 620, 660, 50);

            search_Doctor_btn.addActionListener(e -> {
                int j = 0;
                try {
                    tab_m.setRowCount(0);

                    String Med_id = medicine_id_Textfield.getText();
                    String Medcine_Usage = (String) usage_Combo.getSelectedItem();

                    Statement stmt = con.createStatement();
                    ResultSet rs;
                    if (Med_id == null || Med_id.equals("")) {
                        if (Medcine_Usage.equals("All Types")) {
                            rs = stmt.executeQuery("SELECT * FROM medicine ;");
                        } else {
                            rs = stmt.executeQuery("SELECT * FROM medicine WHERE med_usage ='" + Medcine_Usage + "' ;");
                        }
                    } else {
                        rs = stmt.executeQuery("SELECT * FROM medicine WHERE  med_id ='" + Med_id + "' ;");
                    }

                    while (rs.next()) {
                        int med_id = rs.getInt(1);
                        String med_name = rs.getString(2);
                        String med_usage = rs.getString(3);
                        String med_period = rs.getString(4);
                        int med_price = rs.getInt(5);
                        int med_Mg = rs.getInt(6);
                        int med_Quantity = rs.getInt(7);
                        tab_m.addRow(new Object[]{med_id, med_name, med_usage, med_period, med_price, med_Mg, med_Quantity});
                        j++;
                    }
                } catch (SQLException f) {
                    System.out.println("Exception " + f);
                }
                if (j < 1) {
                    JOptionPane.showMessageDialog(null, "No Record Found", " Error ", JOptionPane.ERROR_MESSAGE);
                }
            });

        }
    }
}
