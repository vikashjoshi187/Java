import java.util.Scanner;

public class prog_16 {
    //22)WAP showing the concept of Selection sort (Ascending order | Descending order)


    void selectionSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th size of array");
        int s=sc.nextInt();
        int arr[] = new int[s];

       
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element " + (i + 1));
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

        System.out.println("Element after sorting");
        for (int i = 0; i < arr.length; i++) {
          System.out.print("\t"+arr[i]);
        }
    


    }
    public static void main(String[] args) {
        prog_16 obj = new prog_16();
        obj.selectionSort();
    }

}


