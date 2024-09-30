import java.util.Scanner;

public class _error_pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of line");
        int n = sc.nextInt();
        char count = 'A';
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                int  ch=(65+i+j-2);
                System.out.print(ch+" ");
                count++;
                j++; 
            }
            
            System.out.println();
            i++;
        }

    }
}
