import java.util.Scanner;

public class prog_27 {
    // 21)WAP to check whether entered array is a palindrome or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array-1");
        int s = sc.nextInt();
        int arr1[] = new int[s];

        System.out.println("Enter elements of array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();

        }

        int i = 0;
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr1[arr1.length - i - 1]) {
                break;
            }

        }
        if (i >= arr1.length) {
            System.out.println("IT IS A PALINDROM ARRAY");

        } else {
            System.out.println("IT IS NOT A PALINDROM ARRAY");

        }

    }
}
