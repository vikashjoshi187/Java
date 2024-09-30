import java.util.*;
public class ArrayListDemo5 
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500); // internally autoboxing
           list.add(new Integer(100));
           
           list.add(Integer.valueOf(200));
             
           Integer i = new Integer(300);
           list.add(i);
           
           list.add(400);
           list.add(500);
           System.out.println("Element : "+list);
           //list.remove(2);
           list.remove(new Integer(500));
           System.out.println("Element : "+list);
           
    }
}
 