import java.util.Scanner;
public class Gs_Ns_29 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float bs,ta,pd,da,ns,gs,tap,pdp;
        System.out.println("Enter basic salary");
        bs=sc.nextFloat();
        System.out.println("Enter Travel allowance in percent ");
        tap=sc.nextFloat();
        System.out.println("Enter Provident Fund in percent ");
        pdp=sc.nextFloat();
        ta=tap*(bs/100);
        pd =pdp*(bs/100);
        da=500.0f;
        gs=bs+da+ta;
        ns=gs-pd;
        System.out.println("Travel allowance is "+ta);
        System.out.println("Provident Fund"+pd);
        System.out.println("The Gross salary is "+gs);
        System.out.println("The Net salary is "+ns);
 

    }
}
