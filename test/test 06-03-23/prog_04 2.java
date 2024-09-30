import java.util.Scanner;
public class prog_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row -> ");
		int num = sc.nextInt();
        for (int i = 1; i <= num*2-1; i++){
            for (int j = 1; j <= num*2-1; j++){
                if (j==num || i == num || (i==1&&j>num) ||(j==1&&i<num)||(i==num*2-1&&j<num)||(j==num*2-1&&i>num))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }System.out.println();
        }
    }    
}