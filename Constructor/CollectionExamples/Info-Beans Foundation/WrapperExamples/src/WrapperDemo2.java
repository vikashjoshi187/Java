public class WrapperDemo2 
{
    public static void main(String[] args) {
        // converting primitive datatype into object
        String num = "2000";
        Integer obj  = Integer.valueOf(num);
        System.out.println("Value : "+num+"\nobject : "+obj);
        
        String res = obj.toString();
        System.out.println("res : "+res);
       
        int result = Integer.valueOf("222", 3);
//                    1x2^2 + 1x2^1 + 1x2^0
//                         4 + 2 + 1
//                             7
        System.out.println("result : "+result);
    }
}
