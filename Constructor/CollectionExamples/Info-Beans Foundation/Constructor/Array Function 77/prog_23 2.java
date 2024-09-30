import java.util.Scanner;
public class prog_23 {
    // WAP showing the concept of Bubble sort (Ascending order | Descending order)
    void bubbleSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int s=sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the Element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;   
                }
            }
        }
        System.out.println("Array Element After Sorting ");
        for (int i = 0; i < arr.length; i++) {
          System.out.print("\t"+arr[i]);
        }System.out.println();
    }
    public static void main(String[] args) {
        prog_23 obj = new prog_23();
        obj.bubbleSort();
    }
}