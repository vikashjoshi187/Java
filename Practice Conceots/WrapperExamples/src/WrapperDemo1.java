public class WrapperDemo1 
{
    public static void main(String[] args) {
        // converting primitive datatype into object
        int num=100;
//        Integer obj  = Integer.valueOf(num);
        Integer obj  = new Integer(num);
        System.out.println("Value : "+num+"\nobject : "+obj);
        
        // converting object into primitive datatype
        int value = obj.intValue();
        System.out.println("\nValue : "+value);
    }
}
