
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.IntFunction;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
class Convertor {
    Convertor(){
        JFrame conLableerter = new JFrame();

        JLabel conLable = new JLabel("Temperature Converter");
        conLable.setBounds(50, 1, 400, 100);
        Font font = new Font("Sarif", Font.BOLD, 30);
        conLable.setFont(font);
        conLableerter.add(conLable);
        conLableerter.setResizable(false);
        
         JLabel farLable= new JLabel("Farhenite");
        farLable.setBounds(100, 100, 250, 50);
        Font font1 = new Font("Sarif", Font.BOLD, 20);
        farLable.setFont(font1);
       conLableerter.add(farLable);

        JTextField FarTxt = new JTextField();
        FarTxt.setBounds(200, 110, 150, 30);
       conLableerter.add(FarTxt);
        FarTxt.setFont(font1);
        
         JLabel cel = new JLabel(" To Celsius");
        cel.setBounds(100, 200, 250, 50);
        cel.setFont(font1);
        conLableerter.add(cel);
        JLabel cel1 = new JLabel();
        cel1.setBounds(200, 200, 250, 50);
        cel1.setFont(font1);
        conLableerter.add(cel1);
        
        JButton conLableert = new JButton("Convert");
        conLableert.setBounds(150, 300, 150, 40);
        conLableerter.add(conLableert);
        conLableert.setFont(font);

        conLableert.addActionListener(new ActionListener() {
      
            public void actionPerformed(ActionEvent ae) {
                if(!FarTxt.getText().equals("")|| !FarTxt.getText().equals(null)){
              double f = Double.parseDouble(FarTxt.getText());
              double c = (double)((f-32)*5/9);
              cel1.setText(String.valueOf(c));
            }
            else{

              FarTxt.setText("Fiill the field");
            }
          
    }});

        
        conLableerter.setSize(500, 500);
       conLableerter.setLayout(null);
       conLableerter.setVisible(true);
       conLableerter.setLocation(450, 200);
       conLableerter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
     new Convertor();
}
}
