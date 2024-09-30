public class StringDemo8 
{
    public static void main(String[] args) { 
        String str3 = "Hello User How Are You ? ";
        System.out.println("contains : "+str3.contains("user"));
        System.out.println("contains : "+str3.contains("User"));
        boolean status = str3.contentEquals("hello User How Are You ? ");
        System.out.println("status : "+status);
      }
}
