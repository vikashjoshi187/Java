import java.util.Scanner;

public class leap_yr_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int yr = sc.nextInt();
        if (yr % 4 == 0) {
            if (yr % 100 != 0 || yr % 400 == 0) {

                System.out.println(yr+" is a leap year");

            }

        }

        else {
            System.out.println(yr+" is not a leap year");
        }
    }
}