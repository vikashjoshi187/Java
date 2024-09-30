import java.util.Scanner;
public class prog_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num=sc.nextInt();
        int temp=97+num;
        for (int i = 97; i <= temp; i++) {
            for (int j = 97; j <= i; j++) {
                System.out.print((char)j);
            }
            System.out.println("\n");
        }
    }
}
