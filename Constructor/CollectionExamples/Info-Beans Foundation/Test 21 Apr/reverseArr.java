import java.util.Scanner;

public class reverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter  elments");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Arry Elements Are");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        
        
        
        int temp = 0;
        for (int i = 0; i < (arr.length / 2); i++) {

            temp=arr[i] ;
            arr[i] = arr[arr.length - i-1];
            arr[arr.length - i-1] = temp;
        }



        System.out.println("Arry Elements Are");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
