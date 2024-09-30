import java.util.Scanner;
public class hght_trngl_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b,h,area;
        System.out.println("Enter the Area and base of the tringle ");
        area=sc.nextFloat();
        b=sc.nextFloat();
        h=(area*2)/b;
        System.out.println("The height of triangle is "+h);
    }
}
