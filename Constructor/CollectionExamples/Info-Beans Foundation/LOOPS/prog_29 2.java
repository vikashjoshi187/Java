import java.util.Scanner;
public class prog_29 {
    //  1	11	111	1111	  11111	……
    // 0*0+1 1*10+1 11*10+1=111 111*10+1  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter na number of terms");
        int num=sc.nextInt();
        int temp=0;
        for (int i = 0; i < num; i++) {
            temp=temp*10+1;
            System.out.println(temp);
            
        }
    }
}
