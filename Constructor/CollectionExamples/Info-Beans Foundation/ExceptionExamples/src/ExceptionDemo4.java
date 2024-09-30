import java.util.Scanner;
public class ExceptionDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        try{
            int c = a/b;
            System.out.println("Result : "+c);
         }
        catch(ArithmeticException e){
                System.out.println("Exception : "+e);            
                System.out.println("Exception : "+e.toString());
                System.out.println("Exception : "+e.getMessage());            
                System.out.println("You are trying to divide a number by zero");            
                System.err.println("You are trying to divide a number by zero");
                e.printStackTrace();
        }
    }
}
