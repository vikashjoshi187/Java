import java.util.Scanner;
public class prog_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
        
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println("\n");
        }
    }
}
