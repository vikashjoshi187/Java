import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class Ward_Menu {
    static JFrame farme;
    static JTable table;

    public static void Ward_Info() {
        farme = new JFrame("Ward Information");
        String[] column = {"Ward_Id", "Ward_Name", "Total_Bed", "Nurse", "Bed_Price"};
        Connection con = Sconnection.connection();
        JPanel tablepanal = new JPanel();
        tablepanal.setBounds(5, 5, 5, 5);
        farme.setContentPane(tablepanal);
        tablepanal.setLayout(null);

        farme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DefaultTableModel tab_m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        int i = 0;
        tab_m.setColumnIdentifiers(column);
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Ward");
            while (rs.next()) {
                int ward_id = rs.getInt(1);
                String ward_name = rs.getString(2);
                int total_bed = rs.getInt(3);
                int nurse_available = rs.getInt(4);
                float price = rs.getFloat(5);
                tab_m.addRow(new Object[]{ward_id, ward_name, total_bed, nurse_available, price});
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
            JScrollPane jscrollpanel = new JScrollPane(table);
            jscrollpanel.setBounds(25, 100, 800, 400);
            tablepanal.add(jscrollpanel);
            jscrollpanel.createVerticalScrollBar();
            jscrollpanel.getViewport().setViewPosition(new Point(200, 300));

            farme.add(jscrollpanel);
            farme.setSize(850, 850);
            farme.setResizable(false);
            farme.setLocationRelativeTo(null);

            JButton back_MAin_menu_btn = new JButton("<  Main Menu");
            back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            tablepanal.add(back_MAin_menu_btn);
            farme.add(back_MAin_menu_btn);
            back_MAin_menu_btn.setBounds(20, 10, 120, 50);

            back_MAin_menu_btn.addActionListener(e -> {
                Main_menu.Mainmenu_Main();
                farme.dispose();
            });
        }
        farme.setVisible(true);
    }
}
