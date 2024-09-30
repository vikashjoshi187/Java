import java.util.*;
public class SetDemo1 
{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(200);
        set.add(null);
        set.add(5);
        set.add(100);
        set.add(null);
        set.add(200);
        
        System.out.println("Elements : "+set);
    }
}
