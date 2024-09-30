import java.util.Scanner;

public class prog_13 {
    // HCF
    void cal() {
        int a;
        Scanner ip = new Scanner(System.in);
        System.out.println(" Enter num and num1 : ");
        int num = ip.nextInt();
        int num1 = ip.nextInt();
        if (num > num1)
            a = num1;
        else
            a = num;
        int hcf = 0;
        for (int i = 1; i <= a; i++) {
            if (num % i == 0 && num1 % i == 0) {
                hcf = i;
            }
        }
        System.out.println(" Hcf : " + hcf);
    }

    public static void main(String args[]) {
        prog_13 ob = new prog_13();
        ob.cal();
    }

}