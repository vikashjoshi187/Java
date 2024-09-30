import java.util.Scanner;
public class prog_17 {
//17)WAP to reverse individual elements of an array
static Scanner sc = new Scanner(System.in);
    int s, arr[];
    prog_17(int arr[], int s) {
        this.arr = arr;
        this.s = s;
    }
    int []revArr(){
        int rev=0,rem=0,num;
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
            num = arr[i];
            while (num > 0) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            arr[i] = rev;
            rem = 0;
            rev = 0;
        }
        return arr;
    }
public static void main(String[] args) {
        System.out.println("Enter th Size of Array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        prog_17 obj = new prog_17(arr, s);
        arr=obj.revArr();

        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}