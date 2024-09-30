import java.util.Scanner;

public class prog_27 {
    //27)Java Program to Find Maximum Difference Between Two Elements in an Array

    void large_Ele() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element " + (i + 1));
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
            System.out.println("The maximum difference between two elemnts is "+maxd);



    }

    public static void main(String[] args) {
        prog_27 obj = new prog_27();
        obj.large_Ele();
    }

}
