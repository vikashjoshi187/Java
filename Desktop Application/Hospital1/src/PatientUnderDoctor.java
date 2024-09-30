import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class PatientUnderDoctor {
    static JFrame PatDoc;
    static JTable table;
    static JTextField doc_id_get_TextField;
    static int i = 0;
    static JScrollPane jsp;
    static String name, p_gender, age, bg, number, appoint_date, doc_id;
    static String[] clm = {"ID", "Name", "Gender", "Age", "Contact", "Appointment Date", "Blood Group"};

    static DefaultTableModel tab_m = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    static JPanel tablepan;
    static JComboBox a_d;

    public static void patUnderDoctor() {

        PatDoc = new JFrame();
        PatDoc.setBounds(500, 200, 850, 850);
        PatDoc.setLocationRelativeTo(null);
        PatDoc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        tablepan = new JPanel();
        table = new JTable(tab_m);
        tablepan.setBounds(20, 100, 800, 300);
        PatDoc.setContentPane(tablepan);
        tablepan.setLayout(null);
        tab_m.setColumnIdentifiers(clm);

        table.setBounds(20, 100, 800, 300);
        jsp = new JScrollPane(table);
        jsp.setBounds(25, 100, 800, 300);
        tablepan.add(jsp);
        jsp.createVerticalScrollBar();
        jsp.getViewport().setViewPosition(new Point(100, 300));
        PatDoc.setLocationRelativeTo(null);
        PatDoc.setVisible(true);

        JLabel Heading = new JLabel("PATIENT UNDER DOCTOR ");
        PatDoc.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(250, 30, 500, 50);

        JLabel doc_id_get_Label = new JLabel("Enter Doctor I'd");
        PatDoc.add(doc_id_get_Label);
        doc_id_get_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        doc_id_get_Label.setBounds(110, 450, 180, 15);

        doc_id_get_TextField = new JTextField();
        doc_id_get_TextField.setBounds(290, 450, 160, 30);
        PatDoc.add(doc_id_get_TextField);

        JLabel status = new JLabel("Status");
        PatDoc.add(status);
        status.setFont(new Font("Sarif", Font.PLAIN, 20));
        status.setBounds(500, 450, 200, 25);

        String[] act_deact = {"All Types", "Active", "Deactivate"};
        a_d = new JComboBox(act_deact);
        a_d.setFont(new Font("Sarif", Font.PLAIN, 15));
        PatDoc.add(a_d);
        a_d.setBounds(600, 445, 150, 30);

        JButton back_MAin_menu_btn = new JButton("<  Doctor Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        tablepan.add(back_MAin_menu_btn);
        PatDoc.add(back_MAin_menu_btn);
        back_MAin_menu_btn.setBounds(20, 10, 150, 50);

        back_MAin_menu_btn.addActionListener(e -> {
            Doctor_Menu.Doctor_Menu_main();

            PatDoc.dispose();
        });

        JButton docSubmit = new JButton("SUBMIT");
        PatDoc.add(docSubmit);
        docSubmit.setBounds(250, 525, 350, 40);

        docSubmit.addActionListener(e -> {
            String status1 = String.valueOf(a_d.getSelectedItem());
            doc_id = doc_id_get_TextField.getText();
            if (doc_id.equals("")) {
                JOptionPane.showMessageDialog(null, "Please First Enter Your ID ", " Error ", JOptionPane.ERROR_MESSAGE);
            } else {
                tab_m.setRowCount(0);
                System.out.println(doc_id);
                Connection con;
                try {
                    con = Sconnection.connection();
                    Statement stmt = con.createStatement();
                    String doc_id = doc_id_get_TextField.getText();
                    ResultSet rs = null;
                    if (status1.equals("Active") || status1.equals("Deactivate")) {
                        rs = stmt.executeQuery("select * from patient where doctor_id = '" + doc_id + "' AND status = '"+status1+"';");
                    } else  {
                        rs = stmt.executeQuery("select * from patient where doctor_id = '" + doc_id + "';");
                    }

                    while (rs.next()) {
                        i++;
                        int id = rs.getInt(1);
                        name = rs.getString(2);
                        p_gender = rs.getString(3);
                        age = rs.getString(4);
                        number = rs.getString(5);
                        appoint_date = rs.getString(6);
                        bg = rs.getString(7);
                        tab_m.addRow(new Object[]{id, name, p_gender, age, number, appoint_date, bg});
                    }
                } catch (SQLException se) {
                    System.out.println("Exception " + se);
                }
                if (i < 1) {
                    System.out.println(doc_id);
                    JOptionPane.showMessageDialog(null, "Currently you don't have patient", " Error ", JOptionPane.ERROR_MESSAGE);
                } else {
                    PatDoc.add(jsp);
                    PatDoc.add(docSubmit);
                    PatDoc.setSize(850, 850);
                    PatDoc.setResizable(false);
                    PatDoc.setVisible(true);
                    PatDoc.validate();
                }
            }
        });

        JButton backSubmit = new JButton("BACK MENU");
        PatDoc.add(backSubmit);
        backSubmit.setBounds(250, 600, 350, 40);

        backSubmit.addActionListener(e -> {
            Doctor_Menu.Doctor_Menu_main();
            PatDoc.dispose();
        });
        PatDoc.setVisible(true);
    }
}
