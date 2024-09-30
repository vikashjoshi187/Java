import java.util.Scanner;

public class prog_17 {
    //23)WAP showing the concept of Bubble sort  (Ascending order | Descending order)


    void bubbleSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th size of array");
        int s=sc.nextInt();
        int arr[] = new int[s];

       
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element " + (i + 1));
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

        System.out.println("Element after sorting");
        for (int i = 0; i < arr.length; i++) {
          System.out.print("\t"+arr[i]);
        }
    


    }
    public static void main(String[] args) {
        prog_17 obj = new prog_17();
        obj.bubbleSort();
    }

}


