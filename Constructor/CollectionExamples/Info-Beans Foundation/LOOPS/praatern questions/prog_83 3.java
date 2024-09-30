import java.util.Scanner;
public class prog_83 {
    /*
1
12
1 3
1  4
1   5
1    6
1   5
1  4
1 3
12
1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num = sc.nextInt();


        for (int i = 1; i <= (num/2)+1; i++) {
            for (int j = 1; j <= i; j++) {
                if (j==1 || j==i) {
                    
                System.out.print(j);
                }
                else{
                    System.out.print(" ");

                }
                
            }
            System.out.println();
            
        }


        for (int i = num/2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j==1 || j==i) {
                    
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
