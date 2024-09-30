import java.util.Scanner;
public class prog_36 {
   // 31)WAP to search an element from an array using Linear search
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int el=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==el) {
                System.out.println("The index of element in the array is "+i);
                System.exit(s);
            }
        }
        System.out.println("The entered element does not exist in the array");
    }
    
}
