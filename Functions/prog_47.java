import java.util.Scanner;
public class prog_47 {
    //47)WAP to print table of a number.
void prntTable(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x "+i+"  = "+(num*i));
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog_47 obj = new prog_47();

        System.out.println("Enter a number for printing table ");
        int nm = sc.nextInt();
        obj.prntTable(nm);
    }
}
