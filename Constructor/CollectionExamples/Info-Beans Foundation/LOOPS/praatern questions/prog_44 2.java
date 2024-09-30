import java.util.Scanner;
public class prog_44 {
    /*
55555
4  4
3 3
22
1
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = num; i >= 1; i--) {


            for (int j = 1; j <= i; j++) {
                if(j==1 || i==num || j==i ){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();

            

            
        }

    }
}
