import java.util.Scanner;
public class prog_9 {
    // 9. Write a program that accepts three digit number and 
    //find out the sum of all the individual digits
    int rev(int num) {

        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        prog_9 obj = new prog_9();
        
        System.out.println("The sum of all digit in the number is "+obj.rev(num));

    }
}