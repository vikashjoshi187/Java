import java.util.Scanner;

public class prog_14 {
    //  WAP to take n number of elements of an array from user and find out the sum of even elements.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of number you want to add");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter numver "+i);
            arr[i] = sc.nextInt();
            if (arr[i]%2==0) {
                sum = sum + arr[i]; 
            }
        }
        System.out.println("\n\n");
System.out.println("The sum of al even elemnts is "+sum);

    }
}
