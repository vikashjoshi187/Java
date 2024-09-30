import java.util.Scanner;
public class ExceptionDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        try{
            double c = a/b;
            System.out.println("Result : "+c);
        }
        catch(ArithmeticException e){
                System.out.println("Inside Arithmetic catch block : "+e);            
        }
        catch(RuntimeException e){
                System.out.println("Inside Runtime catch block : "+e);            
        }
        catch(Exception e){
                System.out.println("Inside catch block : "+e);            
        }
        catch(Throwable e){
                System.out.println("Inside Throwable catch block : "+e);            
        }        
        finally{
                System.out.println("Inside finally block");
        }
    }
}
