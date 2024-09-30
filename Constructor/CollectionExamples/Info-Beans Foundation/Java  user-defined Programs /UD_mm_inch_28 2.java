import java.util.Scanner;
public class UD_mm_inch_28 {
    public static void main (String args []){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter values in mm");

        float mm=sc.nextFloat();
        float inch=mm/304.8006096f;
        System.out.println("the height in inch will be "+inch);

    } 
}
