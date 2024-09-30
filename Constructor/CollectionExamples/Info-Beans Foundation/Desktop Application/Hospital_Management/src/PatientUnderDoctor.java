import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientUnderDoctor {
    static JFrame PatDoc ;
    static JTable table;
    static  JTextField doc_id_get_TextField;
    static DefaultTableModel tab_m = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    static JPanel tablepan;
    static void PatientUnderDoctor(){
        int i=0;
        String name,p_gender,age,bg,number,appoint_date;


        sconnection sc=new sconnection();
        Connection con;
        try{
            con=sc.connection();
            PreparedStatement pst=con.prepareStatement(" select *from patient" +
                    "inner join doctor on patient.doctor_id=?;");
            pst.setString(1,doc_id_get_TextField.getText());
            ResultSet rs= pst.executeQuery();
            tablepan=new JPanel();
            tablepan.setBounds(5,5,5,5);
            PatDoc.setContentPane(tablepan);

            while (rs.next())
            {
                int id=rs.getInt(1);
                name = rs.getString(2);
                p_gender = rs.getString(3);
                age= rs.getString(4);
                number = rs.getString(5);
                appoint_date = rs.getString(6);
                bg = rs.getString(7);
                tab_m.addRow(new Object[] {id,name,p_gender,age,number,appoint_date,bg});
                i++;
            }

        }catch (SQLException se){

        }
        if(i<1){
            JOptionPane.showMessageDialog(null,"No Record Found"," Error ",JOptionPane.ERROR_MESSAGE);
        }


        else {
            table = new JTable(tab_m);
            table.setBounds(20,80,200,100);
            JScrollPane jsp=new JScrollPane(table);
            jsp.setBounds(25,150,800,400);
            tablepan.add(jsp);
            jsp.createVerticalScrollBar();
            jsp.getViewport().setViewPosition(new Point(200,300));

            PatDoc.add(jsp);
            PatDoc.setSize(850,850);
            PatDoc.setResizable(false);
            PatDoc.setLocationRelativeTo(null);
            PatDoc.setVisible(true);

        }

    }

    public static void patUnderDoctor(){

        PatDoc = new JFrame();
        PatDoc.setBounds(500, 200, 850, 850);
        PatDoc.setLocationRelativeTo(null);
        PatDoc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton back_MAin_menu_btn=new JButton("<  Main Menu");
        back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
        PatDoc.add(back_MAin_menu_btn);
        PatDoc.setLayout(null);
        back_MAin_menu_btn.setBounds(50,30,120,50);

        back_MAin_menu_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                Main_menu.Mainmenu_Main();
                PatDoc.dispose();
            }
        });

        JLabel Heading = new JLabel("PATIENT UNDER DOCTOR 💊");
        PatDoc.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(250, 150, 1000, 50);

        JLabel doc_id_get_Label = new JLabel("Enter Doctor I'd");
        PatDoc.add(doc_id_get_Label);
        doc_id_get_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        doc_id_get_Label.setBounds(250, 330, 180, 15);

        doc_id_get_TextField = new JTextField();
        PatDoc.add(doc_id_get_TextField);
        doc_id_get_TextField.setBounds(430, 325, 160, 30);

        JButton docSubmit =new JButton("SUBMIT");
        String doc_id=doc_id_get_TextField.getText();
//        int did = Integer.parseInt(doc_id_get_TextField.getText());

//         tablepan=new JPanel();
//        tablepan.setBounds(5,5,5,5);
//        PatDoc.setContentPane(tablepan);
//        tablepan.setLayout(null);



        PatDoc.add(docSubmit);
        docSubmit.setBounds(250,500,350,40);

        docSubmit.addActionListener(e -> {

            PatientUnderDoctor();
             Main_menu.Mainmenu_Main();
            PatDoc.dispose();
        });

        PatDoc.setVisible(true);
    }
}