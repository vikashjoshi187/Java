import java.util.Scanner;
public class prog_22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num=sc.nextInt();
        int temp=65+num;
        for (int i = 65; i <= temp; i++) {
            for (int j = 65; j <= i; j++) {
                if (j==65 || j==i || i==temp) {
                    System.out.print((char)j);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("\n");
        }
    }
}
