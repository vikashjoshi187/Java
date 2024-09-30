import java.util.Scanner;

public class prog_19 {
    //1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float t, c = 0;

        System.out.println("enter number of terms you want");
        t = sc.nextFloat();

        for (int i = 1; i <=t; i++) {

            c = c +(1.0f/i);
        }
        System.out.println("The sum of series is " + c);
    }

}
