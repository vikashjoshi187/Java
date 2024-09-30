import java.util.Scanner;
public class prog_51 {
    /*
    5
   44
  333
 2222
11111
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=num;
        for (int i = 1; i <=num; i++) {
            

            for (int j = num; j >=1; j--) {
              
              if (i>=j) {
                System.out.print(temp);

                }
                else{
                    System.out.print(" ");
                }
            }
             temp--;
            System.out.println();
        }
    }
    
}
