import java.util.Scanner;
public class prog_8 {
    //8)WAP to take n number of elements of an array from user and find out the sum of odd indexing elements.
    static Scanner sc = new Scanner(System.in);
    int arr[], s;

    prog_8(int arr[], int s) {
        this.arr = arr;
        this.s = s;
    }
    void marks() {
        int sum=0;
        System.out.println("Enter the Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i%2!=0) {
                
                sum=sum+arr[i];
            }
        }
        System.out.println("The Sum of All the Odd Indexing Elements is "+sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter the Size of Array ");
        int s=sc.nextInt();
        int arr[] = new int[s];
        prog_8 obj = new prog_8(arr, s);
        obj.marks();
    }
}