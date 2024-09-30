import java.util.Scanner;

public class prog_26 {
    // 20)WAP to merge two arrays
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter sizse of array-1");
        int s = sc.nextInt();
        System.out.println("enter size of array-2");
        int s2 = sc.nextInt();
        int arr1[] = new int[s + s2];
        System.out.println("Enter elemntes for array 1");
        for (int i = 0; i < s; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[s2];
        System.out.println("Enter elemntes for array 2");

        for (int i = 0; i < s2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        
        for (int i = s,t=0; i < arr1.length; i++,t++) {
            arr1[i] = arr2[t];
        }

        
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
            
        }

    }
}
