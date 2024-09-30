import java.util.Scanner;
public class prog_29 {
    //23)WAP showing the concept of Bubble sort  (Ascending order | Descending order)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arry");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }


        for (int i = 0; i < s-1 ; i++) {
            for (int j = 0; j < s-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
