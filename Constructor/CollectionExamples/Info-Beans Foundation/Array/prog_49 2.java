import java.util.Scanner;
public class prog_49 {
    // 44) Java Program to Find Union and Intersection of Two Arrays
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sze array 1");
        int s1 = sc.nextInt();
        System.out.println("Enter the size of array 2");
        int s2 = sc.nextInt();

        int arr1[] = new int[s1+s2];
        System.out.println("Enter elements in arry 1");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[s2];
        System.out.println("Enter elements in arry 2");
        for (int i = 0; i < s2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        for (int i = s1,t=0; i < arr1.length; i++,t++) {
            arr1[i]=arr2[t];
            }

            System.out.println("\nThe array after union");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print("\t" + arr1[i]);
            }
            
            
            int frequency[]=new int[arr1.length];
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
                    System.out.print(arr1[i]+"\t");
                }
            }System.out.println();
        
    
sc.close();;
    }

}
