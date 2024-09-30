import java.util.Scanner;

public class plndrm_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mnum,temp, num1, num2, num3, num4, num5,num6;
        System.out.println("Enter a six digit number");
        mnum = sc.nextInt();
        temp=mnum;
        if (mnum >= 100000 && mnum <= 999999) {
            // Extracting individual numbers
            num1 = mnum / 100000;
            mnum = mnum % 100000;
            num2 = mnum / 10000;
            mnum = mnum % 10000;
            num3 = mnum / 1000;
            mnum = mnum % 1000;
            num4 = mnum / 100;
            mnum = mnum % 100;
            num5 = mnum/10;
            mnum=mnum%10;
            num6=mnum;
            // Changing the numbers
            num6 = num6 * 100000;
            num5 = num5 * 10000;
            num4 = num4 * 1000;
            num3 = num3 * 100;
            num2 = num2 * 10;
            num1 = num1 * 1;
            mnum = num6+num5 + num4 + num3 + num2 + num1;
            System.out.println("The reversed num is " + mnum);
            if(mnum==temp){
                System.out.println("The entered num "+temp+" is palaindrome");
            }
            else{
                System.out.println("The entered num "+temp+" is not palaindrome");
            }

        } else if (mnum < 100000) {
            System.out.println(" TRY AGAIN!! The number is less then six digit");
        } else {
            System.out.println("TRY AGAIN!! The number is grater then six digit");
        }

    }
}
