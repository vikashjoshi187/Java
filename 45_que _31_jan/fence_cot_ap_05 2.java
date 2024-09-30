import java.util.Scanner;

public class fence_cot_ap_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tc, tl, p, b, area,l,pr;
        System.out.println("Enter the toatal cost lenght of fence and price for pesquare m");
        tc = sc.nextFloat();
        l = sc.nextFloat();
        pr=sc.nextFloat();
        area = tc / pr;
        b = area / l;
        p = 2 * (l + b);
        System.out.println(
                "The area of fence is " + area + "\nThe perimeter of fence is " + p + "\n The breath of fence is " + b);

    }
}
