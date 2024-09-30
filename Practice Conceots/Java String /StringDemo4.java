public class StringDemo4 
{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "HELLO";
        String s3 = "welcome";
        String s4 = "              Thank       You             ";
        String s5 = "Hello user Bye user";
        
        System.out.println("length : "+s1.length());
        System.out.println("lowercase : "+s2.toLowerCase());
        System.out.println("uppercase : "+s3.toUpperCase());
        System.out.println("$"+s4+"$");
        System.out.println("trim : "+"$"+s4.trim()+"$");
        System.out.println("charAt(2) : "+s1.charAt(2));
        System.out.println("indexOf('L') : "+s2.indexOf('L'));
        System.out.println("lastIndexOf('L') : "+s2.lastIndexOf('L'));
        System.out.println("indexOf : "+s5.indexOf("user"));
        System.out.println("indexOf : "+s5.indexOf("user",10));
        System.out.println("indexOf : "+s5.indexOf("User",10));
    }
}
