import java.util.Scanner;
//30)WAP to find out the element which have highest frequency.

public class prog_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int count = 0, t = 0, vl = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (t < count) {
                t = count;
                vl = i;
            }
            count = 0;

        }
        System.out.println("The element with highest frequency " + arr[vl] + "\nThe frequency is " + t);

    }
}
