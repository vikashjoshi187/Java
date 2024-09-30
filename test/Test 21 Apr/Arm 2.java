import java.util.Scanner;
//import java.u;

class ArmStong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        
        int count =0;
        int temp=num;
        while (temp>0) {
            temp=temp/10;
            count++;
        }
        temp=num;
        
        int sum=0;
        while (temp>0) {
            int rem=temp%10;
            sum=sum+(int)Math.pow(rem, count);
             temp=temp/10;
        }

        if (num==sum) {
            System.out.println("ArmStrong Number");
        }
        else{
            System.out.println(" Not ArmStrong Number");

        }



    }
}
