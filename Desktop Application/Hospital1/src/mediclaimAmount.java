import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class mediclaimAmount {
    public static void mediclmMain(String p_Id) {
        JFrame medClaimfrm = new JFrame("MEDICLAIM");
        medClaimfrm.setLayout(null);
        medClaimfrm.setBounds(500, 500, 350, 350);
        medClaimfrm.setLocationRelativeTo(null);
        medClaimfrm.setResizable(false);
        medClaimfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel mediClmLable = new JLabel("Enter Mediclaim Amount");
        mediClmLable.setFont(new Font("Sarif", Font.PLAIN, 15));
        mediClmLable.setBounds(80, 70, 200, 20);
        medClaimfrm.add(mediClmLable);

        JTextField mediclmtxtField = new JTextField();
        medClaimfrm.add(mediclmtxtField);
        mediclmtxtField.setBounds(80, 120, 180, 20);

        JButton submitAmt = new JButton("ENTER");
        submitAmt.setBounds(80, 170, 180, 20);
        medClaimfrm.add(submitAmt);

        JButton cancleBtn = new JButton("CANCEL");
        cancleBtn.setBounds(80, 210, 180, 20);
        medClaimfrm.add(cancleBtn);
        medClaimfrm.setVisible(true);

        submitAmt.addActionListener(e -> {
            String mediamt = mediclmtxtField.getText();

            if (Vliad_info_Check.isValidmediAmt(mediamt)) {//Condition For Valid Amount
                Connection connect = Sconnection.connection();
                try {
                    PreparedStatement st = connect.prepareStatement("UPDATE patient SET mediclaim =" + mediamt + " WHERE patient_id=" + p_Id + ";");
                    st.execute();
                    System.out.println("DATA Inserted Sucessfully");
                    medClaimfrm.dispose();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }//Condition For Valid Amount Ends
            else {
                JOptionPane.showMessageDialog(null, "Please Enter Valid Amount.", "Invalid Amount", JOptionPane.ERROR_MESSAGE);
            }
        });

        cancleBtn.addActionListener(e -> medClaimfrm.dispose());
    }
}
