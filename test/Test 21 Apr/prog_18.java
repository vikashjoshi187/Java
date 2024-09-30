import java.util.Scanner;
public class prog_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Rows");

        int row=sc.nextInt();

        int sum=1;

        for (int i = 0; i < row; i++) {

            sum=sum+i;
            for (int j = 0; j < sum; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
