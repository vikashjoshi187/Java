
import java.util.Scanner;

public class prog_25 {
    // 19)WAP to remove an element at specific index in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thesixze of array ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter elements od array");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the inxex for delete element");
        int i=sc.nextInt();
        
        for (int j =i; j <s-1 ; j++) {
        
            arr[j]=arr[j+1];
            
        }
        
        
        for (int j = 0; j < arr.length-1; j++) {
            System.out.print(arr[j]+"\t");
            
        }

    }
}
