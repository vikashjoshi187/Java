import java.util.Scanner;
public class h_brk_24 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float bl,bw,bh,wl,ww,wh,bv,wv,tp,tb;
        System.out.println("enter the width of brick");
         bw=sc.nextFloat();
        System.out.println("enter the height of height");
        bh=sc.nextFloat();
        System.out.println("enter the lenght of lenght");
        bl=sc.nextFloat();
        bv=(bl*bw*bh)/100;
        System.out.println("enter the width of wall");
        ww=sc.nextFloat();
        System.out.println("enter the height of wall");
        wh=sc.nextFloat();
        System.out.println("enter the lenght of wall");
        wl=sc.nextFloat();
        wv=(wl*ww*wh)/100;
        tb=wv/bv;
        tp=(tb/1000)*900;
        System.out.println("The total pice will be "+tp+"\nThe total bricks required will be "+tb);


    }
}
