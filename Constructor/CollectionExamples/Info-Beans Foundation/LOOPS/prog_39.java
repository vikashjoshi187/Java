import java.util.Scanner;
public class prog_39 {
    //WAP to check whether entered number is strong or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dub, digi, sum = 0;
        System.out.println("Enter a number");
        num = sc.nextInt();
        dub = num;
        while (dub > 0) {
            digi=dub%10;
            int f=1;
            for (int i = 1; i <= digi; i++) {
                f=f*i;
            }
            sum=sum+f;
            dub=dub/10;
        }
        if (sum == num) {
            System.out.println(num+" is a strong number");
        }
        else{
            System.out.println(num+" is not a strong number");

        }
    }
}
