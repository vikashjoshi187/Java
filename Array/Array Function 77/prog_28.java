import java.util.Scanner;

public class prog_28 {
    // 28)WAP to find out the frequency of number 25 from an array
    int s;

    prog_28(int s) {

        this.s = s;
    }

    void countEle() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[s];
        System.out.println("Enter the Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 25) {
                count++;
            }
        }
        System.out.println("The requency of number 25 is " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arr");
        int s = sc.nextInt();
        prog_28 obj = new prog_28(s);
        obj.countEle();
    }
}
