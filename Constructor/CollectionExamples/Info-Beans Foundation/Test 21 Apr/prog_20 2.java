import java.util.Scanner;
 class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("aenter size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter arry elemnts");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

}
