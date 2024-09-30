import java.util.Scanner;
import java.lang.Math;
public class ara_sq_31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double ps,as;
        System.out.println("Enter the perimeter of Square");
        ps=sc.nextDouble();
        as=Math.pow((ps/4),2);
        System.out.println("The area of square is "+as);
    }
    
}
