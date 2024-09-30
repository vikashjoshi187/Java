import java.util.Scanner;
public class prog_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();

        for (int i = 1; i <= 10; i++) {
           
           
            System.out.println(num+"*"+i+"="+i*num);

            
        }




    }
}
