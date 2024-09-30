import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import java.util.Scanner;
public class vol_cy_42 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double d,h,r,vc;
    double pi=3.14;
    System.out.println("Enter the diemeter ");
    d=sc.nextDouble();
    System.out.println("Enter the height ");
    h=sc.nextDouble();
    r=d/2;
    vc=(Math.PI*r*r)*h;
    System.out.println("The volume is "+vc);



}
}
