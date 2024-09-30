import java.util.Scanner;
public class prog_22 {
    //1	8	27	64	125	…..
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("Enter a number");
    num=sc.nextInt();
    for (int i = 1; i <= num; i++) {

        System.out.println(i*i*i);
    }
}    
}
