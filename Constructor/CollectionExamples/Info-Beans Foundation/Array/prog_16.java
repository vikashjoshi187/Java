import java.util.Scanner;

public class prog_16 {
    // 11)WAP to print even and odd indexing elements separately.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of number you want to add");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter numver " + i);
            arr[i] = sc.nextInt();
         }

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
}
