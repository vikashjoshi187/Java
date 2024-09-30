/**
 * rprog_1
 */
/*
 *    1
     101
    10101
   1010101
  101010101
 10101010101
1010101010101
 */



import java.util.Scanner;
public class rprog_1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <= (i*2)-1; j++) {
                if(j%2==0){
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }

                
            }System.out.println();

            
        }
    }
}