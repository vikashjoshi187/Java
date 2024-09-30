import java.util.Scanner;

public class prog_7 {
  // Program to find out greater number among three numbers using conditional
  // operator
  int num1, num2, num3;

  void setData(int num1, int num2, int num3) {
    this.num1 = num1;
    this.num2 = num2;
    this.num3 = num3;
  }

  int Greater() {
    int s = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
    return s;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int num1 = sc.nextInt();
    System.out.println("Enter Second number");
    int num2 = sc.nextInt();
    System.out.println("Enter third number");
    int num3 = sc.nextInt();
    prog_7 obj = new prog_7();
    obj.setData(num1, num2, num3);
    int s = obj.Greater();
    System.out.println("Greater number amoung three number is");
    System.out.println(s);

  }
}
