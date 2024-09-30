// program showing the concept of StringBuffer
public class StringDemo11 
{
    public static void main(String[] args) { 
        String str = "Hello";
       // StringBuffer sb = new StringBuffer(str);
         StringBuilder sb = new StringBuilder(str);
        
        sb.append("  Andrew Mathew");
        System.out.println("append : "+sb);

        sb.insert(6, "Mathew");
        System.out.println("insert : "+sb);

        sb.replace(6,12,"Simon");
        System.out.println("replace : "+sb);

        sb.delete(5,11);
        System.out.println("delete : "+sb);
        
        sb.reverse();
        System.out.println("reverse : "+sb);
        
        System.out.println("capacity : "+sb.capacity());
    }
}
