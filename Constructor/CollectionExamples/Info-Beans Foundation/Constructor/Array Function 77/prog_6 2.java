import java.util.Scanner;
public class prog_6 {
    //6)WAP to take n number of elements of an array from user and find out the average of all the elements.
    static Scanner sc = new Scanner(System.in);
    int arr[], s;

    prog_6(int arr[], int s) {
        this.arr = arr;
        this.s = s;
    }
    void marks() {
        int sum=0;
        System.out.println("Enter the Element -> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("The average of All the Elements is "+(sum/arr.length));
    }
    public static void main(String[] args) {
        System.out.println("Enter the Size of Array");
        int s=sc.nextInt();
        int arr[] = new int[s];
        prog_6 obj = new prog_6(arr, s);
        obj.marks();
    }
}

