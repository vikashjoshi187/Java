import java.util.Scanner;

public class prog_21 {
//21)WAP to check whether entered array is a palindrome or not

    void palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th size of array");
        int s=sc.nextInt();
        int arr[] = new int[s];

       
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element " + (i + 1));
            arr[i] = sc.nextInt();
        }
           int count =0;
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i]==arr[arr.length-1-i]) {
                count++;
            }
        }
        if (count ==arr.length/2) {
            System.out.println("The array is palindrome");
            
        }
        else{
            System.out.println("The array is not palindrome");

        }


    }
    public static void main(String[] args) {
        prog_21 obj = new prog_21();
        obj.palindrome();
    }

}

