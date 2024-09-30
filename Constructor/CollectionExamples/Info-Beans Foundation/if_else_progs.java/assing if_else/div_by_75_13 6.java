import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class div_by_75_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num% 75 == 0) {
            System.out.println("The number is divisible by 75");
        } else {
            System.out.println("The number is not divisible bt 75");
        }

    }
}