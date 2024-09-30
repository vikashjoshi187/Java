import java.util.Scanner;

public class merg_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arry 1");
        int s1 = sc.nextInt();
        System.out.println("enter the size of arry 2");
        int s2 = sc.nextInt();

        int arr1[] = new int[s1];
        int arr2[] = new int[s2];
        int arr3[] = new int[s1 + s2];

        System.out.println("Enter elements in arr 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements in arr 2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int i = 0, j = 0, k = 0;

        while (i < s1 && j < s2) {

            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i<s1) {

            arr3[k]=arr1[i];
            i++;
            k++;
        }

        while (j<s2) {

            arr3[k]=arr2[j];
            j++;
            k++;
        }




        for (int m = 0; m < arr3.length; m++) {
            System.out.print("\t" + arr3[m]);
        }

    }

}