public class WrapperDemo4 
{
    static void myMethod(int num)
    {
        System.out.println("num : "+num);
    }
    
    
    static void myFun(Integer obj){
        System.out.println("object : "+obj);
    }
    
    
    static void show(Integer x){
        System.out.println("method executes");
    }
    public static void main(String[] args) {

        int num=100;
        Integer obj  = Integer.valueOf(num);
        myMethod(new Integer(200));
        myMethod(obj.valueOf(obj));
        // myFun(200);
        // show(null);
        //how The constructor Integer(int) 
        // has been deprecated since version 9 and marked for removal value of is faster then constructor
    }
}
