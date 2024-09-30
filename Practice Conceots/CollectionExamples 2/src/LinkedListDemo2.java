 import java.util.*;
public class LinkedListDemo2 
{
    public static void main(String[] args) {
        LinkedList<Double> list = new LinkedList<>();
//        list.add(45.506);
//        list.addFirst(435.565);
//        list.addLast(245.526);
//        list.add(450.456);
//        list.add(2.546);

//       list.offer(34.415);
//       list.offerFirst(324.455);
//       list.offer(334.454);
//       list.offerLast(344.435);
//       list.offer(345.425);

       list.offer(34.415);
       list.addFirst(334.454);
       list.offerFirst(324.455);
       list.offerLast(344.435);
       list.addLast(345.425);
       list.add(55.654);
 
       Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.print("\t"+itr.next());
        }
        
    }
}
 