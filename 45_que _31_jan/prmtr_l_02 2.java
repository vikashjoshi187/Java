
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAdder;


import java.util.Scanner;
public class prmtr_l_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         float area,b;
         System.out.println("Enter the Area of rectngle");
         area=sc.nextFloat();
         System.out.println("Enter the breath of rectngle");
         b=sc.nextFloat();
         float l=(area/b);
         float p=(l+b)*2;
System.out.println("The perimeter of rectangle is "+p+"\n The leanght of rectangle is "+l);

        }
}
