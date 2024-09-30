import java.util.Scanner;

public class prog_18 {
    //24)WAP to find out the largest element from an array
    void large_Ele() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th size of array");
        int s=sc.nextInt();
        int arr[] = new int[s];

       
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element " + (i + 1));
            arr[i] = sc.nextInt();
        }
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("The largest Element int he array is "+max);


    


    }
    public static void main(String[] args) {
        prog_18 obj = new prog_18();
        obj.large_Ele();
    }

}


