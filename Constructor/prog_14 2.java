import java.util.Scanner;

public class prog_14 {
//20)WAP to count no. Of elements which are the multiple of 10.

    void marks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th size of array");

        int s=sc.nextInt();
        int arr[] = new int[s];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element " + (i + 1));
            arr[i] = sc.nextInt();
            if (arr[i]%10==0) {
                
                count++;
            }
        }
        System.out.println("The number of mutiple of 10 elements is "+count);

    }
    public static void main(String[] args) {
        prog_14 obj = new prog_14();
        obj.marks();
    }

}

