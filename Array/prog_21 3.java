
import java.util.Scanner;

public class prog_21 {
    // 16)WAP to reverse all the elements of an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of number you want to add");
        int num = sc.nextInt();
        int arr[] = new int[num], arr1[] = new int[num];

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = sc.nextInt();

        }




        for (int i = 0; i <arr1.length/2; i++) {
            int t=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=t;

        }


       System.out.println("\n\n\n");
       
       
       
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i]+"\t");

        }


        
        
        
        


    }
}
