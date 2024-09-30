import java.util.Scanner;
public class UD_dy_to_yr_31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter no to conver into years");
        int  dy=sc.nextInt();
        int yr=dy/365;
        int rday =dy%365;
        int week=rday/7;
        System.out.println(("no of year is equal to :"+yr+"\n the numbers of extra days will be "+rday+" \n the number of extra weeks will be "+week));
    }
    
}
