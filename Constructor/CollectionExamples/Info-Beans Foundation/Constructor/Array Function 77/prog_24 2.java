import java.util.Scanner;
public class prog_24 {
    // 24)WAP to find out the largest element from an array
    void large_Ele() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array  ");
        int s=sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the Element -> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The Largest Element in the Array is  "+max);
    }
    public static void main(String[] args) {
        prog_24 obj = new prog_24();
        obj.large_Ele();
    }
}