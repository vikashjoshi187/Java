import java.util.Scanner;
public class prog_27 {
//27)WAP to find out the second smallest element from an array

    void prog() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array  ");
        int s=sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the Element  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println("The smallest Element in the Array is "+max);
    }
    public static void main(String[] args) {
        prog_27 obj = new prog_27();
        obj.prog();
    
    }
}