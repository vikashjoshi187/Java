import java.util.*;
import java.util.Scanner;
public class ArrayListDemo6 
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of  elements :");
        int num = sc.nextInt();
        
        System.out.println("Enter elements : ");
        for(int i=0;i<num;i++)
        {
            list.add(sc.nextInt());
        }
        // Method-1
            //System.out.println("Elements : "+list);
        
        //Method-2
//        System.out.println("Elements are : ");
//        for(Integer i : list)
//        {
//            System.out.print("\t"+i);
//        }

//        System.out.println("Elements are : ");
//        for(int i : list)
//        {
//            System.out.print("\t"+i);
//        }

        // Method-3
//        System.out.println("Elements are : ");
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.print("\t"+itr.next());
//        }

 //        Method-4
//        System.out.println("Elements are : ");
//        for(Iterator itr = list.iterator();itr.hasNext();){
//            System.out.print("\t"+itr.next());
//        }

                // Method-5
        System.out.println("Elements in forward direction : ");
        ListIterator itr = list.listIterator();
        while(itr.hasNext()){
            System.out.print("\t"+itr.next());
        }

        System.out.println("\nElements in backward direction : ");
        while(itr.hasPrevious()){
            System.out.print("\t"+itr.previous());
        }

    }
}
 