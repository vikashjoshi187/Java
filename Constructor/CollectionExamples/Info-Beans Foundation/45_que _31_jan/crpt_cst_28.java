
import javax.xml.transform.Source;

import java.util.Scanner;
public class crpt_cst_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float br,lr,tc,ar,p;
        System.out.println("Enter the breath of carpet");
        br=sc.nextFloat();
        System.out.println("Enter the lenght of carpet");
        lr=sc.nextFloat();
        System.out.println("Enter the price for per square meter");
        p=sc.nextFloat();
        ar=br*lr;
        tc=ar*p;
        System.out.println("The total cost of carpet  will be Rs."+tc);

    }
}
