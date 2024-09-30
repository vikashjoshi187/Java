import java.util.Scanner;
public class prog_34 {
    //WAP to check whether entered number is perfect or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nukmber");
        int num = sc.nextInt(), temp = 0;
        int i = 1;
        for (; i <=(num/2); i++) {
            if (num % i == 0) {
                temp = temp + i;
            }
        }
        if (temp == num) 
            System.out.println("it is perfert num");
         else 
            System.out.println("not a perfect numner");
    }
    
}
