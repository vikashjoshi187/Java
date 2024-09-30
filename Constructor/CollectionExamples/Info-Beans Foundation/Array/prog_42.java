import java.util.Scanner;
public class prog_42 {
    // 37)Java Program to Find Maximum Difference Between Two Elements in an Array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size array");
        int s = sc.nextInt();
        int arr[] =new int [s];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int maxd=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (maxd<arr[i]-arr[j]) {
                    maxd=arr[i]-arr[j];
                }
            }
        }
        System.out.println("The xi muimum difference between two elements is "+maxd);
    }
}
