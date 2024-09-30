import java.util.Scanner;
public class Q33 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float lp,bp,wp1,wp2,ag,ap1,ap2,ab,abp,ra;
        System.out.println("Enter lenght of garden");
        lp=sc.nextFloat();
        System.out.println("Enter breath of garden");
        bp=sc.nextFloat();
        ag=lp*bp;
        System.out.println("Enter the with of path 1");
        wp1=sc.nextFloat();
        ap1=wp1*bp;
        System.out.println("Enter the width od path 2");
        wp2=sc.nextFloat();
        ap2=wp2*lp;
        ab=wp1*wp2;
        abp=ap1+ap2-ab;
        ra=ag-abp;
        System.out.println("The remaining area will be "+ra);

    }
}