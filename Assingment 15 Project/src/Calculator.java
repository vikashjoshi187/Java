import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 class Calculator {
    
    public Calculator() {
        JFrame f = new JFrame("CALCULATOR");
        JLabel calc = new JLabel("CALCULATOR");
        calc.setBounds(220, 120, 250, 20);
        Font font = new Font("Times New Roman", Font.BOLD, 30);
        calc.setFont(font);
        f.add(calc);

        JLabel firstno = new JLabel("First No");
        firstno.setBounds(150, 250, 250, 20);
        firstno.setFont(font);
        f.add(firstno);

        JLabel secondno = new JLabel("Second No");
        secondno.setBounds(150, 310, 250, 20);
        secondno.setFont(font);
        f.add(secondno);

        JLabel ans = new JLabel("");
        ans.setBounds(300, 500, 500, 50);
        ans.setFont(font);
        f.add(ans);

        JTextField First = new JTextField();
        First.setBounds(320, 235, 250, 40);
        f.add(First);
        First.setFont(font);

        JTextField Second = new JTextField();
        Second.setBounds(320, 295, 250, 40);
        f.add(Second);
        Second.setFont(font);

//        JTextField Ans = new JTextField();
//        Ans.setBounds(280, 550, 150, 40);
//        f.add(Ans);
//        Ans.setFont(font);

        JButton add = new JButton("+");
        add.setBounds(160, 390, 80, 50);
        f.add(add);
        add.setFont(font);

        JButton sub = new JButton("-");
        sub.setBounds(270, 390, 80, 50);
        f.add(sub);
        sub.setFont(font);

        JButton mul = new JButton("*");
        mul.setBounds(380, 390, 80, 50);
        f.add(mul);
        mul.setFont(font);

        JButton div = new JButton("/");
        div.setBounds(490, 390, 80, 50);
        f.add(div);
        div.setFont(font);

       

        f.setSize(720, 720);
        f.setLayout(null);
        f.setVisible(true);

        JTextField Ans = new JTextField();
        Ans.setBounds(320, 450, 250, 40);
        f.add(Ans);
        Second.setFont(font);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
//                System.out.println(""+firstno.getText());
                int no1 = Integer.parseInt(First.getText());
                int no2 = Integer.parseInt(Second.getText());
                Ans.setText("Sum of two number " + (no1 + no2));
            }
        });

       sub.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                try{
                int no1 = Integer.parseInt(First.getText());
                int no2 = Integer.parseInt(Second.getText());
                Ans.setText("Sub of two number : " + (no1 - no2));
                }catch(NumberFormatException e){
                    ans.setText(""+e);
                }
            }
        });

        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(First.getText());
                int no2 = Integer.parseInt(Second.getText());
                Ans.setText("Mul of two number : " + (no1 * no2));
            }
        });

        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(First.getText());
                int no2 = Integer.parseInt(Second.getText());
                Ans.setText("Div of two number : " + (no1 / no2));
            }
        });
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
