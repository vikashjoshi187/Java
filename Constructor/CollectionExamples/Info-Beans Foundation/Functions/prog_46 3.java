import java.util.Scanner;

public class prog_46 {
    //46)WAP to print a statement 1000 number of times.
    void prntStat(int num) {

        for (int i = 1; i <= num; i++) {
            System.out.println("This is Statement " + i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog_46 obj = new prog_46();

        System.out.println("Enter a number ");
        int nm = sc.nextInt();
        obj.prntStat(nm);
    }
}
