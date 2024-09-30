import java.util.Scanner;
public class prog_28 {
//1	2	3	4	 Hello	6	7	8	9	Hello	10	11	….

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of terms ");
        int num = sc.nextInt();
        for (int i = 1; i <=num; i++) {
            if (i % 5 == 0) {
                System.out.print(" HELLO ");
                //continue;
            }
            else{
                System.out.print(" "+i+" ");
            }
            
        }

    }
}
