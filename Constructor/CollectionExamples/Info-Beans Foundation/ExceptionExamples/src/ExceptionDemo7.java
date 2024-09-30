

/*
class Exception{
     String message;   
    Exception(String message){
    this.message=message;
    }

   public String getMessage(){
     return message; 
   }
}
class RuntimeException extends Exception{
     .......
    ........
}
class ArithmeticException extends RuntimeException{
    ArithmeticException(String message){
            super(message);
    }
}

new ArithmeticException("Result Greater than 5");

*/
import java.util.Scanner;
public class ExceptionDemo7 {
    static void divide(int a,int b)
    {
        try{
             int c = a/b;
                if(c>5)
                    throw new ArithmeticException("Result Greater than 5");
             System.out.println("Result : "+c);
        }catch(ArithmeticException e){
            System.out.println("Exception : "+e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();            
        divide(a,b);
       }
}
