import java.util.Scanner;
public class prog_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num=sc.nextInt();
        int temp=97+num,ch=97;
        for (int i = 97; i <= temp; i++) {
            for (int j = 97; j <= i; j++) {
                if (j==97 || j==i || i==temp) {
                    System.out.print((char)ch);
                }
                else{
                    System.out.print(" ");
                }
                ch++;
                
            }
            System.out.println("\n");
        }
    }
}
