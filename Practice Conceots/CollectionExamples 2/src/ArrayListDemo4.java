import java.util.*;
public class ArrayListDemo4 
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
           
           int sum=0;
           for(int j=0;j<list.size();j++){
               sum = sum + list.get(j);
           }
           System.out.println("Sum : "+sum);
    }
}
 