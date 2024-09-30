import java.util.Scanner;

public class srfc_ara_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pie = 3.14f;
        float r, h, sa, d;
        System.out.println("Enter the diemeter and height in sequence");
        d = sc.nextFloat();
        r = d / 2;
        h = sc.nextFloat();
        sa = (2 * pie * r * h) + (2 * pie) * r * r;
        System.out.println("The surface area of cylinder is " + sa);

    }

}
