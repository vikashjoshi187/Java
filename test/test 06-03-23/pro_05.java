import java.net.SocketPermission;
import java.util.Scanner;
public class pro_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
        int row  =sc.nextInt();
        for (int i = 0; i < row; i++) {
          
          
            for (int j = 0; j <= (row-i)-1; j++) {
                System.out.println(" ");
                        }


                        for (int j = 0; j <= i; j++) {
                            int ifact=1;
                            int jfact=1;
                            int ijfact=1;

                            for (int x= 1; x <= i; x++) {
                                ifact=ifact*x;
                                
                            }
                            for (int x= 1; x <= i; x++) {
                                jfact=jfact*x;
                                
                            }
                            for (int x= 1; x <= i; x++) {
                                ijfact=ijfact*x;
                                
                            }
                            System.out.print((ifact/(jfact*ijfact)+" "));
                            
                        }
                        System.out.println();
}
       
    }
    
}
