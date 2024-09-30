import java.util.Scanner;
public class how_tile_03 {
    public static void main(String[] args) {
        float rl,rb,tl,tb,ra,at,tt;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght and breath of tile in sequence");
        tl=sc.nextFloat();
        tb=sc.nextFloat();
        at=tl*tb;
        System.out.println("enter the lenght and breath of region in sequence");
        rl=sc.nextFloat();
        rb=sc.nextFloat();
        ra=rl*rb;
        tt=ra/at;
        System.out.println("The total tile needed fo the region are"+tt);



        
    }
    
}
