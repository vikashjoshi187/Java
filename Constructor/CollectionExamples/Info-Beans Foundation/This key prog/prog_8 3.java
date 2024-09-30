import java.util.Scanner;

public class prog_8 {
  // Program to check whether entered year is a leap year or not
  int year;

  void setData(int year) {
    this.year = year;
  }

  String leapYear() {
    String s = (year % 4 == 0 && year % 100 != 0) ? year + " is leap year"
        : (year % 400 == 0) ? year + " is leap year" : year + " is not leap year";
    // System.out.println(s);
    return s;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter year");
    int year = sc.nextInt();
    prog_8 obj = new prog_8();
    obj.setData(year);
    String s = obj.leapYear();
    System.out.println(s);

  }
}
