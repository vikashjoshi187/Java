/**
 * Swing_19
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_19 {

    // private static final int EXIT_ON_CLOSE = 0;

    public static void main(String[] args) {
        JFrame Student=new JFrame("Student Result");
Student.setBounds(100,200, 500, 500);
Student.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
Student.setLayout(null);


JMenuBar menu=new JMenuBar();
// Student.add(menu);
JMenu Login = new JMenu("Login");

  // create menuitems

  // add menu items to menu


  // add menu to menu bar
  menu.add(Login);

  Student.add(menu);
  Login.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          System.out.println("Action Performed");
      }
  });


menu.setBounds(0, 0, 500, 20);
Student.setResizable(false);
Student.setVisible(true);


    }
}