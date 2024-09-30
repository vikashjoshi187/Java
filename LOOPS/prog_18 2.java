import java.util.Scanner;
public class prog_18 {
    //18)1	2	2	4	8	32	…… n terms
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int t, a = 1, b = 2, c ;
        System.out.println("enter number of terms you want");
        t = sc.nextInt();

        for (int i = 1; i <= t; i++) {

            c = a * b;
            System.out.println("Term "+i+" is "+c);
            a = b;
            b = c;

        }

    }

}
