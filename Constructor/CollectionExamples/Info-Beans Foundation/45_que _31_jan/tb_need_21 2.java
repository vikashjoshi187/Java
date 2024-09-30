import java.util.Scanner;

public class tb_need_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float l, h, w, wl, ww, wh, ab, aw, tb;
        System.out.println("Enter the lenght of brick");
        l = sc.nextFloat();
        System.out.println("Enter the width of brick");
        w = sc.nextFloat();
        System.out.println("Enter the height of brick");
        h = sc.nextFloat();
        ab = l * h * w;

        System.out.println("Enter the lenght of wall");
        wl = sc.nextFloat();
        System.out.println("Enter the width of wall");
        ww = sc.nextFloat();
        System.out.println("Enter the height of wall");
        wh = sc.nextFloat();
        aw = wl * ww * wh;
        tb = aw / ab;
        System.out.println("Total bricks need for the wall are " + tb);

    }

}