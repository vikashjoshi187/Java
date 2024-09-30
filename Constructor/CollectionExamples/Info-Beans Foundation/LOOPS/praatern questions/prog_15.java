import java.util.Scanner;
public class prog_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num=sc.nextInt();
        int temp=65+num;
        for (int i = 65; i <= temp; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char)i);
            }
            System.out.println("\n");
        }
    }
}
