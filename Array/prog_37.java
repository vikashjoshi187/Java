import java.util.Scanner;
public class prog_37 {
    // 32)WAP to search an element from an array using Binary search
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int s = sc.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a elemnt for search");
        int vl = sc.nextInt();
        // int mid = 0;
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            // 0 1 2 3 4 
            // 1 2 3 4 5
            

            int mid = (low + high) / 2;
            if (arr[mid]== vl) {
                System.out.println("the index of element is " + mid);
                System.exit(6);
            } 
            else if (vl > arr[mid]) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }
        if (low>high) {
            System.out.println("No such element in array");
            
        }
    }
}