import java.util.Scanner;
public class prog_43 {
    // 38)Java Program to Print Next Greater Element in Array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size array");
        int s = sc.nextInt();
        int arr[] =new int [s];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    System.out.println("The next freater element for "+arr[i]+" is "+arr[j]);
                    break;
                }
        }

        }
    }
}
