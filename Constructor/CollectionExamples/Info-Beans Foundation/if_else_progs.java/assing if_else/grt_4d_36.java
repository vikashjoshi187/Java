import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class grt_4d_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mnum, num1, num2, num3, num4, num5;
        System.out.println("Enter a five digit number");
        mnum = sc.nextInt();
        if (mnum >= 10000 && mnum <= 99999) {
            // Extracting individual numbers
            num1 = mnum / 10000;
            mnum = mnum % 10000;
            num2 = mnum / 1000;
            mnum = mnum % 1000;
            num3 = mnum / 100;
            mnum = mnum % 100;
            num4 = mnum / 10;
            mnum = mnum % 10;
            num5 = mnum;

            
            // Cheking for largest and smallest number
            if(num1>num2 && num1>num3 && num1>num4 && num1 >num5){
                System.out.println(num1+" is greater number");
            }
            else if( num2>num3 && num2>num4 && num2 >num5){
                System.out.println(num2+" is greater number");
            }
            else if(num3>num4 && num3 >num5){
                System.out.println(num3+" is greater number");
            }
            else if(num4 >num5){
                System.out.println(num4+" is greater number");
            }
            else{
                System.out.println(num5+" is gratest number");
            }
        
          //Checking Smallest number
          if(num1<num2 && num1<num3 && num1<num4 && num1 <num5){
            System.out.println(num1+" is smallest number");
        }
        else if( num2<num3 && num2<num4 && num2 <num5){
            System.out.println(num2+" is smalles numbert");
        }
        else if(num3<num4 && num3 <num5){
            System.out.println(num3+" is smallest number");
        }
        else if(num4 <num5){
            System.out.println(num4+" is smallest number");
        }
        else{
            System.out.println(num5+" is smallest number");
        }
      



        } else if (mnum < 10000) {
            System.out.println(" TRY AGAIN!! The number is less then five digit");
        } else {
            System.out.println("TRY AGAIN!! The number is grater then five digit");
        }

    }
}
