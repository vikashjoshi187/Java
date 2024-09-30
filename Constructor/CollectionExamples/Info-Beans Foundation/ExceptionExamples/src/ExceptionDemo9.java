public class ExceptionDemo9 {
    static String name="Andrew";
//    static String name=" ";
//  static String name="";
//  static String name=null;
//
//    static String name;
    public static void main(String[] args) {
    try{
        System.out.println("length : "+name.length());
        if (name!=null) {
            throw  new ClassNotFoundException();
        }
    }catch(NullPointerException | ClassNotFoundException e ){
        System.out.println("Exception : "+e);
    }
    }
}
