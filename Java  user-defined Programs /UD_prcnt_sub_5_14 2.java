import java.util.Scanner;

public class UD_prcnt_sub_5_14{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of five Subjects");
        //Entering the five subjects marks
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f;

        f =((a+b+c+d+e)*100)/500;
        System.out.println("The persent scored by student is " + f + "%");
    }
}
