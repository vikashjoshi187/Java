import java.util.Scanner;

public class UD_even_odd_23 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");

    int a = sc.nextInt();
    String s = (a % 2 == 0) ? a + " is even number" : a + " is odd number";
    System.out.println(s);
  }
}
