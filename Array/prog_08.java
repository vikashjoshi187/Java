import java.util.Scanner;

public class prog_08 {
     //2)WAP to set the characters of “Hello Andrew”
    // in an array manually and print it by indexing, for loop, while loop, do while loop and for each loop separately.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = { 'H', 'E', 'L', 'L', 'O', ' ', 'A', 'N', 'D', 'R', 'E', 'W' };
        int i=0;
        do  {
            System.out.print(arr[i]);
            i++;
        }while (i<arr.length);
        System.out.println();

    }
}
