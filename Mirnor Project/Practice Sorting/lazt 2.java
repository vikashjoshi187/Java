class Singleton{
    static private Singleton instance;
    private Singleton(){}
    static Singleton getInstance()
    {
        System.out.println("\n-----> instance status : "+instance);
        if(instance==null)
        {
            System.out.println("Inside getInstance() inside if : "+instance);
            instance = new Singleton();
        }
        return instance;
    }
 int a=100;
    static void display()
    {
        System.out.println("display method called...");
        System.out.println("instance created : "+instance);
    }
}
class SingletonDemo3
{
    public static void main(String args[])
    {
        Singleton.display();
        Singleton instance = Singleton.getInstance();
        System.out.println("value of a : "+instance.a);

        instance.a += 50;
        System.out.println("value of a : "+instance.a);

        Singleton instance1 = Singleton.getInstance();
        System.out.println("value of acf : "+instance1.a);
    }
}