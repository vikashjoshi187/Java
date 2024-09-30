import java.util.Scanner;
public class prog_10 {
    //progtam to ptint  even numbers till n 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();
        for (int i = 2; i <= num;i=i+2) {
            System.out.println(i);
        }
    }
}
