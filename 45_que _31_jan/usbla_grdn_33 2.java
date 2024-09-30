import java.util.Scanner;

public class usbla_grdn_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ag, lg, bg, wp1, wp2, ap1, ap2, tpa, ba, tua;
        System.out.println("Enter the lenght of garden");
        lg = sc.nextFloat();
        System.out.println("Enter the breath of garden");
        bg = sc.nextFloat();
        ag = lg * bg;
        System.out.println("enter the width of path 1");
        wp1 = sc.nextFloat();
        ap1 = wp1 * lg;

        System.out.println("enter the width of path 2");
        wp2 = sc.nextFloat();
        ap2 = wp2 * bg;
        ba = wp1 * wp2;
        tpa = (ap1 + ap2) - ba;
        tua = ag - tpa;
        System.out.println("The total usable garden area is " + tua);

    }
}
