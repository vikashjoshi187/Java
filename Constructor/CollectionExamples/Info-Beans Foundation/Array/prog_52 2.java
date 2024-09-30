import java.util.Scanner;

public class prog_52 {
    // 47) WAP to swap adjacent elements of a one dimensional array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arry");
        int s = sc.nextInt();

        int arr[] = new int[s];
        System.out.println("Enter the elemens of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\n\n");

        if (s % 2 != 0) {
            s = s - 1;
        }

        for (int i = 0; i < s; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}



//1 2 3 4 5 
//2 1 4  3 5 