import java.util.Scanner;
public class UD_mtr_feet_26 {
    public static void main (String args []){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter values in feet");

        float ft=sc.nextFloat();
        float mtr=ft/3.281f;
        System.out.println("the height in inches will be "+mtr);

    }
}

