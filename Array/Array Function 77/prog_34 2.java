import java.util.Scanner;
class prog_34 {
    /* Progman showing concept of insertion sort. */
    void insertion_Sort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th Size of Array -> ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the Element -> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = (arr[i]);
            int j = i - 1;
            while (j >= 0 && (arr[j]) > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println("Array Element After Insertion Sort -> ");
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+"\t");
        }System.out.println();
    }
    public static void main(String[] args) {
        prog_34 obj = new prog_34();
        obj.insertion_Sort();
    }
}