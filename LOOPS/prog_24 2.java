import java.util.Scanner;
public class prog_24 {
   
    // 0	4	16	36	64	…
   // 0*0   2*2 4*4  

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
        for (int i = 0; i < num*2; i=i+2) {
            System.out.println(i*i);
        }


    }
}
