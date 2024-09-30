import java.util.Scanner;
public class prog_34 {
    //28)WAP to find out the frequency of number 25 from an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("enter the elements of array");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 25) {
                count++;
            }
        }
        System.out.println("The requency of number 25 is " + count);
    }
}
