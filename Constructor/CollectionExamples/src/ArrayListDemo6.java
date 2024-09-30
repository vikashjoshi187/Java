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
  
        Integer arr[]=new Integer[56];



        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        list.addAll(arr, list);

        System.out.println(list);

        //         // Method-5
        // System.out.println("Elements in forward direction : ");
        // ListIterator itr = list.listIterator();
        // while(itr.hasNext()){
        //     System.out.print("\t"+itr.next());
        // }
     //coursor history
        // System.out.println("\nElements in backward direction : ");
        // while(itr.hasPrevious()){
        //     System.out.print("\t"+itr.previous());
        // }

    }
}
