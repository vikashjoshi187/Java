import java.util.Scanner;

public class dist_km_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float l, b, tr, pp, dk;
        System.out.println("Enter lenght of park");
        l = sc.nextFloat();
        System.out.println("Enter breath of park");
        b = sc.nextFloat();
        System.out.println("Enter ltotal round");
        tr = sc.nextFloat();
        pp = 2 * (l + b);
        dk = (pp * tr) / 1000;
        System.out.println("The total distance covered will be " + dk+"km");

    }
}
