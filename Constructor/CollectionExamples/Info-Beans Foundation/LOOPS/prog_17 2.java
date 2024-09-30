import java.util.Scanner;
public class prog_17 {
   // program to print 1,2,4,7,11,16
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, a = 1, c ;

        System.out.println("enter number of terms you want");
        t = sc.nextInt();

        for (int i = 0; i <= t; i++) {

          c=a+i;
          System.out.println(c);
          a=c;

        }

    }

}
