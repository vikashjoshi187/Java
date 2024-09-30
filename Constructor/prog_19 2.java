import java.util.Scanner;

public class prog_19 {
    // 25)WAP to search an element from an array using Linear search
    void large_Ele() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of searching");
        int ele = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                System.out.println("The entered number is present ar the " + i + " index in the array");
                break;
            }
        }

    }

    public static void main(String[] args) {
        prog_19 obj = new prog_19();
        obj.large_Ele();
    }

}
