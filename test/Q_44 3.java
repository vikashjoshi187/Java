import java.util.Scanner;

public class Q_44 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float s,ft,st,tt,frt,nth,d,n;


    System.out.println("Enter first trm");
    ft=sc.nextFloat();
    System.out.println("Enter second trm");
    st=sc.nextFloat();
    System.out.println("Enter third trm");
    tt=sc.nextFloat();
    System.out.println("Enter fourth trm trm");
    frt=sc.nextFloat();
    d=st-ft;
    if(d==st-ft && d==tt-st){
      System.out.println("Enrer ter number you want");
      nth=sc.nextFloat();
      n=ft+(nth-1)*d;
      System.out.println("the nt term will be "+n);
    }
    else{
      System.out.println("The difference is not same");
    }
   
   }
}
