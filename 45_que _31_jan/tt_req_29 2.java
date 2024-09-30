import java.util.Scanner;
public class tt_req_29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float st,lf,bf,at,af,tt;
        System.out.println("Enter the side od tile ");
        st=sc.nextFloat();
        at=st*st;
        System.out.println("Enter the lenght of floor ");
        lf=sc.nextFloat();
        System.out.println("Enter the breath of floor ");
        bf=sc.nextFloat();
        af=lf*bf;
        tt=af/at;
        System.out.println("the total no of tile equired n the floor are "+tt);
    }
}
