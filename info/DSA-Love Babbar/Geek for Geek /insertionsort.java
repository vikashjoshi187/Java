import java.util.Scanner;
public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elemnts of arr");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("array elemnts are");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
        
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }

        System.out.println("array elemnts are");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }

    }

}
