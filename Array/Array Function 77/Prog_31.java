import java.util.Scanner;
public class Prog_31 {
    // WAP to search an element from an array using Linear search
    void large_Ele() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array  ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the Element  " );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number of Searching  ");
        int ele = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                System.out.println("The Entered Number is present at " + i + " Index in the Array.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Prog_31 obj = new Prog_31();
        obj.large_Ele();
    }
}