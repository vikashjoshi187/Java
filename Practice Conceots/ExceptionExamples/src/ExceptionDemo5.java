import java.util.Scanner;
public class ExceptionDemo5 {
    static int divide(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        try{
            int c = divide(a,b);
            System.out.println("Result : "+c);
         }
        catch(ArithmeticException e){
               // System.out.println("Exception : "+e);            
            e.printStackTrace();
        }
    }
}
