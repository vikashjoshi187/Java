public class ExceptionDemo11 {
    public static void main(String[] args) {
        
        Object obj  = new String("100");
           try{
                    Integer str = (Integer)obj;
                    System.out.println(str);

           }catch(ClassCastException e){
               System.out.println("Exception : "+e);
           }
    }
}
