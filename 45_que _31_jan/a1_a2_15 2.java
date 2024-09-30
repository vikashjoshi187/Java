import java.util.Scanner;
public class a1_a2_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a1,a2,l1,l2,b1,b2;
        System.out.println("Enter the lenght for the 1st region");
        l1=sc.nextFloat();
        System.out.println("Enter the breadth for the 1st region");
        b1=sc.nextFloat();
        a1=l1*b1;

        System.out.println("Enter the lenght for the 2nd region");
        l2=sc.nextFloat();
        System.out.println("Enter the breadth for the 2nd region");
        b2=sc.nextFloat();
        a2=l2*b2;
        String s=(a1>a2)?"firat area is larger":"Second area is larger";
        System.out.println(s);

    }
}
