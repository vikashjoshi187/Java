import java.util.Scanner;

public class prog_54 {
    // 49) WAP to compare two array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array-1");
        int s = sc.nextInt();
        System.out.println("Enter size of arry-2");
        int s2 = sc.nextInt();

        System.out.println("Enter elements in 1 array");
        int arr[] = new int[s];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter elements in 2 array");
        int arr2[] = new int[s2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        if (s == s2) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    System.out.println("The array are not same");
                    break;
                }
                count++;

            }
            if (count == s) {
                System.out.println("The array are same");
            }
        }

        else {
            System.out.println("the Arrya are not same");
        }

    }

}
