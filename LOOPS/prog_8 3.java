import java.util.Scanner;

public class prog_8 {
    //PROGRAM TO PRINT FOBPNACII SERIES 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, a = -1, b = 1, c = 0;
        System.out.println("enter number of terms you want");
        t = sc.nextInt();

        for (int i = 1; i <= t; i++) {

            c = a + b;
            System.out.println("Term "+i+" is "+c);
            a = b;
            b = c;

        }

    }

}
