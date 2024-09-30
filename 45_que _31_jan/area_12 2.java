import java.util.Scanner;
public class area_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,s,area;
        System.out.println("enter side 1");
        a=sc.nextDouble();
        System.out.println("enter side 2 ");
        b=sc.nextDouble();
        c=Math.sqrt(a*a-b*b);
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("The "+c);
System.out.println("The "+s);
System.out.println("The area is "+area);
    }
}
