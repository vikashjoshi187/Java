import java.util.*;
public class ArrayListDemo4 
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("isEmpty : "+list.isEmpty());
        System.out.println("size : "+list.size());
        list.add("500"); // internally autoboxing
           list.add(new String("100"));
        list.add(new String("200"));



        list.add("300");
           
           list.add("400");
           list.add("500");
           
           String sum="";
           for(int j=0;j<list.size();j++){
               sum=sum+list.get(j);
           }
           System.out.println("Sum : "+sum);
    }
}
 