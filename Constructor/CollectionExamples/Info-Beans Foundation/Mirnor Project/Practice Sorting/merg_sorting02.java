import java.util.Scanner;

public class merg_sorting02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arry 1");
        int s1 = sc.nextInt();

        int arr1[] = new int[s1];
        int arr2[] = new int[s1];

        System.out.println("Enter elements in arr 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int i = 0, j = (s1 / 2) + 1, k = 0;

        while (i <= (s1 / 2) && j < arr1.length) {
            if (arr1[i] < arr1[j]) {
                arr2[k++] = arr1[i++];

            } else {
                arr2[k++] = arr1[j++];

            }
        }
        while (i <= (s1 / 2)) {
            arr2[k++] = arr1[i++];

        }

        while (j < s1) {
            arr2[k++] = arr1[j++];

        }
for (int m = 0; m < arr2.length; m++) {
            System.out.print("\t" + arr2[m]);
        }
    }
}