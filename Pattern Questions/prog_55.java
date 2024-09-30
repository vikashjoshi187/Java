import java.util.Scanner;
public class prog_55 {
    /*
    1
   10
  101
 1010
10101
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = 1; i <=num; i++) {
            int temp=1;
            for (int j = num; j >=1; j--) {
                
              if (i>=j) {
                if(temp%2==0){
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
                temp++;
            }
            else{
                    System.out.print(" ");
                }
                

              
            }
            System.out.println();
        }
    }
    
}
