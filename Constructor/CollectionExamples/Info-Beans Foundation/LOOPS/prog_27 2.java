import java.util.Scanner;
public class prog_27 {
    // * # * # * # * # * …….
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
         
        for (int i = 0; i < num; i++) {
            if (i%2==0) {
                 System.out.print(" # ");
                
            }
            else{
                System.out.print(" * ");
            }
            
        }
    }
}
