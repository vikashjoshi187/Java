import java.util.Scanner;

public class prog_63 {
    // 58) Max Sum in configuration
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int te = max;
            for (int j = 0; j < arr.length; j++) {
}
            if (max > te) {
                te = max;}int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j + 1];}
            arr[s - 1] = temp;
        }
        System.out.println("Max Sum in configuration is "+max);
}
}
