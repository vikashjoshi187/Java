import java.util.Scanner;
public class ExceptionDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int  a = sc.nextInt();
        double  b = sc.nextInt();
        
        try{
            double c = a/b;
            System.out.println("Result : "+c);
         }
        catch(ArithmeticException e){
                System.out.println("Inside Arithmetic catch block : "+e);            
        }
        finally{
                System.out.println("Inside finally block");
        }
    }
}
