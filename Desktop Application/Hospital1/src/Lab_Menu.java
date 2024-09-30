import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab_Menu {
    static JFrame lab_show_frame;
    static JTable table;

    public static void lab_Info() {
        lab_show_frame = new JFrame("Lab Information");
        String[] column = {"Test_Id", "Test_Name", "Test_Price"};
        Connection con = Sconnection.connection();
        JPanel tablepanal = new JPanel();
        tablepanal.setBounds(5, 5, 5, 5);
        lab_show_frame.setContentPane(tablepanal);
        tablepanal.setLayout(null);

        lab_show_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            ResultSet rs = stmt.executeQuery("SELECT * FROM lab");
            while (rs.next()) {
                int test_id = rs.getInt(1);
                String test_name = rs.getString(2);
                float test_price = rs.getFloat(3);
                tab_m.addRow(new Object[]{test_id, test_name, test_price});
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

            lab_show_frame.add(jscrollpanel);
            lab_show_frame.setSize(850, 850);
            lab_show_frame.setResizable(false);
            lab_show_frame.setLocationRelativeTo(null);

            JButton back_MAin_menu_btn = new JButton("<  Main Menu");
            back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            tablepanal.add(back_MAin_menu_btn);
            lab_show_frame.add(back_MAin_menu_btn);
            back_MAin_menu_btn.setBounds(20, 10, 120, 50);

            back_MAin_menu_btn.addActionListener(e -> {
                Main_menu.Mainmenu_Main();
                lab_show_frame.dispose();
            });
            lab_show_frame.setVisible(true);
        }
    }
}
