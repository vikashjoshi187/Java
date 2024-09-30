import java.util.Scanner;


public class eql_big_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Entet num1");
        a=sc.nextInt();
        System.out.println("Entet num2");
        b=sc.nextInt();
        if(a!=b){
            if (a>b) {
                System.out.println("The first number "+a+" is bigger");
            }
            else  {
                System.out.println("The second number "+b+" is bigger");
            }
        }
        else{
            System.out.println("Both are equal");
        }


    }
}
