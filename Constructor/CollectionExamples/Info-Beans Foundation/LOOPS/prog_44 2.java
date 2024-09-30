// reverse first & last Digit
import java.util.Scanner;
class prog_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int a = num;
        int count = 0;
        while (a > 0){
            count++;
            a = a / 10;
        }
        System.out.println("Number of Digits -> "+count);

        int fst = num/(int)Math.pow(10,count-1);
        int mt = (num%(int)Math.pow(10,count-1))/10;             
        int lt  = num%10;

        System.out.println("First Digit "+fst);
        System.out.println("Middle Digit "+mt);
        System.out.println("Last Digit "+lt);

        int result = (count == 1)? num : lt*(int)Math.pow(10,count-1)+mt*10+fst;
        System.out.println("Result "+result);
    }
}