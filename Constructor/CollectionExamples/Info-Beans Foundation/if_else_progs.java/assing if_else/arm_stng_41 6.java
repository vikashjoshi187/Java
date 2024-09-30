import java.util.Scanner;
import java.lang.Math;

public class arm_stng_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mnum, num1, num2, num3, temp;
        System.out.println("Enter a three digit number");
        mnum = sc.nextInt();
        temp = mnum;
        if (mnum >= 100 && mnum <= 999) {
            num1 = mnum / 100;
            mnum = mnum % 100;
            num2 = mnum / 10;
            mnum = mnum % 10;
            num3 = mnum;

            if (temp == Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3)) {
                System.out.println(temp + " is a arm strong ");

            } else {
                System.out.println(temp + " is not a arm strong");
            }

        } else if (mnum > 999) {
            System.out.println(mnum + " is greater then three digit num");
        } else {
            System.out.println(mnum + " is less then three digit num");
        }

    }

}
