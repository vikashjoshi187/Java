import java.util.Scanner;
public class prog_11 {
    //11)WAP to print even and odd indexing elements separately.
    static Scanner sc = new Scanner(System.in);
    int s, arr[];

    prog_11(int arr[], int s) {
        this.arr = arr;
        this.s = s;
    }
    void marks() {
        System.out.println("Enter the Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void diplay(){
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                System.out.println(arr[i]+" is at odd indexed element in arry");
                
            }
         }
         System.out.println("\n\n");
         for (int i = 0; i < arr.length; i++) {
            if (i%2!=0) {
                System.out.println(arr[i]+" is at even indexed  element in arry");
                
            }
         }
    }
    public static void main(String[] args) {
        System.out.println("Enter th Size of Array");
        int s=sc.nextInt();
        int arr[] = new int[s];
        prog_11 obj = new prog_11(arr, s);
        obj.marks();
        obj.diplay();
    }
}