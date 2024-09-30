import java.util.Scanner;
class prog_11 {
    //11) Program to find sum of all individual digit of a 4 digit number & if sum is more than 9 then again find out sum of digits.
    void sum (int sum){
        int sum2 = 0,rem = 0;
        while (sum > 0){
        rem = sum%10;
        sum2 += rem;
        sum /= 10;
        }
        System.out.println("Again Sum of sum of digit is  "+sum2);
    }
    int rund(int a) {
        int sum = 0;
        if (a > 999 && a < 10000) {
            while (a>0){
                int rem = a % 10;
                sum += rem;
                a /= 10;
            }
        } else
            System.out.println("Not a Three Digit Number");
        System.out.println("Sum of digit of all number  "+sum);
                return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number -> ");
        int num = sc.nextInt();
        prog_11 obj = new prog_11();
        int sum = obj.rund(num);
        if (sum > 9){
            obj.sum(sum);
        }
    }
}