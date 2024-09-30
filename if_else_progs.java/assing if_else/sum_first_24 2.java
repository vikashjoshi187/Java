import java.util.Scanner;
public class sum_first_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,fn,sn,tn,sum;
        System.out.println("Enter a the digit number");
        num=sc.nextInt();
        if(num<=999 && num>=100){
            fn=num/100;
            num=num%100;
            sn=num/10;
            num=num%10;
            tn=num;
            sum=fn+sn+tn;
            System.out.println("The sum of all numbers int the digit is "+sum);
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
