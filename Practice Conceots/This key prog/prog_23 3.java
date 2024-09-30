import java.util.Scanner;

public class prog_23 {
  // A b C d E f G h …… n terms
  int term;

  void setData(int term) {
    this.term = term;
  }

  void alphabate() {
    for (char i = 65; i <= 90; i++) {
      if (i % 2 == 0)
        System.out.print("\t" + (char) (i + 32));
      else
        System.out.print("\t" + i);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter term");
    int term = sc.nextInt();
    prog_23 obj = new prog_23();
    obj.setData(term);
    obj.alphabate();

  }
}
