public class WrapperDemo3 
{
    public static void main(String[] args) {
        int num=100;
        Integer obj = num; // autoboxing
        System.out.println("value : "+num);
        System.out.println("object : "+obj);
        
        int num1 = obj; // unboxing
        System.out.println("num1 : "+num1);
        
    }
}
