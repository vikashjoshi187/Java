import java.util.*;
public class SetDemo2 
{   
    public static void main(String[] args) {
     HashSet<String> fruitmarket = new HashSet<>();
     LinkedHashSet<String> fruitstore = new LinkedHashSet<>();
     TreeSet<String> fruitbuzz = new TreeSet<>();

     for(String fruit : Arrays.asList("mango","apple","orange")){///Arrays.aslist doubt
         fruitmarket.add(fruit);
         fruitstore.add(fruit);
         fruitbuzz.add(fruit);
     }
     
        System.out.println("HashSet : "+fruitmarket);
        System.out.println("LinkedHashSet : "+fruitstore);
        System.out.println("TreeSet : "+fruitbuzz);

    }
}
