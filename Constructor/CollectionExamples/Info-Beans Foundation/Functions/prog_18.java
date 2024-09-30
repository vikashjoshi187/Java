import java.util.Scanner;

public class prog_18 {
    // 18)WAP to take n number of elements of an array from user and find out the sum of all the elements.

    void marks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=sc.nextInt();
        int arr[] = new int[s];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element " + (i + 1));
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("The sum of all the elemnts is "+sum);

    }
    public static void main(String[] args) {
        prog_18 obj = new prog_18();
        obj.marks();
    }

}
