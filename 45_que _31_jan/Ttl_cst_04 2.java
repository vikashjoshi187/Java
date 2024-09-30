import java.util.Scanner;
public class Ttl_cst_04 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the lentght and breath of redion in sequence");
     float lr,br,ar,tc;
     lr=sc.nextFloat();
     br=sc.nextFloat();
     ar=lr*br;
     tc=(ar/100)*6;
     System.out.println("The total cost foe tile in the region is $"+tc);


    }
    
}
