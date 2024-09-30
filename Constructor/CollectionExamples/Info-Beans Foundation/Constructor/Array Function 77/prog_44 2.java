import java.util.Scanner;

public class prog_44 {
    // 44) Java Program to Find Union and Intersection of Two Arrays
    static Scanner sc = new Scanner(System.in);
    int arr1[], arr2[], s1, s2;

    prog_44(int arr1[], int s1, int arr2[], int s2) {
        this.arr1 = arr1;
        this.s1 = s1;

        this.arr2 = arr2;
        this.s2 = s2;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the Array Elements in array 2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

    }

    void union() {
        for (int i = s1, t = 0; i < arr1.length; i++, t++) {
            arr1[i] = arr2[t];
        }

        System.out.println("\nThe array after union");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("\t" + arr1[i]);
        }

        int frequency[] = new int[arr1.length];
        int counted = -1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    frequency[j] = counted;
                }
            }
        }
        System.out.println("\nArray After Removing Duplicate Elements ");
        for (int i = 0; i < arr1.length; i++) {
            if (frequency[i] != counted) {
                System.out.print(arr1[i] + "\t");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array 1");
        int s1 = sc.nextInt();
        System.out.println("Enter the Size of Array 2");
        int s2 = sc.nextInt();
        
        int arr1[] = new int[s1+s2];
        int arr2[] = new int[s2];
        prog_44 obj = new prog_44(arr1, s1, arr2, s2);
        obj.getElement();
        obj.union();

    }
}
