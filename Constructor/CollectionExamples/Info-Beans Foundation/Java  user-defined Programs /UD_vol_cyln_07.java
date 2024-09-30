
import java.util.Scanner;
public class UD_vol_cyln_07 {
   public static void main(String args[]){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter first radius and height of cylinder");
     float v,pie=3.14f;
     float r=sc.nextFloat();
     float h=sc.nextFloat();
    v=pie*(r*r)*h;
    System.out.println("the voulme of cylinder is "+v);


   } 
}         
