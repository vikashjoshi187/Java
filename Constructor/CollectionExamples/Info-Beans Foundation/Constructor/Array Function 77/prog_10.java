import java.util.Scanner;
public class prog_10 {
    //WAP to take n number of elements of an array from user and find out the sum of odd elements.
    static Scanner sc = new Scanner(System.in);
    int s, arr[];

    prog_10(int arr[], int s) {
        this.arr = arr;
        this.s = s;
    }
    void marks() {
        int sum=0;
        System.out.println("Enter the Element -> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]%2!=0) {
                sum=sum+arr[i];
            }
        }
        System.out.println("The Sum of all Odd Elements is "+sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter th Size of Array ");
        int s=sc.nextInt();
        int arr[] = new int[s];
        prog_10 obj = new prog_10(arr, s);
        obj.marks();
    }
}