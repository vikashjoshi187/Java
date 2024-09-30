import java.util.Scanner;
public class prog_37 {
    // Java Program to Find Maximum Difference Between Two Elements in an Array
    void large_Ele() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array  ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the Element  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxd = 0;
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    if ((arr[j] - arr[j2]) > maxd) {
                        maxd = arr[j] - arr[j2];
                    }
                }
            }
            System.out.println("The Maximum Difference Between Two Elements is "+maxd);
    }
    public static void main(String[] args) {
        prog_37 obj = new prog_37();
        obj.large_Ele();
    }
}