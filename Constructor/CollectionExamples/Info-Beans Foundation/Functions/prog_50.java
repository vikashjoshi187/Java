import java.util.Scanner;

public class prog_50 {
    // 50)WAP to print Odd numbers upto N.

    void prntodd(int num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= num; i++) {

            if(i%2!=0){
            System.out.print("\t"+i);
            }

        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog_50 obj = new prog_50();
        System.out.println("Enter a range for printng  N odd numbers");
        int nm = sc.nextInt();
        obj.prntodd(nm);
    }
}
