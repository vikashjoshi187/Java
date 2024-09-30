import java.util.*;
public class ArrayListDemo3 
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("isEmpty : "+list.isEmpty());
        System.out.println("size : "+list.size());
        list.add(500); // internally autoboxing
           list.add(new Integer(100));
           
           list.add(Integer.valueOf(200));
           
           Integer i = new Integer(300);
           list.add(i);
           
           list.add(400);
           list.add(500);
           System.out.println("isEmpty : "+list.isEmpty());
           System.out.println("size : "+list.size());
               System.out.println("element : "+list.get(3));
               System.out.println("index : "+list.indexOf(500));
               list.clear();
           System.out.println("Elements : "+list);
    }
}
 