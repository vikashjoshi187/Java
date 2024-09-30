import java.util.Scanner;

public class prog_21 {
  // 1+11+111+1111+11111+….
  int term;

  void setData(int term) {
    this.term = term;
  }

  void series() {
    int a = 1;
    int sum = 0;
    // System.out.println(a);
    for (int i = 1; i < term; i++) {
      a = (a * 10) + 1;
      sum = sum + a;
    }
    System.out.println(sum + 1);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter term");
    int term = sc.nextInt();
    prog_21 obj = new prog_21();
    obj.setData(term);
    obj.series();
  }
}
