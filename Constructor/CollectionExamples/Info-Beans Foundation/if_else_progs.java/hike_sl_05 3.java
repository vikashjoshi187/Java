
import java.util.Scanner;

public class hike_sl_05 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int sl,exp;
     System.out.println("Enter salary");
     sl=sc.nextInt();
     System.out.println("Enter exp");
     exp=sc.nextInt();
     if(sl>=10000 && exp>=5){
        System.out.println("Eligibal for hike");
     }
     else {
System.out.println("Not eligibal for hike");

     }


    }
}
