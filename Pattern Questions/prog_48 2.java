import java.util.Scanner;
public class prog_48 {
    /*
54321
5432
543
54
5
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = 0; i <num; i++) {
            for (int j = 5; j >=1+i; j--) {
                System.out.print(j);
                
            }
            System.out.println();
            
        }
    }
    
}
