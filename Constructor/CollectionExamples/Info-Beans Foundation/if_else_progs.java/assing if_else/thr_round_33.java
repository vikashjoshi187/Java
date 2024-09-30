import java.util.Scanner;
public class thr_round_33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,r,temp;
        System.out.println("Enter a two digit num");
        num=sc.nextInt();
        if(num>=100 && num<=999 ){
            r=num%10;
            if(r<=4){
                num=num-r;
                System.out.println("The round of value is "+num);
                

            }
            else{
                r=num%10;
                temp=10-r;
                num=num+temp;

                System.out.println("The round of value is "+num);
            }
        }
        else if(num<100){
            System.out.println("The entered number is less then 100");
        }
        else {
            System.out.println("The entered number is greater then then 999");
        }

    }
}
