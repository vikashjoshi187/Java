
    import java.util.Scanner;
    class prog_58 {
        //53) Find common elements in three sorted arrays.
//Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array 1 ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the sorted elements of the array 1 ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the size of the array 2 ");
            int size1 = sc.nextInt();
            int[] arr1 = new int[size1];
            System.out.println("Enter the sorted elements of the array 2 ");
            for (int i = 0; i < size1; i++) {
                arr1[i] = sc.nextInt();
            }
            System.out.print("Enter the size of the array 3 ");
            int size2 = sc.nextInt();
            int[] arr2 = new int[size2];
            System.out.println("Enter the sorted elements of the array 3 ");
            for (int i = 0; i < size2; i++) {
                arr2[i] = sc.nextInt();
            }
            System.out.println("Common Elemen s");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size1; j++) {
                    for (int k = 0; k < size2; k++) {
                        if (arr[i] == arr1[j])
                            if (arr[i] == arr2[k])
                                System.out.print(arr[i] + "\t");
                    }
                }
            }System.out.println();
        }
    }