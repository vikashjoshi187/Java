
import java.util.Scanner;

public class prog_24 {
    // 18)WAP to insert an element at specific index in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thesixze of array ");
        int s = sc.nextInt();
        int arr[] = new int[s + 1];
        System.out.println("Enter elements od array");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the inxex for new element");
        int i=sc.nextInt();
        System.out.println("Enter the value");
        int vl=sc.nextInt();
        
        for (int j =s-1; j >= i; j--) {
        
            arr[j+1]=arr[j];
            
        }
        arr[i]=vl;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"\t");
            
        }

    }
}
