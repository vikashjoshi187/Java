import java.util.Scanner;
public class UD_percnt_5btw_check_20 {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.println("enter five numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=sc.nextInt();
int f=(a+b+c+d+e)/5;
String s=(f>=75 && f<=100)?f+"% is between 75 and 100":f+"% is lower than 75%\n";
System.out.println(s);
    }
}





