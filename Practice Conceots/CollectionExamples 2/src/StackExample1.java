import java.util.*;
public class StackExample1 
{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("size : "+stack.size()+"\ncapacity : "+stack.capacity());
        System.out.println(stack);
        stack.add(123);
        System.out.println(stack);
        stack.add(null);
        System.out.println(stack);
        stack.add(323);
        System.out.println(stack);
        stack.add(423);
        System.out.println(stack);
        stack.add(523);
        System.out.println(stack);
                System.out.println("size : "+stack.size()+"\ncapacity : "+stack.capacity());

        System.out.println("remove element : "+stack.pop());
        System.out.println(stack);
        System.out.println("remove element : "+stack.pop());
        System.out.println(stack);
        System.out.println("remove element : "+stack.pop());
        System.out.println(stack);
        System.out.println("remove element : "+stack.pop());
        System.out.println(stack);
        System.out.println("remove element : "+stack.pop());
        System.out.println(stack);
        System.out.println("size : "+stack.size()+"\ncapacity : "+stack.capacity());
        
        
    }
}
