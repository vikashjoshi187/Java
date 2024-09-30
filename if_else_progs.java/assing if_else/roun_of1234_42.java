import java.util.Scanner;

public class roun_of1234_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, r, temp, rem;
        System.out.println("Enter a two digit num");
        num = sc.nextInt();
        if (num >= 10 && num <= 9999) {
            r = num % 10;
            if (r <= 4) {
                num = num - r;
                System.out.println("The round of value is " + num);

            } else {
                r = num % 10;
                temp = 10 - r;
                num = num + temp;

                System.out.println("The round of value is " + num);
            }
        } else if (num <= 4) {
            num = num - num;
            System.out.println("The round of value is " + num);

        } else if (num <= 9) {
            rem = 10 - num;
            num = num + rem;
            System.out.println("The round of value is " + num);

        }

        else if (num > 100) {
            System.out.println("The entered number is less then 1");
        } else {
            System.out.println("The entered number is greater then then 9999");
        }

    }
}
