import java.util.Scanner;

public class prime_num{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        boolean a = true;
        
        for (int i = 2; i < n; i++) {
           if (n%i==0) {
            a=false;

           }
        }
        
        
        if (a==false) {
            System.out.print ("not prime");
        }
        else{
            System.out.print("prime");
        }
        


    }
}
