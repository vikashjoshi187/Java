 import java.util.Scanner;
public class prog_33 {
    //29)WAP to find out the frequency of all the elements of an array

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int s = sc.nextInt();

        int arr[] = new int[s];
        int frq[] = new int[arr.length];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nArray elements are : ");
        for (int i = 0; i < s; i++) {
            System.out.print("\t" + arr[i]);
        }
        
        System.out.println("\nArray elements : ");

        int ctd = -1;
        for (int i = 0; i < s; i++) {
            int count = 1;
            for (int j = i + 1; j < s; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frq[j] = ctd;
                }
            }
            if (frq[i] != ctd) {
                frq[i] = count;
                System.out.println("element :-" + arr[i] + "\tFrequency:- " + frq[i]);
            }
        }
    }
}