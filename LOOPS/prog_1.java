import java.util.Scanner;
public class prog_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println("this is statement "+i);
            
        }
    }
}
