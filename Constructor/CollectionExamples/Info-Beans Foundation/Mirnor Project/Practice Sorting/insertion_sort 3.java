import java.util.Scanner;
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter arry elemnts");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            int j=i;
            while (j>0 && temp<arr[j-1]) {

                arr[j]=arr[j-1];
                j--;
            } 
            arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

}
