import java.util.Scanner;
public class prog_15 {
    // WAP to count no. Of elements which are the multiple of 10.
    static Scanner sc = new Scanner(System.in);
    int arr[], s;
    prog_15(int arr[], int s) {
        this.arr = arr;
        this.s = s;
    }
    void marks() {
        int count=0;
        System.out.println("Enter the Element  " );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]%10==0) {
                count++;
            }
        }
        System.out.println("The Number of Mutiple of 10 Elements is  "+count);
    }
    public static void main(String[] args) {
        System.out.println("Enter th Size of Array ");
        int s=sc.nextInt();
        int arr[] = new int[s];
        prog_15 obj = new prog_15(arr, s);
        obj.marks();
    }
}