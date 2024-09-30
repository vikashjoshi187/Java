import java.util.Scanner;
public class prog_51 {
    //46) WAP to replace all EVEN elements by 0 and Odd by 1 in One Dimensional Array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("ENter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}
