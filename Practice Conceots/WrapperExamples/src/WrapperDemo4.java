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
        myMethod(new Integer(100));
        myFun(200);
        show(null);
    }
}
