import java.util.Scanner;
//WAP to find out all the palindrome numbers between two entered numbers
public class prog_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        int rev=0,temp;
        
        for (int i = num1; i <= num2; i++) {
            temp=i;
            while (temp>0) {
                rev=rev*10+temp%10;
                temp=temp/10;
            }
            if(rev==i){
                System.out.println(i+" is palindrome");
            }
            rev=0;
        }
    }
}

