import java.util.Scanner;
public class tw_round_of_32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,r,temp;
        System.out.println("Enter a two digit num");
        num=sc.nextInt();
        if(num>=10 && num<=99 ){
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
        else if(num<10){
            System.out.println("The entered number is less then 10");
        }
        else {
            System.out.println("The entered number is greater then then 99");
        }

    }
}
