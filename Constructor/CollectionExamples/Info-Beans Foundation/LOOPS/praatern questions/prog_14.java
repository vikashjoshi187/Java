import java.util.Scanner;
public class prog_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num=sc.nextInt();
        int temp=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp+" ");
                temp++;
            }
            System.out.print("\n");
        }
    }
}
