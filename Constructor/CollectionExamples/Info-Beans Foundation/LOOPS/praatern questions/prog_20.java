import java.util.Scanner;
public class prog_20 {
    /*
1
12
1 3
1  4
1   5
123456
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ( j==i || i==num || j==1) {
                    System.out.print(j);
                    
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
