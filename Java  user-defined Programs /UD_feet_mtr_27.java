import java.util.Scanner;
public class UD_feet_mtr_27 {
    public static void main (String args []){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter values in feet");

        float mtr=sc.nextFloat();
        float ft=mtr/0.3048f;
        System.out.println("the height in inches will be "+ft);

    }
}

