import java.util.Scanner;
public class prog_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num=sc.nextInt();
        for (int i = num; i >=1; i--) {
            for (int j = num; j >=i; j--) {
                System.out.print(j);

            }
            System.out.println("\n");
        }
    }
}
