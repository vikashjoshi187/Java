import java.util.Scanner;

public class prog_22 {
  // )9 99 999 9999 99999 …….
  int term;

  void setData(int term) {
    this.term = term;
  }

  void series() {
    int a = 9;
    System.out.print(a);
    for (int i = 0; i < term; i++) {
      a = (a * 10) + 9;
      System.out.print("\t" + a);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter term");
    int term = sc.nextInt();
    prog_22 obj = new prog_22();
    obj.setData(term);
    obj.series();
  }
}
