import java.util.Scanner;

public class od_evn_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mnum, num1, num2, num3, num4, num5, evn = 0, od = 0;
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
            // Checking even or od number
            if (num1 % 2 == 0) {
                System.out.println(num1 + " is even number");
                evn = evn + 1;
            } else {
                System.out.println(num1 + " is odd number ");
                od = od + 1;
            }

            if (num2 % 2 == 0) {
                System.out.println(num2 + " is even number");
                evn = evn + 1;
            } else {
                System.out.println(num2 + " is odd number ");
                od = od + 1;
            }

            if (num3 % 2 == 0) {
                System.out.println(num3 + " is even number");
                evn = evn + 1;
            } else {
                System.out.println(num3 + " is odd number ");
                od = od + 1;
            }
           if (num4 % 2 == 0) {
                System.out.println(num4 + " is even number");
                evn = evn + 1;
            } else {
                System.out.println(num4 + " is odd number ");
                od = od + 1;
            }
            if (num5 % 2 == 0) {
                System.out.println(num5 + " is even number");
                evn = evn + 1;
            } else {
                System.out.println(num5 + " is odd number ");
                od = od + 1;
            }
            System.out.println("The number od od number is " + od);
            System.out.println("The nuber of even number is " + evn);

        } else if (mnum < 10000) {
            System.out.println(" TRY AGAIN!! The number is less then five digit");
        } else {
            System.out.println("TRY AGAIN!! The number is grater then five digit");
        }

    }
}
