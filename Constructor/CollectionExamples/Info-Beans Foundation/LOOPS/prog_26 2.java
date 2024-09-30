import java.util.Scanner;
public class prog_26 {
    ///0	8	64	216	…………
    //0*0 2*2*2 4*4*4  

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num=sc.nextInt();
        for (int i = 0; i < num*2; i=i+2) {
            System.out.println(i*i*i);
        }

        

    }
}
