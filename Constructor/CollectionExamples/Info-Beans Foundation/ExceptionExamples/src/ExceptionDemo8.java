import java.util.Scanner;
public class ExceptionDemo8 {
    static void divide(int a,int b)
    {
        try{
             int c = a/b;
                if(c>5)
                    throw new ClassNotFoundException ("Result Greater than 5"); // not possible in real world
             System.out.println("Result : "+c);
        }catch(ClassNotFoundException e ){
            System.out.println("Exception : "+e);
        }
//        catch(NullPointerException e){
//            System.out.println("Exception : "+e);
//        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();            
        divide(a,b);
       }
}
