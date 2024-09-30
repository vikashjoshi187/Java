import java.util.Scanner;
import java.lang.Math;

public class prog_60 {
    //WAP to print Square, Cube and Square Root of all numbers from 1 to N
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2;
        System.out.println("Enter a number 1");
        num1 = sc.nextFloat();
        System.out.println("Enter a number 2");
        num2 = sc.nextFloat();
        for (float i = num1; i < num2; i++) {
            System.out.println("The square of " + i + " is " + i * i );
            System.out.println("The cube of " + i + " is " + i * i * i);
            System.out.printf("\nThe Square root of " + i + " is %.2f" ,Math.sqrt(i));
            System.out.println();
        }

    }
}
