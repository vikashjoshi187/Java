import java.util.Scanner;
import java.util.Scanner;
public class prog_28 {
    //22)WAP showing the concept of Selection sort (Ascending order | Descending order)

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arry");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }


        for (int i = 0; i < s ; i++) {
            for (int j = i+1; j < s; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        
        
        System.out.println("Array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }
    
}
