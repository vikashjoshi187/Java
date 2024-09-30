import java.util.Scanner;
public class prog_35 {
    /*
1
222
33333
4444444
555555555
66666666666
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {


            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print(i);
                
            }
            System.out.println();

            

            
        }

    }
}
