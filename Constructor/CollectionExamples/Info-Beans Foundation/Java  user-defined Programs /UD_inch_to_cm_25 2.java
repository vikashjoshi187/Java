import java.util.Scanner;

class UD_inch_to_cm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value in inch ");

        float i = sc.nextInt();

        float cm = i * 2.54f;
        System.out.println("the height in cm will be " + cm);

    }
}
