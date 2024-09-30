import javax.naming.ldap.ManageReferralControl;
import javax.xml.transform.Source;

import java.util.Scanner;
public class ttc_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float br,lr,tc,ar,p;
        System.out.println("Enter the breath of room");
        br=sc.nextFloat();
        System.out.println("Enter the lenght of room");
        lr=sc.nextFloat();
        System.out.println("Enter the price for per square meter");
        p=sc.nextFloat();
        ar=br*lr;
        tc=ar*p;
        System.out.println("The total cost will be Rs."+tc);

    }
}
