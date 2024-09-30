import java.util.Scanner;

public class prog_06 {
     //2)WAP to set the characters of “Hello Andrew”
    // in an array manually and print it by indexing, for loop, while loop, do while loop and for each loop separately.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = { 'H', 'E', 'L', 'L', 'O', ' ', 'A', 'N', 'D', 'R', 'E', 'W' };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

    }
}
