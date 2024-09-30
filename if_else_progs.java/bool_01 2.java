import com.apple.laf.AquaMenuPainter;

import java.util.Scanner;

public class bool_01 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a ");
        a = sc.nextInt();
        System.out.println("Enter the value od b");
        b=sc.nextInt();
        boolean bool = (a < b);
        System.out.println(bool);
    }
}