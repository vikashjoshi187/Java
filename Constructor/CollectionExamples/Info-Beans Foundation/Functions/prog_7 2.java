import java.util.Scanner;
public class prog_7 {
    // 7) Program to find out compound interest if principal is greater than or equals to 500 otherwise find out simple interest
double princpl(int p, float r, int t) {
        if (p >= 500) {
            double ci = p + Math.pow((1 + r/100),t)-p;
            System.out.println("The Compound Interest Is");
            return ci;
        } 
        else {
            double si = (p*r*t)/100;
            System.out.println("The Simple Interest Is ");
            return si;
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter principle");
        int p=sc.nextInt();
        System.out.println("Enter time ");
        int tm=sc.nextInt();
        System.out.println("Enter rate");
        int rt=sc.nextInt();
        
        prog_7 obj=new prog_7();
        System.out.println(obj.princpl(p, rt, tm));
    



    }
}