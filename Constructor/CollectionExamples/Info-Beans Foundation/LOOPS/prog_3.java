import java.util.Scanner;
public class prog_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,count=0;
        System.out.println("Enter a number");
        num=sc.nextInt();

        for (int i = 1; i <= num; i++) {
            count=count+i;
            
        }
        System.out.println("THE SUM OF THE "+num+" natural number is "+count);



    }
}
