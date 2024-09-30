import java.util.Scanner;
public class ribbn_p_17 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float l,b,p;
    System.out.println("Enter the lenght of board");
    l=sc.nextFloat();
    System.out.println("Enter the breath of board");
    b=sc.nextFloat();
    p=(l+b)*2;
    System.out.println("The toatl ribbon need will be "+p+"m");
   } 
}
