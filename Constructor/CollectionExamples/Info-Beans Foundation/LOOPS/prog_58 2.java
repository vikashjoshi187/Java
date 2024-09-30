import java.util.Scanner;
public class prog_58 {
    //WAP to convert decimal number into binary number without using array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bits;
        String bit=" ";
        System.out.println("Enter bits");
        bits=sc.nextInt();
        while (bits>0) {

            int tep=bits%2;
            bit=tep+" "+bit;
            bits/=2;
        }
        System.out.println(bit);


    }
}
