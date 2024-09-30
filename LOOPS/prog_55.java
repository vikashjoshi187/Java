import java.util.Scanner;
public class prog_55 {
    //WAP to print all the 0dd numbers between two entered numbers
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter number 1");
        num1=sc.nextInt();
        System.out.println("Enter number 2");
        num2=sc.nextInt();

        for (int i = num1; i <= num2; i++) {

            if (i%2!=0) {
                System.out.println(i);
                
            }
}
        


    }
}
