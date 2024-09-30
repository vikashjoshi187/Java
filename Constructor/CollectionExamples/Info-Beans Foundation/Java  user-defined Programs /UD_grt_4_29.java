import java.util.Scanner;

public class UD_grt_4_29 {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter fout numbers");
    int a =sc.nextInt();
    int b =sc.nextInt();
    int c =sc.nextInt();
    int d =sc.nextInt();
    String s = (a > b && a > c && a > d) ? a + " is greater"
        : (a < b && b > c && b > d) ? b + " is greater"
            : (c > a && c > b && c > d) ? c + " is greater" : d + " is greater";
    System.out.println(s);

  }

}