import java.util.Scanner;

import javax.xml.transform.Source;
public class prog_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
    }
}
