import java.util.Scanner;
public class prog_42 {
    /*
ABCDE
A  D
A C
AB
A
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = num+64; i >= 65; i--) {


            for (int j = 65; j <= i; j++) {
                
                if(j==65 || i==64+num || j==i ){
                    System.out.print((char)j);
                }
                else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();

            

            
        }

    }
}
