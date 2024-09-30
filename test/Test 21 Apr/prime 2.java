import java.util.*;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        int i;

        for (i = 2; i <= num / 2; i++) {

            if (num%i==0) {
                break;
            }
         
        }
           
        if (i > num / 2 && num > 1) {
            System.out.println("Prime");
            
        } else {
            System.out.println("Not Prime");
        }
    }
}
