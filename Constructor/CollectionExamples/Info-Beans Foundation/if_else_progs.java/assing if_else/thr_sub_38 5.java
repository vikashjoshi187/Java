import java.util.Scanner;

public class thr_sub_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1, s2, s3, avg;
        System.out.println("Enter the marks of subject 1 ");
        s1 = sc.nextInt();
        System.out.println("Enter the marks of subject 2 ");
        s2 = sc.nextInt();
        System.out.println("Enter the marks of subject 3 ");
        s3 = sc.nextInt();
        avg = (s1 + s2 + s3) / 3;
        if (s1 <= 100 && s2 <= 100 && s3 <= 100) {
            if (s1 > 75 && s2 > 75 && s3 > 75 && avg > 80) {
                System.out.println("CONGRATULAION!! YOU ARE PASSED");

            } else {
                System.out.println("SORRY!! YOU ARE FAILED  ");
            }

        } else {
            System.out.println("ERROR!! Enter the marks out of 100");
        }

    }
}
