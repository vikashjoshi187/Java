import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Medicine_Info  {
    static JFrame medicine_Info;
     static void Medicine_main() {
         medicine_Info = new JFrame("MEDICINE INFORMATION");
        medicine_Info.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        medicine_Info.setVisible(true);
        Container c = medicine_Info.getContentPane();

        medicine_Info.setResizable(false);

        medicine_Info.setLayout(null);
        medicine_Info.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        medicine_Info.setBounds(500, 200, 850, 850);
        medicine_Info.setLocationRelativeTo(null); // center frame1 on screen




         JButton back_MAin_menu_btn=new JButton("<  Main Menu");
         back_MAin_menu_btn.setFont(new Font("Sarif", Font.PLAIN, 15));
         medicine_Info.add(back_MAin_menu_btn);
         back_MAin_menu_btn.setBounds(50,30,120,50);

         back_MAin_menu_btn.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e) {

                 Main_menu.Mainmenu_Main();
                 medicine_Info.dispose();
             }
         });

        JLabel Heading = new JLabel("MEDICINE INFORMATION 💊");
        medicine_Info.add(Heading);
        Heading.setFont(new Font("Sarif", Font.PLAIN, 33));
        Heading.setBounds(200, 150, 1000, 50);


        JLabel medicine_Name_Label = new JLabel("Medicine Name");
        medicine_Info.add(medicine_Name_Label);
        medicine_Name_Label.setFont(new Font("Sarif", Font.PLAIN, 20));
        medicine_Name_Label.setBounds(200, 250, 200, 15);


        JTextField medicine_Name_TextField = new JTextField();
        medicine_Info.add(medicine_Name_TextField);
        medicine_Name_TextField.setBounds(400, 245, 200, 30);


        JLabel medicinePricelabel = new JLabel("Medicine Price");
        medicine_Info.add(medicinePricelabel);
        medicinePricelabel.setFont(new Font("Sarif", Font.PLAIN, 20));
        medicinePricelabel.setBounds(200, 320, 200, 15);


        JTextField medicine_price_TextField = new JTextField();
        medicine_Info.add(medicine_price_TextField);
        medicine_price_TextField.setBounds(400, 315, 200, 30);

        JLabel medicineQunatitylabel = new JLabel("Medicine Quantity");
        medicine_Info.add(medicineQunatitylabel);
        medicineQunatitylabel.setFont(new Font("Sarif", Font.PLAIN, 20));
        medicineQunatitylabel.setBounds(200, 395, 200, 25);

        JTextField medicineQuantityTextField = new JTextField();
        medicine_Info.add(medicineQuantityTextField);
        medicineQuantityTextField.setBounds(400, 390, 200, 30);


        String Usage[] = {"Heart", "Liver","Fever","Cold","Allergies","Diarrhea","Headaches","Stomach Ache","Mononucleosis"};
        JComboBox usage_Combo = new JComboBox(Usage);
        usage_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));

        JLabel medicineUsage = new JLabel("Usage");
        medicine_Info.add(medicineUsage);
        medicineUsage.setFont(new Font("Sarif", Font.PLAIN, 20));
        medicineUsage.setBounds(200, 480, 100, 25);
        usage_Combo.setBounds(400, 485, 200, 30);
        medicine_Info.add(usage_Combo);
        c.add(usage_Combo);


        String Expiry_Period[] = {"1 Month", "2 Month", "3 Month", "4 Month", "5 Month", "6 Month", "7 Month", "8 Month", "9 Month", "10 Month", "11 Month", "12 Month", "1.5 Year", "2 Year", "2.5 Year", "3 Year","Above 3 years"};
        JComboBox Expiruy_Combo = new JComboBox(Expiry_Period);
        usage_Combo.setFont(new Font("Sarif", Font.PLAIN, 15));

        JLabel Expirylabel = new JLabel("Expiry Period");
        medicine_Info.add(Expirylabel);
        Expirylabel.setFont(new Font("Sarif", Font.PLAIN, 20));
        Expirylabel.setBounds(200, 555, 150, 25);
        Expiruy_Combo.setBounds(400, 554, 200, 30);
        medicine_Info.add(Expiruy_Combo);
        c.add(Expiruy_Combo);

        JButton patientInfobtn = new JButton("SUBMIT");
        medicine_Info.add(patientInfobtn);
        patientInfobtn.setBounds(200, 650, 405, 50);

       patientInfobtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {


                if(Vliad_info_Check.isValidmedicinePrice(medicine_price_TextField.getText()) && Vliad_info_Check.isValidmedicinePrice(medicineQuantityTextField.getText()))
                {
                    try {
                        String url = "jdbc:mysql://localhost:3306/HMS";
                        String username = "root";
                        String password = "rootroot";
                        Connection con = DriverManager.getConnection(url, username, password);
                        String query = "insert into Medicine (med_name,med_usage,med_eperiod,med_price,med_mg,med_quantity) values (?,?,?,?,?,?)";
                        PreparedStatement pstatement = con.prepareStatement(query);
                        pstatement.setString(1, medicine_Name_TextField.getText());
                        pstatement.setString(2, "" + usage_Combo.getSelectedItem());
                        pstatement.setString(3, "" + Expiruy_Combo.getSelectedItem());
                        pstatement.setInt(4, Integer.parseInt(medicine_price_TextField.getText()));
                        pstatement.setInt(5, 200);
                        pstatement.setInt(6, Integer.parseInt(medicineQuantityTextField.getText()));
                        pstatement.executeUpdate();
                        con.close();
                    }
                    catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    Main_menu.Mainmenu_Main();
                    medicine_Info.dispose();
                }
            }
        });
    }



}
