import java.util.Scanner;
// WAP to take n number of elements of an array and find out the sum of first and last element of an array.
public class prog_4 {
    static Scanner sc = new Scanner(System.in);
    int s,arr[];
    prog_4(int arr[], int size){
        this.arr = arr;
        s = size;
    }
    void marks() {
        System.out.println("Enter the Element -> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Sum of First and Last Element is -> " + (arr[0] + arr[arr.length - 1]));
    }
    public static void main(String[] args) {
        System.out.println("Enter th Size of Array ->");
        int s=sc.nextInt();
        int arr[] = new int[s];
        prog_4 obj = new prog_4(arr,s);
        obj.marks();
    }
}