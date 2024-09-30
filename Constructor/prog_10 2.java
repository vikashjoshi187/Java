import java.util.Scanner;
public class prog_10 {
    // 16)WAP to set marks of 5 subjects manually and print it by indexing.
    void marks() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the marks of 5 subjects");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the marks of sub " + (i + 1));
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Marks of sub " + (i + 1) + " is " + arr[i]);
        }
    }
    public static void main(String[] args) {
        prog_10 obj = new prog_10();
        obj.marks();/
    }

}
