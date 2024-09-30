import java.util.Scanner;
public class sum_four_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,fn,sn,tn,fth,sum;
        System.out.println("Enter a the digit number");
        num=sc.nextInt();
        if(num<=9999 && num>=1000){
            fn=num/1000;
            num=num%1000;
            sn=num/100;
            num=num%100;
            tn=num/10;
            num=num%10;
            fth=num;

            sum=fn+sn+tn+fth;
            System.out.println("The sum of all numbers int the digit is "+sum);


        }
        else{
            System.out.println("Invalid input");
        }

    }
}