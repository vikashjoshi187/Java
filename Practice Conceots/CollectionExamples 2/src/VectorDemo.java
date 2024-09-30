import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>(4);
//        System.out.println("size : "+vec.size());
//        System.out.println("capacity: "+vec.capacity());
//        vec.add(10);
//        vec.add(20);
//        System.out.println("Elements : "+vec);
//        vec.add(100);
//        vec.add(200);
//        System.out.println("Elements : "+vec);
//        System.out.println("size : "+vec.size());
//        System.out.println("capacity: "+vec.capacity());
//        vec.add(300);
//        System.out.println("Elements : "+vec);
//        System.out.println("size : "+vec.size());
//        System.out.println("capacity: "+vec.capacity());

        vec.add(123);
        vec.addElement(323);
        vec.add(333);
        vec.addElement(783);
        vec.add(101);
        
        Enumeration e = vec.elements();
        while(e.hasMoreElements()){
            System.out.print("\t"+e.nextElement());
        }
        // same task can also be perform by Iterator
        
    }
}
