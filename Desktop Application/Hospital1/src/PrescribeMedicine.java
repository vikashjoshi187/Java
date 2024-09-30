import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class PrescribeMedicine {
    static JTable table;
    static Connection con = null;
    static JFrame prescribeMedicine;
    static int num_of_med;
    static int med_qty;

    public static void prescribeMedicinemain(String patient_Id) {
        con = Sconnection.connection();
        prescribeMedicine = new JFrame("Prescription Center");
        prescribeMedicine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int med_quantity=0;
        JPanel table_pane = new JPanel();
        table_pane.setBounds(5, 5, 5, 5);
        prescribeMedicine.setContentPane(table_pane);
        table_pane.setLayout(null);

        DefaultTableModel tab_m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        int i = 0;
        String[] clm = {"ID", "Name", "Price", "Usage", "Period", "Mg","Quantity"};
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
                med_quantity=rs.getInt(7);
                tab_m.addRow(new Object[]{med_id, med_name, med_price, med_usage, med_period, med_mg,med_quantity});
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

            prescribeMedicine.add(jsp);
            prescribeMedicine.setSize(850, 850);
            prescribeMedicine.setResizable(false);
            prescribeMedicine.setLocationRelativeTo(null);

            JButton back_MAin_menu_btn = new JButton("<  Previous Menu");
            back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            prescribeMedicine.add(back_MAin_menu_btn);
            back_MAin_menu_btn.setBounds(20, 10, 150, 50);

            back_MAin_menu_btn.addActionListener(e -> {
                Schedule_Appointment.schedule_appointment();
                prescribeMedicine.dispose();
            });

            JLabel n_of_med = new JLabel("Number of Medicines");
            prescribeMedicine.add(n_of_med);
            n_of_med.setFont(new Font("Sarif", Font.PLAIN, 20));
            n_of_med.setBounds(90,455, 200, 15);

            JTextField n_of_med_Textfield = new JTextField();
            prescribeMedicine.add(n_of_med_Textfield);
            n_of_med_Textfield.setFont(new Font("Sarif", Font.PLAIN, 15));
            n_of_med_Textfield.setBounds(320,450, 100, 30);

            JButton prescribeSelectedMedicinebtn = new JButton("PRESCRIBE SELECTED MEDICINE");
            prescribeSelectedMedicinebtn.setFont(new Font("Sarif", Font.PLAIN, 15));
            prescribeMedicine.add(prescribeSelectedMedicinebtn);
            prescribeSelectedMedicinebtn.setBounds(470, 440, 300, 40);

            prescribeSelectedMedicinebtn.addActionListener(e -> {
                if(n_of_med_Textfield.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter Medicine Quantity ", "error", JOptionPane.ERROR_MESSAGE);
                }  else {
                    num_of_med = Integer.parseInt(n_of_med_Textfield.getText());
                    if (num_of_med <= 0){
                        JOptionPane.showMessageDialog(null, "Invalid Medicine Quantity ", "error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String medi_id;
                        if (table.getSelectedRow() == -1) {
                            JOptionPane.showMessageDialog(null, "Please Select a Medicine", "error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            int status = JOptionPane.showConfirmDialog(null, "Do You Want to Prescribe This Medicine", "Confirm", JOptionPane.YES_NO_OPTION);
                            if (status == JOptionPane.YES_OPTION) {
                                try {
                                    DefaultTableModel tbl = (DefaultTableModel) table.getModel();
                                    medi_id = tbl.getValueAt(table.getSelectedRow(), 0).toString();
                                    med_qty = Integer.parseInt(tbl.getValueAt(table.getSelectedRow(), 6).toString());

                                    int mdid = Integer.parseInt(medi_id);
                                    String medi_name = tbl.getValueAt(table.getSelectedRow(), 1).toString();
                                    float med_price = Float.parseFloat(tbl.getValueAt(table.getSelectedRow(), 2).toString());
                                    Connection con = Sconnection.connection();
                                    DefaultTableModel tbl2 = (DefaultTableModel) table.getModel();
                                    if (table.getSelectedRowCount() == 1) {
                                        PreparedStatement st = con.prepareStatement("insert into medicine_alloted(patient_id,med_id,num_of_med) VALUES (?,?,?)");
                                        st.setString(1, patient_Id);
                                        st.setInt(2, mdid);
                                        st.setInt(3, num_of_med);
                                        st.execute();
                                    }

                                    if (table.getSelectedRowCount() == 1) {
                                        String s = "UPDATE medicine set med_quantity = '" + (med_qty-num_of_med) + "' where med_id = " + mdid;
                                        System.out.println(num_of_med);
                                        System.out.println(med_qty);
                                        PreparedStatement ps = con.prepareStatement(s);
                                        ps.execute();
                                    }
                                } catch (Exception ex) {
                                    System.out.println("Exception : " + ex);
                                }
                            }
                        }
                        JLabel complete_label = new JLabel("Complete prescription");
                        prescribeMedicine.add(complete_label);
                        complete_label.setFont(new Font("Sarif", Font.PLAIN, 20));
                        complete_label.setBounds(600, 510, 200, 25);

                        JButton complete = new JButton("Complete");
                        complete.setFont(new Font("Sarif", Font.PLAIN, 15));
                        prescribeMedicine.add(complete);
                        complete.setBounds(600, 550, 200, 30);

                        complete.addActionListener(ex -> {
                            Patient_menu.Patient_menu_main();
                            prescribeMedicine.dispose();
                        });
                    }
                }
            });

            JLabel medicineUsage = new JLabel("Usage");
            prescribeMedicine.add(medicineUsage);
            medicineUsage.setFont(new Font("Sarif", Font.PLAIN, 20));
            medicineUsage.setBounds(90, 510, 200, 25);

            String[] Usage = {"All Types", "Heart", "Liver", "Fever", "Cold", "Allergies", "Diarrhea", "Headaches", "Stomach Ache", "Mononucleosis"};
            JComboBox usage_Combo = new JComboBox(Usage);
            usage_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
            usage_Combo.setBounds(85, 550, 200, 25);
            prescribeMedicine.add(usage_Combo);

            JLabel medicine_id_label = new JLabel("Medicine ID");
            prescribeMedicine.add(medicine_id_label);
            medicine_id_label.setFont(new Font("Sarif", Font.PLAIN, 20));
            medicine_id_label.setBounds(390, 510, 200, 25);

            JTextField medicine_id_Textfield = new JTextField();
            prescribeMedicine.add(medicine_id_Textfield);
            medicine_id_Textfield.setFont(new Font("Sarif", Font.PLAIN, 15));
            medicine_id_Textfield.setBounds(390, 550, 120, 25);

            JButton search_Doctor_btn = new JButton("SEARCH ACCORDINGLY");
            search_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            prescribeMedicine.add(search_Doctor_btn);
            search_Doctor_btn.setBounds(80, 620, 660, 50);

            search_Doctor_btn.addActionListener(e -> {
                int i1 = 0;
                try {
                    tab_m.setRowCount(0);
                    String Med_id = medicine_id_Textfield.getText();
                    String Medcine_Usage = (String) usage_Combo.getSelectedItem();

                    Statement stmt = con.createStatement();
                    ResultSet rs;
                    if (Med_id == null || Med_id.equals("")) {
                        if (Medcine_Usage.equals("All Types")) {
                            rs = stmt.executeQuery("SELECT * FROM Medicine ;");
                        } else {
                            rs = stmt.executeQuery("SELECT * FROM Medicine WHERE med_usage ='" + Medcine_Usage + "' ;");
                        }
                    } else {
                        rs = stmt.executeQuery("SELECT * FROM Medicine WHERE  med_id ='" + Med_id + "' ;");
                    }
                    while (rs.next()) {
                        int med_id1 = rs.getInt(1);
                        String med_name1 = rs.getString(2);
                        String med_usage1 = rs.getString(3);
                        String med_period1 = rs.getString(4);
                        int med_price1 = rs.getInt(5);
                        int med_Mg = rs.getInt(6);
                        int med_Quantity = rs.getInt(7);
                        tab_m.addRow(new Object[]{med_id1, med_name1, med_usage1, med_period1, med_price1, med_Mg, med_Quantity});
                        i1++;
                    }
                } catch (SQLException f) {
                    System.out.println("Exception " + f);
                }
                if (i1 < 1) {
                    JOptionPane.showMessageDialog(null, "No Record Found", " Error ", JOptionPane.ERROR_MESSAGE);
                }
            });
        }
        prescribeMedicine.setVisible(true);
    }
}


//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.sql.*;
//
//public class PrescribeMedicine {
//    static JTable table;
//    static Connection con = null;
//    static JFrame prescribeMedicine;
//
//    public static void prescribeMedicinemain(String patient_Id) {
//        con = Sconnection.connection();
//        prescribeMedicine = new JFrame("Prescription Center");
//        prescribeMedicine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel table_pane = new JPanel();
//        table_pane.setBounds(5, 5, 5, 5);
//        prescribeMedicine.setContentPane(table_pane);
//        table_pane.setLayout(null);
//
//        DefaultTableModel tab_m = new DefaultTableModel() {
//            @Override
//            public boolean isCellEditable(int row, int column) {
//                return false;
//            }
//        };
//
//        int i = 0;
//        String[] clm = {"ID", "Name", "Price", "Usage", "Period", "Mg"};
//        tab_m.setColumnIdentifiers(clm);
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM medicine");
//            while (rs.next()) {
//                int med_id = rs.getInt(1);
//                String med_name = rs.getString(2);
//                String med_usage = rs.getString(3);
//                String med_period = rs.getString(4);
//                float med_price = rs.getInt(5);
//                String med_mg = rs.getString(6);
//                tab_m.addRow(new Object[]{med_id, med_name, med_price, med_usage, med_period, med_mg});
//                i++;
//            }
//        } catch (SQLException e) {
//            System.out.println("Exception " + e);
//        }
//        if (i < 1) {
//            JOptionPane.showMessageDialog(null, "No Record Found", " Error ", JOptionPane.ERROR_MESSAGE);
//        } else {
//            table = new JTable(tab_m);
//            table.setBounds(20, 80, 200, 100);
//            JScrollPane jsp = new JScrollPane(table);
//            jsp.setBounds(25, 120, 800, 290);
//            table_pane.add(jsp);
//            jsp.createVerticalScrollBar();
//            jsp.getViewport().setViewPosition(new Point(200, 300));
//
//            prescribeMedicine.add(jsp);
//            prescribeMedicine.setSize(850, 850);
//            prescribeMedicine.setResizable(false);
//            prescribeMedicine.setLocationRelativeTo(null);
//
//            JButton back_MAin_menu_btn = new JButton("<  Previous Menu");
//            back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
//            prescribeMedicine.add(back_MAin_menu_btn);
//            back_MAin_menu_btn.setBounds(20, 10, 150, 50);
//
//            back_MAin_menu_btn.addActionListener(e -> {
//                Schedule_Appointment.schedule_appointment();
//                prescribeMedicine.dispose();
//            });
//
//            JLabel n_of_med = new JLabel("Number of Medicines");
//            prescribeMedicine.add(n_of_med);
//            n_of_med.setFont(new Font("Sarif", Font.PLAIN, 20));
//            n_of_med.setBounds(90,455, 200, 15);
//
//            JTextField n_of_med_Textfield = new JTextField();
//            prescribeMedicine.add(n_of_med_Textfield);
//            n_of_med_Textfield.setFont(new Font("Sarif", Font.PLAIN, 15));
//            n_of_med_Textfield.setBounds(320,450, 100, 30);
//
//            JButton prescribeSelectedMedicinebtn = new JButton("PRESCRIBE SELECTED MEDICINE");
//            prescribeSelectedMedicinebtn.setFont(new Font("Sarif", Font.PLAIN, 15));
//            prescribeMedicine.add(prescribeSelectedMedicinebtn);
//            prescribeSelectedMedicinebtn.setBounds(470, 440, 300, 40);
//
//            prescribeSelectedMedicinebtn.addActionListener(e -> {
//                if(n_of_med_Textfield.getText().equals("")){
//                    JOptionPane.showMessageDialog(null, "Please Enter Medicine Quantity ", "error", JOptionPane.ERROR_MESSAGE);
//                }  else {
//                    int num_of_med = Integer.parseInt(n_of_med_Textfield.getText());
//                    if (num_of_med <= 0){
//                        JOptionPane.showMessageDialog(null, "Invalid Medicine Quantity ", "error", JOptionPane.ERROR_MESSAGE);
//                    } else {
//                        String medi_id;
//                        if (table.getSelectedRow() == -1) {
//                            JOptionPane.showMessageDialog(null, "Please Select a Medicine", "error", JOptionPane.ERROR_MESSAGE);
//                        } else {
//                            int status = JOptionPane.showConfirmDialog(null, "Do You Want to Prescribe This Medicine", "Confirm", JOptionPane.YES_NO_OPTION);
//                            if (status == JOptionPane.YES_OPTION) {
//                                try {
//                                    DefaultTableModel tbl = (DefaultTableModel) table.getModel();
//                                    medi_id = tbl.getValueAt(table.getSelectedRow(), 0).toString();
//                                    int mdid = Integer.parseInt(medi_id);
//                                    Connection con = Sconnection.connection();
//                                    DefaultTableModel tbl2 = (DefaultTableModel) table.getModel();
//                                    if (table.getSelectedRowCount() == 1) {
//                                        PreparedStatement st = con.prepareStatement("insert into medicine_alloted (patient_id,med_id,num_of_med) VALUES (?,?,?)");
//                                        st.setString(1, patient_Id);
//                                        st.setInt(2, mdid);
//                                        st.setInt(3, num_of_med);
//                                        st.execute();
//                                    }
//                                } catch (Exception ex) {
//                                    System.out.println("Exception : " + ex);
//                                }
//                            }
//                        }
//                        JLabel complete_label = new JLabel("Complete prescription");
//                        prescribeMedicine.add(complete_label);
//                        complete_label.setFont(new Font("Sarif", Font.PLAIN, 20));
//                        complete_label.setBounds(600, 510, 200, 25);
//
//                        JButton complete = new JButton("Complete");
//                        complete.setFont(new Font("Sarif", Font.PLAIN, 15));
//                        prescribeMedicine.add(complete);
//                        complete.setBounds(600, 550, 200, 30);
//
//                        complete.addActionListener(ex -> {
//                            Patient_menu.Patient_menu_main();
//                            prescribeMedicine.dispose();
//                        });
//                    }
//                }
//            });
//
//            JLabel medicineUsage = new JLabel("Usage");
//            prescribeMedicine.add(medicineUsage);
//            medicineUsage.setFont(new Font("Sarif", Font.PLAIN, 20));
//            medicineUsage.setBounds(90, 510, 200, 25);
//
//            String[] Usage = {"All Types", "Heart", "Liver", "Fever", "Cold", "Allergies", "Diarrhea", "Headaches", "Stomach Ache", "Mononucleosis"};
//            JComboBox usage_Combo = new JComboBox(Usage);
//            usage_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));
//            usage_Combo.setBounds(85, 550, 200, 25);
//            prescribeMedicine.add(usage_Combo);
//
//            JLabel medicine_id_label = new JLabel("Medicine ID");
//            prescribeMedicine.add(medicine_id_label);
//            medicine_id_label.setFont(new Font("Sarif", Font.PLAIN, 20));
//            medicine_id_label.setBounds(390, 510, 200, 25);
//
//            JTextField medicine_id_Textfield = new JTextField();
//            prescribeMedicine.add(medicine_id_Textfield);
//            medicine_id_Textfield.setFont(new Font("Sarif", Font.PLAIN, 15));
//            medicine_id_Textfield.setBounds(390, 550, 120, 25);
//
//            JButton search_Doctor_btn = new JButton("SEARCH ACCORDINGLY");
//            search_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
//            prescribeMedicine.add(search_Doctor_btn);
//            search_Doctor_btn.setBounds(80, 620, 660, 50);
//
//            search_Doctor_btn.addActionListener(e -> {
//                int i1 = 0;
//                try {
//                    tab_m.setRowCount(0);
//                    String Med_id = medicine_id_Textfield.getText();
//                    String Medcine_Usage = (String) usage_Combo.getSelectedItem();
//
//                    Statement stmt = con.createStatement();
//                    ResultSet rs;
//                    if (Med_id == null || Med_id.equals("")) {
//                        if (Medcine_Usage.equals("All Types")) {
//                            rs = stmt.executeQuery("SELECT * FROM medicine ;");
//                        } else {
//                            rs = stmt.executeQuery("SELECT * FROM medicine WHERE med_usage ='" + Medcine_Usage + "' ;");
//                        }
//                    } else {
//                        rs = stmt.executeQuery("SELECT * FROM medicine WHERE  med_id ='" + Med_id + "' ;");
//                    }
//                    while (rs.next()) {
//                        int med_id1 = rs.getInt(1);
//                        String med_name1 = rs.getString(2);
//                        String med_usage1 = rs.getString(3);
//                        String med_period1 = rs.getString(4);
//                        int med_price1 = rs.getInt(5);
//                        int med_Mg = rs.getInt(6);
//                        int med_Quantity = rs.getInt(7);
//                        tab_m.addRow(new Object[]{med_id1, med_name1, med_usage1, med_period1, med_price1, med_Mg, med_Quantity});
//                        i1++;
//                    }
//                } catch (SQLException f) {
//                    System.out.println("Exception " + f);
//                }
//                if (i1 < 1) {
//                    JOptionPane.showMessageDialog(null, "No Record Found", " Error ", JOptionPane.ERROR_MESSAGE);
//                }
//            });
//        }
//        prescribeMedicine.setVisible(true);
//    }
//}