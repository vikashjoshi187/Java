import java.util.Scanner;
public class PROG_13 {
    //program to print revere numbers 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();
        for (int i = num; i > 0; i--) {
            System.out.println(i);
        
        }
    }
}
