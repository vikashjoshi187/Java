import java.util.*;
public class StackExample2 
{
    public static void display(Stack<Integer> stack){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements : ");
        int size = sc.nextInt();
        
        System.out.println("Enter elements : ");
        System.out.println(stack);
        for(int i=0;i<size;i++){
            stack.addElement(sc.nextInt());
            System.out.println(stack);
        }
        
        System.out.println("no. of pop required : "+stack.search(30));
        
        System.out.println("Element after pop : ");
        System.out.println(stack);
        for(int i=0;i<size;i++){
            stack.pop();
            System.out.println(stack);
        }
        
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        display(stack);
    }
}
