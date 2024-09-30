import javax.swing.*;
import java.awt.*;

class Prog14 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Prog14 obj = new Prog14();
        JFrame farme = new JFrame("Login-Page");
        farme.setResizable(false);
        farme.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        farme.setSize(550, 550);
        farme.setLocationRelativeTo(null);

        JLabel name = new JLabel("Student Information ");
        farme.add(name);
        name.setFont(new Font("Sarif", Font.PLAIN, 18));
        farme.setVisible(true);
        for (int i = 2;;) {
            if (i % 2 == 0) {
                name.setBounds(20, 300, 200, 50);
                i = 5;
                Thread.sleep(1000);
            } else {
                synchronized (obj) {
                    name.setBounds(300, 300, 200, 50);
                    Thread.sleep(1000);
                }
                i = 2;
            }
        }
    }
}
.