import java.util.Scanner;
public class brick_no_22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float pl,pb,pd,cm;
        System.out.println("Enter the pond lenght ");
        pl=sc.nextFloat();
        System.out.println("Enter the pond breath ");
        pb=sc.nextFloat();
        System.out.println("Enter the pond depth ");
        pd=sc.nextFloat();
        cm=pl*pb*pd;
        System.out.println("The capicity of pond in cubic meter is"+cm);
        
        
    }
}
