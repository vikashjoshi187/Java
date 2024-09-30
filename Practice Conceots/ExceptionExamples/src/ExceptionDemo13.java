import java.util.Scanner;
public class ExceptionDemo13 {
    static void divide(int a,int b) 
    {
             int c = a/b;
                if(c>5)
                System.out.println("Result : "+c);
            }
            public static void main(String[] args) throws ClassNotFoundException {
                Scanner sc = new Scanner(System.in);
                System.err.println("Enter values of a and b : ");
                int a = sc.nextInt();
                int b = sc.nextInt();            
                
                try{
                
                    // divide(a,b);4

                    throw new ClassNotFoundException("Result Greater than 5"); // not possible in real word
                    }
                     catch(ArithmeticException | ClassNotFoundException e){
                        //     System.out.println("Exception : "+e);
                         }    
                        System.out.println("Aaarti");
       }
}
