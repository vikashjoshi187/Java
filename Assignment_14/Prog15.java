/*15. Design a AWT/SWING frame as shown below in which when user clicks on button the number of times user click should be displayed on label. */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Prog15 extends JFrame {
    static JButton btn;
    static int click_count = 0;

    public static void main(String[] args) {

        JFrame farme = new JFrame("Login-Page");
        farme.setResizable(false);
        farme.setDefaultCloseOperation(EXIT_ON_CLOSE);
        farme.setLayout(null);

        farme.setSize(550, 550);
        farme.setLocationRelativeTo(null);
        farme.setVisible(true);

        btn = new JButton("Click");
        btn.setBounds(150, 200, 150, 30);
        farme.add(btn);

        JLabel count = new JLabel("" + click_count);
        btn.addActionListener(e -> {
            click_count++;
            count.setBounds(50, 300, 200, 30);
            farme.add(count);
            farme.setVisible(true);
            btn.setText("Click count: " + click_count);
            count.setText("Click count: " + click_count);
        });
    }
}
