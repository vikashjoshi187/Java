import java.util.Scanner;
public class prog_21 {
    // WAP to check whether entered array is a palindrome or not
    void palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array  ");
        int s=sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the Element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
           int count =0;
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i]==arr[arr.length-1-i]) {
                count++;
            }
        }
        if (count ==arr.length/2) {
            System.out.println("The Array is Palindrome");
            
        }
        else{
            System.out.println("The Array is not Palindrome");
        }
    }
    public static void main(String[] args) {
        prog_21 obj = new prog_21();
        obj.palindrome();
    }

}

