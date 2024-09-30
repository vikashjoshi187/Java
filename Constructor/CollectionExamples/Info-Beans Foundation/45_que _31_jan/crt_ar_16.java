import java.util.Scanner;
public class crt_ar_16 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float l,b,a;
    System.out.println("Enter the lenght of room");
    l=sc.nextFloat();
    System.out.println("Enter the breadth of room");
    b=sc.nextFloat();
    a=l*b;
    System.out.println("The total carept needed will be "+a+"sq meter");
}
}
