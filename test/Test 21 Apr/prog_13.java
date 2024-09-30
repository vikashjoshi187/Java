import java.util.Scanner;

public class prog_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num, count = 0;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        temp = num;
        int arr[] = new int[count];
        
        int i = 0;

        while (temp > 0) {
            int rem = temp % 10;
            arr[i] = rem;
            temp = temp / 10;
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
           System.out.println("element at Position " + count + " is  " + arr[j]);
            count--;
        }

    }
}
