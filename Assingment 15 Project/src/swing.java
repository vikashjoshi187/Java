import javax.swing.*;
import java.awt.*;

public class swing extends Thread{
    public static void main(String[] args) {
        JFrame farme = new JFrame("Login-Page");
        farme.setResizable(false);
        farme.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        farme.setSize(550,550);
        farme.setLocationRelativeTo(null);
        


        JLabel name = new JLabel("Student Information ");
        farme.add(name);
        name.setFont(new Font("Sarif", Font.PLAIN, 23));
        // name.setBounds(100, 50, 100, 50);
        farme.setVisible(true);

        Thread th=Thread.currentThread();

        while(true){

            try {
                name.setBounds(100, 50, 300, 50);
                th.sleep(1000);
                farme.validate();
            } 
            
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            try {
                th.sleep(1000);
                name.setBounds(600, 300, 300, 50);
                farme.validate();
            } 
            
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


         


            


        }



    }

}