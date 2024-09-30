import java.util.Scanner;
public class prog_22 {
    // WAP showing the concept of Selection sort (Ascending order | Descending order)
    void selectionSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th Size of Array ");
        int s=sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the Element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;   
                }       
            }
        }
        System.out.println("Array Element After Sorting ");
        for (int i = 0; i < arr.length; i++) {
          System.out.print("\t"+arr[i]);
        }System.out.println();
    }
    public static void main(String[] args) {
        prog_22 obj = new prog_22();
        obj.selectionSort();
    }
}