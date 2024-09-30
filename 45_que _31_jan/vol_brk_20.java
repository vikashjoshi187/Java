import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class vol_brk_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
float l,h,w,vb;
System.out.println("Enter the lenght of brick");
l=sc.nextFloat();
System.out.println("Enter the width of brick");
w=sc.nextFloat();
System.out.println("Enter the height of brick");
h=sc.nextFloat();
vb=l*h*w;
System.out.println("The volume og icecream brick is "+vb);



    }
    
}