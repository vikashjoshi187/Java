import java.util.Scanner;

public class prog_45 {
    /*
123456
54321
1234
321
12
1
    
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
           
            if (i % 2 == 0) {
                
                for (int j = 1; j <= num-i; j++) {
                    System.out.print(j);
                    
                }
            }
            else{
                
                for (int j = (num-i); j>=1; j--) {
                    System.out.print(j);
                }
            }

            System.out.println();
        }

    }
}
