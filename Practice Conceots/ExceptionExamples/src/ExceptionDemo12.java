public class ExceptionDemo12 {
    public static void main(String[] args) {
        
        try{
           Class.forName("vikas");
            System.out.println("class ExceptionDemo15 found");
        }
        
        catch(ClassNotFoundException e){
            System.out.println("class ExceptionDemo15 not found");
            System.out.println("Exception : "+e);
        }
    }
}
