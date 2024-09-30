import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Medicine_Show {
    static JTable table;
    static Connection con= null;
    static JFrame medicine_show;
    public static void show_medicine(){
        int med_id;
        String med_name;
        String med_usage;
        String med_period;
        int med_price;
        String med_mg;
        int med_quantity;

        String[] clm = {"ID","Name","Usage","Period","Price","Mg","Quantity"};
        try {
            con = sconnection.connection();
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
        medicine_show = new JFrame("Medicine's Information");
        JPanel table_pane = new JPanel();
        table_pane.setBounds(5,5,5,5);
        medicine_show.setContentPane(table_pane);
        table_pane.setLayout(null);

        JLabel d_detail_tab=new JLabel();
        d_detail_tab.setBounds(50,20,80,20);
        medicine_show.add(d_detail_tab);
        medicine_show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DefaultTableModel tab_m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        int i=0;
        tab_m.setColumnIdentifiers(clm);
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM medicine");
            while (rs.next()) {
                med_id = rs.getInt(1);
                med_name = rs.getString(2);
                med_usage = rs.getString(3);
                med_period = rs.getString(4);
                med_price = rs.getInt(5);
                med_mg = rs.getString(6);
                med_quantity = rs.getInt(7);
                tab_m.addRow(new Object[] {med_id,med_name,med_usage,med_period,med_price,med_mg,med_quantity});
                i++;
            }
        }
        catch(SQLException e){
            System.out.println("Exception " +e);
        }
        if(i<1){
            JOptionPane.showMessageDialog(null,"No Record Found"," Error ",JOptionPane.ERROR_MESSAGE);
        } else {
            table = new JTable(tab_m);
            table.setBounds(20,80,200,100);
            JScrollPane jsp=new JScrollPane(table);
            jsp.setBounds(25,100,800,380);
            table_pane.add(jsp);
            jsp.createVerticalScrollBar();
            jsp.getViewport().setViewPosition(new Point(200,300));

            medicine_show.add(jsp);
            medicine_show.setSize(850,850);
            medicine_show.setResizable(false);
            medicine_show.setLocationRelativeTo(null);
            medicine_show.setVisible(true);
            JButton back_MAin_menu_btn=new JButton("<  Main Menu");
            back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            table_pane.add(back_MAin_menu_btn);
            medicine_show.add(back_MAin_menu_btn);
            back_MAin_menu_btn.setBounds(20,10,120,50);

            back_MAin_menu_btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Main_menu.Mainmenu_Main();
                    medicine_show.dispose();
                }
            });


            JButton delete_Doctor_btn=new JButton("DELETE SELECTED ROW");
            delete_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            medicine_show.add(delete_Doctor_btn);
            delete_Doctor_btn.setBounds(80, 520, 660, 50);


            String Usage[] = {"All Types","Heart", "Liver","Fever","Cold","Allergies","Diarrhea","Headaches","Stomach Ache","Mononucleosis"};
            JComboBox usage_Combo = new JComboBox(Usage);
            usage_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));

            JLabel medicineUsage = new JLabel("Usage");
            medicine_show.add(medicineUsage);
            medicineUsage.setFont(new Font("Sarif", Font.PLAIN, 20));
            medicineUsage.setBounds(90, 600, 200, 25);
            usage_Combo.setBounds(85, 650, 200, 25);
            medicine_show.add(usage_Combo);

            JLabel medicine_id_label = new JLabel("Medicine ID");
            medicine_show.add(medicine_id_label);
            medicine_id_label.setFont(new Font("Sarif", Font.PLAIN, 20));
            medicine_id_label.setBounds(390, 600, 200, 25);


            JTextField medicine_id_Textfield=new JTextField();
            medicine_show.add(medicine_id_Textfield);
            medicine_id_Textfield.setFont(new Font("Sarif", Font.PLAIN, 15));
            medicine_id_Textfield.setBounds(390, 650, 120, 25);


            JButton search_Doctor_btn=new JButton("SEARCH ACCORDINGLY");
            search_Doctor_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
            medicine_show.add(search_Doctor_btn);
            search_Doctor_btn.setBounds(80, 720, 660, 50);


          search_Doctor_btn.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  int i=0;
                      try{
                          tab_m.setRowCount(0);
                          int id;
                          String name;
                          String p_gender;
                          String age;
                          String number;
                          String bg;
                          String appoint_date;

                          String Med_id= medicine_id_Textfield.getText();
                          String Medcine_Usage=(String) usage_Combo.getSelectedItem();


                          Statement stmt = con.createStatement();
                          ResultSet rs=null;

                          if(Med_id.equals(null) || Med_id.equals("")) {

                              if (Medcine_Usage.equals("All Types")) {
                                  rs = stmt.executeQuery("SELECT * FROM Medicine ;");
                              } else if (!Medcine_Usage.equals("All Types")) {
                                  rs = stmt.executeQuery("SELECT * FROM Medicine WHERE med_usage ='" + Medcine_Usage + "' ;");

                              }
                          }

                          else {
                              rs = stmt.executeQuery("SELECT * FROM Medicine WHERE  med_id ='" + Med_id + "' ;");

                          }


                          ResultSetMetaData rsmd=rs.getMetaData();
                          int col_count=rsmd.getColumnCount();
                          int row=rs.getRow();
                          String clm_name[]= new String[col_count];

                          while (rs.next()) {  // Position the cursor
                              int med_id = rs.getInt(1);
                              String med_name = rs.getString(2);
                              String med_usage = rs.getString(3);
                              String med_period = rs.getString(4);
                              int med_price = rs.getInt(5);
                              int med_Mg = rs.getInt(6);
                              int med_Quantity = rs.getInt(7);
                              tab_m.addRow(new Object[] {med_id,med_name,med_usage,med_period,med_price,med_Mg,med_Quantity});
                              i++;
                          }
                      }
                      catch(SQLException f){
                          System.out.println("Exception " +f);
                      }
                      if(i<1){
                          JOptionPane.showMessageDialog(null,"No Record Found"," Error ",JOptionPane.ERROR_MESSAGE);
                      }

                      else {
                          medicine_show.add(jsp);
                          medicine_show.setSize(850,850);
                          medicine_show.setResizable(false);
                          medicine_show.setLocationRelativeTo(null);
                          medicine_show.setVisible(true);
                      }
              }
          });

        }
    }
}
