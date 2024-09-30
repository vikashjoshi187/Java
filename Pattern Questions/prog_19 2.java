import java.util.Scanner;
public class prog_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (i==1 || j==i || i==num || j==1) {
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("\n");
        }
    }
}
