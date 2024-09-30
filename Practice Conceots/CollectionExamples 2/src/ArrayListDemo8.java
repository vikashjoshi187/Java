import java.util.*;
public class ArrayListDemo8 
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(32);
        list.add(3);
        list.add(567);
        list.add(-2);
        
//        System.out.println("Elements : "+list);
//        System.out.println("minimum element : "+Collections.min(list));
//        System.out.println("maximum element : "+Collections.max(list));
//        Collections.shuffle(list);
//        System.out.println("shuffle elements : "+list);
//        Collections.reverse(list);
//        System.out.println("reverse elements : "+list);
        Collections.sort(list);
        System.out.println("sorted elements : "+list);

    }
}
 