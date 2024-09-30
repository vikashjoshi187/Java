import java.util.Scanner;

public class revrs_5_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mnum, num1, num2, num3, num4, num5;
        System.out.println("Enter a five digit number");
        mnum = sc.nextInt();
        if (mnum >= 10000 && mnum <= 99999) {
            // Extracting individual numbers
            num1 = mnum / 10000;
            mnum = mnum % 10000;
            num2 = mnum / 1000;
            mnum = mnum % 1000;
            num3 = mnum / 100;
            mnum = mnum % 100;
            num4 = mnum / 10;
            mnum = mnum % 10;
            num5 = mnum;
            // Changing the numbers
            num5 = num5 * 10000;
            num4 = num4 * 1000;
            num3 = num3 * 100;
            num2 = num2 * 10;
            mnum = num5 + num4 + num3 + num2 + num1;
            System.out.println("The reversed num is " + mnum);

        } else if (mnum < 10000) {
            System.out.println(" TRY AGAIN!! The number is less then five digit");
        } else {
            System.out.println("TRY AGAIN!! The number is grater then five digit");
        }

    }
}
