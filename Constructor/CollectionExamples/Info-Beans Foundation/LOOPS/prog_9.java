import java.util.Scanner;
public class prog_9 {
    //progtam to ptint n even numbers 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();
        for (int i = 2; i <= num*2;i=i+2) {
            System.out.println(i);
            
        }
    }
}
