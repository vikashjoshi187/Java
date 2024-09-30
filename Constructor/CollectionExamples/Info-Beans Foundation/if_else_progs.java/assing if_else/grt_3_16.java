import java.util.Scanner;

public class grt_3_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter num1");
        a=sc.nextInt();
        System.out.println("Enter num4");
        b=sc.nextInt();
        System.out.println("Enter num3");
        c=sc.nextInt();
        if(a==b && a==c ){
            System.out.println("all numbers are equal");
        }
        else if(a==b && a>c){
            System.out.println(a+" and "+b+" are bigger and equal");

        }
        else if(a==c && a>b){
            System.out.println(a+" and "+c+" are bigger and equal");

        }
        else if(b==c && b>a){
            System.out.println(b+" and "+c+" are bigger and equal");

        }
        else if (a>b && a>c){
            System.out.println(a+" is bigger");
        }
        else if (a<b && b>c){
            System.out.println(b+" is bigger");
        }
        else if (c>b && a<c){
            System.out.println(c+" is bigger");
        }



      

    }
}
