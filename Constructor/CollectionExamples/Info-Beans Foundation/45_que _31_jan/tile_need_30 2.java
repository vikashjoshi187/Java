import java.net.Socket;
import java.util.Scanner;
public class tile_need_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float lt,bt,lf,bf,at,af,tt;
        System.out.println("enter the lenght of tile");
        lt=sc.nextFloat();
        System.out.println("enter the breath of tile");
        bt=sc.nextFloat();
        at=lt*bt;

        System.out.println("enter the lenght of floor");
        lf=sc.nextFloat();
        System.out.println("enter the breath of floor");
        bf=sc.nextFloat();
        af=lf*bf;
        tt=af/at;
        System.out.println("The total tile need will be "+tt);

    }
    }

