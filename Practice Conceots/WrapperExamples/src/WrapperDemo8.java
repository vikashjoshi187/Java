public class WrapperDemo8 
{
    public static void main(String[] args) {
        String str1 = Integer.toString(100);
        Integer obj = new Integer("200");
        String str2 = obj.toString();
        
        System.out.println("sum : "+str1+str2); // 100200
        System.out.println("sum : "+(str1+str2)); // 100200

    }
}






