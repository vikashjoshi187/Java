import java.util.Scanner;
public class prog_11 {
    //progtam to ptint n odd numbers 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();
        for (int i = 1; i <= num*2;i=i+2) {
            System.out.println(i);
            
        }
    }
}
