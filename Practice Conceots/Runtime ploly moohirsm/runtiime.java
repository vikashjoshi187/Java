class Parent
{
    String name="vikas";
    void showData()
    {
        System.out.println("show method of Parent class called..!!");
    }
}
class Child extends Parent
{
    String name="vikas Joshi";
    @Override // annotation
    void showData()
    {
        System.out.println("show method of Child class called..!!");
        super.showData();
    }
}
class Overriding1
{
    public static void main(String args[])
    {
        Parent obj = new Child(); // upcasting
        obj.showData();
        Child obj =new Child();
       System.out.println( obj.name);
       
    }
}